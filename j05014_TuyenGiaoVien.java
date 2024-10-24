/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author admin
 */
import java.util.*;
import java.text.*;

class Teacher{
    private int id;
    private String name;
    private String mm;
    private double diem_tin;
    private double diem_chuyen;

    public Teacher(int id, String name, String mm, double diem_tin, double diem_chuyen) {
        this.id = id;
        this.name = name;
        this.mm = mm;
        this.diem_tin = diem_tin;
        this.diem_chuyen = diem_chuyen;
    }

    public String getId() {
        return String.format("GV%02d", id);
    }
    public String getMon(){
        String s = mm.substring(0,1);
        switch(s){
            case "A":return "TOAN";
            case "B":return "LY";
            case "C":return "HOA";
            default: return "SAI ROI CU";
        }
    }
    public double diemUuTien(){
        int diemm = Integer.parseInt(mm.substring(1,2));
        switch (diemm){
            case 1: return 2.0;
            case 2: return 1.5;
            case 3: return 1.0;
           // case 4: return 0.0;
            default: return 0.0;
        }
    }
    public double getDiemTong(){
        return diem_tin *2 + diem_chuyen +diemUuTien();
      
    }
    public String getVao(){
        if (getDiemTong() >= 18){
            return "TRUNG TUYEN";
        }
        return "LOAI";
    }
    @Override
    public String toString() {
        return (getId()+" "+name+" "+getMon()+" "+String.format("%.1f",getDiemTong())+" "+ getVao());
        //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
    
}

public class j05014_TuyenGiaoVien {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int test = sc.nextInt();
        List<Teacher> teachers = new ArrayList<>();
        for (int i =0;i<test;i++){
            sc.nextLine();
            teachers.add(new Teacher(i+1,sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble()));
        }
        Collections.sort( teachers , new Comparator<Teacher>(){
             
            public int compare(Teacher o1,Teacher o2){
                if (o1.getDiemTong() == o2.getDiemTong()){
                    return o1.getId().compareTo(o2.getId());
                }
                return o1.getDiemTong() < o2.getDiemTong()? 1 : -1;
            }
        });
        for (Teacher teacher : teachers){
            System.out.println(teacher);
        }
        
    }
}
