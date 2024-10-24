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
public class j05081_DanhSachMatHang {
    static class MatHang{
        private static int id = 0;
        private String name,type,idd;
        private Integer buyprice,sellprice;
//        private 

        public MatHang(String name, String type, Integer buyprice, Integer sellprice) {
            this.idd = this.getId();
            this.name = name;
            this.type = type;
            this.buyprice = buyprice;
            this.sellprice = sellprice;
        }
        
        public String getId() {
            id+=1;
            return String.format("MH%03d",id);
        }
        
        public Integer getLoiNhuan(){
            return sellprice - buyprice;
        }

        public String getIdd() {
            return idd;
        }
        

        @Override
        public String toString() {
            return idd+" "+name+" "+type+" "+buyprice+" "+sellprice+" "+getLoiNhuan();
//            return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<MatHang> mh = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i=1;i<=n;i++){
            String name,type;
            name = sc.nextLine();
            type = sc.nextLine();
            Integer buyprice,sellprice;
            buyprice = Integer.parseInt(sc.nextLine());
            sellprice = Integer.parseInt(sc.nextLine());
            MatHang x = new MatHang(name,type,buyprice,sellprice);
            mh.add(x);
        }
        Collections.sort(mh,new Comparator<MatHang>(){
            public int compare(MatHang n1,MatHang n2){
                if (n1.getLoiNhuan().equals(n2.getLoiNhuan())){
                    return n1.getIdd().compareTo(n2.getIdd());
                }
                return -n1.getLoiNhuan().compareTo(n2.getLoiNhuan());
            }
        });
        for (MatHang x : mh){
            System.out.println(x);
        }
    }
}
