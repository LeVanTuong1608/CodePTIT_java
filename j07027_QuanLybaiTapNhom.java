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
import java.io.*;
import java.math.*;
import java.lang.*;
import java.time.*;
import java.text.*;


public class j07027_QuanLybaiTapNhom {
    public static  class Student{
        private String code,name,Phone_Number;

        public Student(String code, String name, String Phone_Number) {
            this.code = code;
            this.name = name;
            this.Phone_Number = Phone_Number;
        }

        @Override
        public String toString() {
            return code+" "+name+" "+Phone_Number;
            //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
        
    }
    
    public static class Exercise{
        private String Project_Name;

        public Exercise(String Project_Name) {
            this.Project_Name = Project_Name;
        }

        @Override
        public String toString() {
            return Project_Name;
            //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
        
    }
    
    public static class Group{
        private String code;
        private Integer number;
        private Student s;
        private Exercise e;

        public Group(String code,Student s, Exercise e,Integer number) {
            this.code = code;
            this.s = s;
            this.e = e;
            this.number = number;
        }

        @Override
        public String toString() {
            return s+" "+number+" "+e;
            //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("test/bai1/SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("test/bai1/BAITAP.in"));
        Scanner sc3 = new Scanner(new File("test/bai1/NHOM.in"));
        Map<String,Student> mp = new HashMap<>();
        Map<Integer,Exercise> bt = new HashMap<>();
        List<Group> gr = new ArrayList<>();
        int n = Integer.parseInt(sc1.nextLine());
        for(int i=1;i<=n;i++){
            String code,name,Number_Phone;
            code = sc1.nextLine();
            name = sc1.nextLine();
            Number_Phone = sc1.nextLine();
            Student e = new Student(code,name,Number_Phone);
            mp.put(code,e);
        }
        n = Integer.parseInt(sc2.nextLine());
        for (int i=1;i<=n;i++){
            String s = sc2.nextLine();
            Exercise e = new Exercise(s);
            bt.put(i,e);
        }
        while(sc3.hasNext()){
            String code = sc3.next();
            Integer number = Integer.parseInt(sc3.nextLine().trim());
            Group x = new Group(code,mp.get(code),bt.get(number),number);
            gr.add(x);
        }
        Collections.sort(gr, new Comparator<Group>(){
            public int compare(Group g1, Group g2){
                return g1.code.compareTo(g2.code);
            }
        });
        for (Group x : gr){
            System.out.println(x);
        }
    }
}
