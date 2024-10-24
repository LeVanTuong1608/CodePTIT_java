/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
import java.time.*;
import java.text.*;
public class j07020_HoaDon2{
    
    static class Clients{
       static int id =0;
       private String name,sex,birth,address;

        public Clients(String name, String sex, String birth, String address) {
            this.name = name;
            this.sex = sex;
            this.birth = birth;
            this.address = address;
        }

        public String getId() {
            id +=1;
            return String.format("KH%03d",id);
        }

        @Override
        public String toString() {
            return name+" "+address;
            //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
        
       
    }
    static class Product{
        static int id = 0;
        private String name,type;
        private Integer buyprice,sellprice;

        public Product(String name, String type, Integer buyprice, Integer sellprice) {
            this.name = name;
            this.type = type;
            this.buyprice = buyprice;
            this.sellprice = sellprice;
        }

        public String getId() {
            id +=1;
            return String.format("MH%03d",id);
        }

        public Integer getSellprice() {
            return sellprice;
        }
        

        @Override
        public String toString() {
            return name+" "+type+" "+buyprice+" "+sellprice;
            //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
        
    }
    static class Bill{
        static int id=0;
        private String code;
        private Product p;
        private Clients c;
        private Integer total,count;

        public Bill(Clients c, Product p, Integer count) {
            this.p = p;
            this.c = c;
            this.count = count;
            this.total = this.count * this.p.getSellprice();
        }

        public String getId() {
            id+=1;
            return String.format("HD%03d",id);
        }
        
        @Override
        public String toString() {
            return getId()+" "+c+" "+p+" "+count+" "+total;
            //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
        
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("test/bai1/KH.in"));
        Scanner sc1 = new Scanner(new File("test/bai1/MH.in"));
        Scanner sc2 = new Scanner(new File("test/bai1/HD.in"));
        HashMap<String, Clients> cl = new HashMap<>();
        HashMap<String,Product> pr = new HashMap<>();
        List<Bill> lt = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i=1;i<=n;i++){
            String name,sex,birth,address;
            name = sc.nextLine();
            sex = sc.nextLine();
            birth = sc.nextLine();
            address = sc.nextLine();
            Clients x = new Clients(name,sex,birth,address);
            cl.put(x.getId(), x);
            
        }
        n = Integer.parseInt(sc1.nextLine());
        for (int i=1;i<=n;i++){
            Product x = new Product(sc1.nextLine(),sc1.nextLine(),Integer.parseInt(sc1.nextLine()),Integer.parseInt(sc1.nextLine()));
            pr.put(x.getId(), x);
        }
        n = Integer.parseInt(sc2.nextLine());
        for (int i=1;i<=n;i++){
            String[] s = sc2.nextLine().split(" ");
            lt.add(new Bill(cl.get(s[0]),pr.get(s[1]),Integer.parseInt(s[2])));
            
        }
        
        for(Bill x : lt){
            System.out.println(x);
        }
    }
}
