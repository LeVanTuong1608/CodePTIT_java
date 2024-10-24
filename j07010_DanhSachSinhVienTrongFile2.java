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
import java.text.*;

public class j07010_DanhSachSinhVienTrongFile2 {
    static class SinhVien{
        private String name,lop,snhat;
        private Float diem;
        private Integer msv;

        public SinhVien(Integer msv, String name, String lop, String snhat, Float diem) {
            this.name = name;
            this.lop = lop;
            this.snhat = snhat;
            this.diem = diem;
            this.msv = msv;
        }

        public String getMsv() {
            return String.format("B20DCCN%03d",msv);
        }

        public String getSnhat() {
            try{
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                Date date = format.parse(snhat);
                return format.format(date);
            
            }
            catch(ParseException e){
                System.out.println();
            }
            
            return "";
        }
        

        @Override
        public String toString() {
            return getMsv()+" "+name+" "+lop+" "+getSnhat()+" "+String.format("%.2f", diem);
            //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("test/bai1/SV.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> sv = new ArrayList<>();
        for (int i=1;i<=n;i++){
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String snhat = sc.nextLine();
            Float diem = Float.parseFloat(sc.nextLine());
            SinhVien x = new SinhVien(i,name,lop,snhat,diem);
            System.out.println(x);
            //sv.add(x);
        }
    }
}
