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
public class j06002_SapXepHoaDonQA {
    public static class Product{
        
        private String code,name;
        private Integer price1,price2;
        static HashMap<String,Product> element = new HashMap<>();
        private HashMap<Integer,Integer>type = new HashMap<>();

        public Product(String code, String name, Integer price1, Integer price2) {
            this.code = code;
            this.name = name;
            this.type.put(1, price1);
            this.type.put(2, price2);
        }

        public String getCode() {
            return code;
        }

        public Integer getPrice(String t) {
            return type.get(Integer.parseInt(t));
        }

        public String getName() {
            return name;
        }
        
        @Override
        public String toString() {
            return name;
            //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
    }
        public static class Bill{
            static int idd = 0;
            private Product p;
            private String code,id;
            private Integer number,total,sum;

            public Bill(String code, Integer number) {
                this.p = Product.element.get(code.substring(0,2));
                this.code = code;
                this.id = this.getId();
                this.number = number;
                this.sum = this.p.getPrice(code.substring(2)) * this.number;
                
                this.total = getTotal();
            }

            public Integer getTotal() {
                if(number >=150) return sum /2;
                else if (number >=100) return sum *7 /10;
                else if (number >= 50) return sum * 17 /20;
                return sum;
            }

            

            public String getId() {
                this.idd +=1;
                return String.format("-%03d", idd);
            }
            
            
            @Override
            public String toString() {
                return code+id+" "+p+" "+(sum - total)+" "+total;
                //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }
            
            
            
        
        
        
        
    } 
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        for (int i=1;i<=n;i++){
//            String code,name;
//            code = sc.nextLine();
//            name = sc.nextLine();
//            Integer price1 = Integer.parseInt(sc.nextLine());
//            Integer price2 = Integer.parseInt(sc.nextLine());
//            Product x = new Product(code,name,price1,price2);
//            Product.element.put(x.getCode(), x);
//        }
//        n = Integer.parseInt(sc.nextLine());
//        List<Bill> bl = new ArrayList<>();
//        for(int i=1;i<=n;i++){
//            String[] s = sc.nextLine().split(" ");
////            Integer number = Integer.parseInt(sc.nextLine());
//            Bill x = new Bill(s[0],Integer.parseInt(s[1]));
//            bl.add(x);
//        }
        Scanner sc =new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i=1;i<=n;i++){
            String code,name;
            Integer price1,price2;
            code = sc.nextLine();
            name = sc.nextLine();
            price1 = Integer.parseInt(sc.nextLine());
            price2 = Integer.parseInt(sc.nextLine());
            Product x = new Product(code,name,price1,price2);
            Product.element.put(x.getCode(), x);
            
            
        }
        n =Integer.parseInt(sc.nextLine());
        List<Bill> bl = new ArrayList<>();
        for (int i=1;i<=n;i++){
            String[] s = sc.nextLine().split(" ");
            bl.add(new Bill(s[0],Integer.parseInt(s[1])));
        }
        
        Collections.sort(bl, new Comparator<Bill>(){
            public int compare(Bill b1,Bill b2){
                return -b1.getTotal().compareTo(b2.getTotal());
            }
        });
        for(Bill x : bl){
            System.out.println(x);
        }
    }
}
