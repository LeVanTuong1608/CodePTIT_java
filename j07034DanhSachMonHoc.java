/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author admin
 */
import java.io.*;
import java.util.*;
public class j07034DanhSachMonHoc {
    static class MonHoc{
        private String name,id;
        private Integer tin;
        public MonHoc(String name,Integer tin, String id) {
            this.name = name;
            this.id = id;
            this.tin = tin;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return getId()+" "+getName()+" "+tin;
            //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<MonHoc> mh = new ArrayList<>();
        for (int i=1;i<=n;i++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            Integer tin = Integer.parseInt(sc.nextLine());
            MonHoc x = new MonHoc(name,tin,id);
            mh.add(x);
        }
        Collections.sort(mh,new  Comparator<MonHoc>(){
            public int compare(MonHoc o1, MonHoc o2){
                return o1.getName().compareTo(o2.getName());
            } 
        });
        for (MonHoc x : mh){
            System.out.println(x);
        }
    }
}
