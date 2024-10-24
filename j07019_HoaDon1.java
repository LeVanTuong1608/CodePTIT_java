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
public class j07019_HoaDon1 {
    static class HoaDon{
        static HashMap<String,HoaDon> element = new HashMap<>();
        private HashMap<Integer,Integer> type = new HashMap<>();
        private String id,name;
        private Integer g1,g2;

        public HoaDon(String id, String name, Integer g1, Integer g2) {
            this.id = id;
            this.name = name;
            this.type.put(1, g1);
            this.type.put(2,g2);
        }

        public Integer getPrice(String t) {
            return type.get(Integer.parseInt(t));
        }
        public String getId() {
            return id;
        }

        @Override
        public String toString() {
            return name;
            //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
        
    }
    static class MaGia{
        static int id =0;
       private String idd,name;
//       private 
       private Integer cai,g1,g2,sum,total;
       private HoaDon d;
       
       
       
        public MaGia(String idd,Integer cai) {
//            super(id, name, g1, g2);
              this.cai = cai;
              this.idd = idd;
              this.d = HoaDon.element.get(idd.substring(0,2));
              this.sum = this.d.getPrice(idd.substring(2)) * this.cai;
              this.total = this.setTotal();
        }

        public int setTotal() {
            
            if (cai >= 150){
                return sum / 2;
            }
            else if (cai >= 100){
                return sum * 7 / 10;
            }
            else if (cai >= 50){
                return sum * 17 /20;
            }
            else return sum;
        }
        

        public String getId() {
            this.id +=1;
            return String.format("-%03d",id);
        }

        @Override
        public String toString() {
            return idd+getId()+" "+d+" "+(sum-total)+" "+total;
            //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
        
       
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("test/bai1/DATA1.in"));
        Scanner in = new Scanner(new File ("test/bai1/DATA2.in"));
//        List<HoaDon> hd = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(sc.hasNext()){
            String id = sc.nextLine();
            String name = sc.nextLine();
            Integer g1,g2;
            g1 = Integer.parseInt(sc.nextLine());
            g2 = Integer.parseInt(sc.nextLine());
            HoaDon x = new HoaDon(id,name,g1,g2);
//            hd.add(x);
            HoaDon.element.put(x.getId(),x);
        }
         n = Integer.parseInt(in.nextLine());
        List<MaGia> solve = new ArrayList<>();
        for (int i=1;i<=n;i++){
             String[] s = in.nextLine().split("\\s+");
             solve.add(new MaGia(s[0],Integer.parseInt(s[1])));
        }
        for(MaGia x : solve){
            System.out.println(x);
        }
    }
}
