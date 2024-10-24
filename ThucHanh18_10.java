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
public class ThucHanh18_10 {
    public static class TaiLieu{
        static int id = 0;
        private String code;
        
        private String name,maTaiLieu;
        private Integer soban;

        public TaiLieu(String maTaiLieu,String name,  Integer soban) {
            this.name = name;
            this.maTaiLieu = maTaiLieu;
            this.code = getCode();
//            this.id = id
            this.soban = soban;
        }

        public String getMaTaiLieu() {
            return maTaiLieu;
        }
        
        public String getCode() {
            return code;
        }
        

        public String getName() {
            return name;
        }

        public Integer getSoban() {
            return soban;
        }

        public String getId() {
            id+=1;
            return String.format("MK%03d", id);
        }

        @Override
        public String toString() {
            return maTaiLieu+" "+name+" "+soban;
            //return return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
        
        
        
        
    }
    public static class Sach extends TaiLieu{
        private String tentacgia,tesach,tenTaiLieu;
        private int sotrang;

        public Sach(String maTaiLieu , String name, Integer soban,String tentacgia, String tesach, int sotrang) {
            super(maTaiLieu,name, soban);
            this.tentacgia = tentacgia;
            this.tesach = tesach;
            this.sotrang = sotrang;
        }
        
    }
    
    public static  interface ChucNang {
        public void nhapSach(Scanner in);
        public void nhapTapChi(Scanner in);
        public void out();//toan bo ds
        public <T> void out(List<T> arr);
        public void timTheoMa(String ma);//viet ra
        public List<Sach> timTheoTenSach(String key);
        public List<TaiLieu> timTheoTuDen(int from,int to);
        public void xoaMa(String ma);
        public void xoaNhieu(String tacGia);//sach
        public void suaCha(String ma);//tai lieu
        public void suaCon(String ma);//tap chi

    }
    

}
