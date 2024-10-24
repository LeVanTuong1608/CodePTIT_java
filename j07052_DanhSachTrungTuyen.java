/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.*;
import java.text.*;
import java.util.*;
import java.io.*;
/**
 *
 * @author admin
 * 
 */

public class j07052_DanhSachTrungTuyen {
   // public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args)throws FileNotFoundException{
        Scanner sc = new Scanner(new File("THISINH.in"));
        int test = Integer.parseInt(sc.nextLine());
        List<Student> students = new ArrayList<>();
        while(test-->0){
            students.add(new Student(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(students);
        int n = Integer.parseInt(sc.nextLine());
        double mark = students.get(n-1).getSumMark();
        for (Student student : students){
            if (student.getSumMark()>= mark){
                student.setStatus("TRUNG TUYEN");
              
            }
            else student.setStatus("TRUOT");
        }
        System.out.println(String.format("%.1f", mark));
        for (Student student: students){
            System.out.println(student);
        }
    }
    
}
class Student implements Comparable<Student>{
    private String id;
    private String name;
    private double toan;
    private double ly;
    private double hoa;
    private String status;

    public Student(String id, String name, double toan, double ly, double hoa) {
        this.id = id;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        name = name.trim().replaceAll("\\s+"," ");
        String[] tmp = name.split(" ");
        name= "";
        for(int i=0;i<tmp.length;i++){
            name+= Character.toUpperCase(tmp[i].charAt(0))+ tmp[i].substring(1).toLowerCase()+" ";
            
        }
        name = name.trim();
        return name;
    }

    public double getSumMark(){
        return toan*2 +ly + hoa + getDiemCong(); 
    }
    
    public double getDiemCong(){
        String s = id.substring(0,3);
        switch (s){
            case"KV1":
                return 0.5;
            case "KV2":
                return 1.0;
            case "KV3":
                return 2.5;
            default: return 0;
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public static  String removeZero(double so){
        DecimalFormat format = new DecimalFormat("#.###");
        return format.format(so);
    }
    @Override
    public String toString() {
        return id+" "+getName()+" "+ removeZero(getDiemCong())+" "+removeZero(getSumMark())+" "+ getStatus();
        
    }

    @Override
    public int compareTo(Student o) {
         if (this.getSumMark() == o.getSumMark()){
             return this.getId().compareTo(o.getId());
         }
         return this.getSumMark() < o.getSumMark() ? 1 : -1;
    }
    
    
    
    
}
