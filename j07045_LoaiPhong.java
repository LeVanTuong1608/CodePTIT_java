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

public class j07045_LoaiPhong {
    static class LoaiPhong implements Comparable<LoaiPhong>{
        private String id,s,name;
        private Integer gia;
        private Float phi;

//        public LoaiPhong() {
//        }
        
//        public LoaiPhong(String s) {
//            this.s = s;
//            
//        }

//        public LoaiPhong(String id, String s, String name, Integer gia, Float phi) {
//            this.id = id;
//            this.s = s;
//            this.name = name;
//            this.gia = gia;
//            this.phi = phi;
//        }
        

        
        public LoaiPhong(String s) {
            s = s.replaceAll("\\s+"," ");
            String[] z = s.split("\\s+");
            id = z[0];
            name = z[1];
            gia = Integer.parseInt(z[2]);
            phi = Float.parseFloat(z[3]);
//            return "";
            
        }
        public String getId() {
//            getS();
            return id;
        }


        public String getName() {
//            getS();
            return name;
        }

        public Integer getGia() {
//            getS();
            return gia;
        }

        public Float getPhi() {
//            getS();
            return phi;
        }

        @Override
        public String toString() {
            return id+" "+name+" "+gia+" "+phi;
            //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        public int compareTo(LoaiPhong o){
            return this.name.compareTo(o.name);
        }
        
        
    }
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("test/bai1/PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }

}
