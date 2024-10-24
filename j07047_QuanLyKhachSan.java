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
import java.time.temporal.*;
import java.text.*;

public class j07047_QuanLyKhachSan {
    public static class Hotel_Room{
        private String id,type;
        
        private Float price,VAT;

        public Hotel_Room(String id, String type, Float price, Float VAT) {
            this.id = id;
            this.type = type;
            this.price = price;
            this.VAT = VAT;
        }

        public String getId() {
            return id;
        }

        public Float getPrice() {
            return price;
        }

        public String getType() {
            return type;
        }

        public Float getVAT() {
            return VAT;
        }
        
        
    }
    
    public static class Customer{
        private String name,code,day_1,day_2;
        int id = 0;
        private Hotel_Room r;
        public Customer(String name, String code, String day_1, String day_2,Hotel_Room r) {
//            this.id = id;
            this.name = name;
            this.code = code;
            this.day_1 = getDayC();
            this.day_2 = getDayD();
            this.r = r;
        }

        public String getIdd() {
            id =+1;
            return String.format("KH%02d",id);
        }
        public String getDayC(){
            try{
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                Date date = format.parse(day_1);
                return format.format(date);
            }
            catch(ParseException e){
                System.out.println(e);
            }
            return "";
        }
        public String getDayD(){
            try{
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                Date date = format.parse(day_2);
                return format.format(date);
            }
            catch(ParseException e){
                System.out.println(e);
            }
            return "";
        }

        public Long getDay() {
            Integer d1,m1,y1;
            Integer d2,m2,y2;
            d1 = Integer.parseInt(day_1.substring(0,2));
            m1 = Integer.parseInt(day_1.substring(4,6));
            y1 = Integer.parseInt(day_1.substring(7,10));
            d2 = Integer.parseInt(day_2.substring(0,2));
            m2 = Integer.parseInt(day_2.substring(4,6));
            y2 = Integer.parseInt(day_2.substring(7,10));
            LocalDate startday = LocalDate.of(y1,m1,d1);
            LocalDate endday = LocalDate.of(y2,m2,d2);
            Long x = ChronoUnit.DAYS.between(startday,endday);
            return x;
        }
        public Float getPrice_C(){
            return getDay()* r.getPrice();
        }
        public Float getVat() {
            return getPrice_C()* r.getVAT();
        }
        
        

        @Override
        public String toString() {
            return getIdd()+" "+name+" "+code+" "+getDay()+" "+String.format("%.2f",getPrice_C()+getVat());
            //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("test/bai1/DATA.in"));
        Map<String,Hotel_Room> ph = new HashMap<>();
        List<Customer> cr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            String[] arr = sc.nextLine().split(" ");
            String kt = arr[0];
            String type = arr[1];
            Float price , vat;
            price = Float.parseFloat(arr[2]);
            vat = Float.parseFloat(arr[3]);
            Hotel_Room h = new Hotel_Room(kt,type,price,vat);
            ph.put(kt,h);
        }
        n = Integer.parseInt(sc.nextLine());
        for (int i = 1;i<=n;i++){
            String name,code,day_1,day_2;
            name = sc.nextLine();
            code = sc.nextLine();
            day_1 = sc.nextLine();
            day_2 = sc.nextLine();
            String x = code.substring(2,3);
            Customer c = new Customer(name,code,day_1,day_2,ph.get(x));
            cr.add(c);
        }
        
        Collections.sort(cr,new Comparator<Customer>(){
            public int compare(Customer c1,Customer c2){
                return -c1.getDay().compareTo(c2.getDay());
            }
        });
        
        
        for(Customer x :cr){
            System.out.println(x);
        }
        
    }
}
