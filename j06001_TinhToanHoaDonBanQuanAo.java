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
class HoaDon{
    public class Don{
        private String ms,name;
        private Float g1,g2;
        private int id=1;
        private Gia gi;
        public Don(String ms, String name, Float g1, Float g2) {
            this.ms = ms;
            this.name = name;
            this.g1 = g1;
            this.g2 = g2;
        }

        public String getMs() {
            String msv = gi.getMa();
            return msv+String.format("_%03d",id++);
        }

        public Float getG1() {
            Integer v = gi.getGia();
            return v * g1 ;
        }

        public Float getG2() {
            Integer v = gi.getGia();
            return g2*v;
        }
        
        

        @Override
        public String toString() {
            return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
        

    }
    class Gia{
        private String ma;
        private Integer gia;

        public Gia(String ma, Integer gia) {
            this.ma = ma;
            this.gia = gia;
        }

        public Integer getGia() {
            return gia;
        }

        public String getMa() {
            return ma;
        }
        

    }
    
}


public class j06001_TinhToanHoaDonBanQuanAo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        List<HoaDon.Don> hd = new ArrayList<>();
        Map<String,Integer> mk = new HashMap<>();
        int t = sc.nextInt();
        sc.nextLine();
        HoaDon z = new HoaDon();
        for(int i=1;i<=t;i++){
            String ms,name;
            Float g1,g2;
            ms = sc.nextLine();
            name = sc.nextLine();
            g1 = sc.nextFloat();
            g2 = sc.nextFloat();
            
            HoaDon.Don x = z.new Don(ms,name,g1,g2);
            
            hd.add(x);
        }
        int n = Integer.parseInt(sc.nextLine());
        for (int i=1;i<=n;i++){
            String s = sc.next();
            Integer x = sc.nextInt();
            sc.nextLine();
            mk.put(s, x);
        }
        for (HoaDon.Don x : hd){
            System.out.println(x);
        }
    }
}
