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
import java.text.*;
public class j06008_TinhGioChuanChoTungGiangVien {
    public static class MonHoc{
        private String ma,mon;

        public MonHoc(String ma, String mon) {
            this.ma = ma;
            this.mon = mon;
        }

        public String getMon() {
            return mon;
        }
        
        public String getMa() {
            return ma;
        }

        @Override
        public String toString() {
            return mon;
            //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
    }
    public static class GiangVien{
        private String ma,name;
        public GiangVien(String ma, String name) {
            this.ma = ma;
            this.name = name;
        }

        public String getName() {
            return name;
        }
        
        
        public String getMa() {
            return ma;
        }

        @Override
        public String toString() {
            return name;
            //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
        
        
    }
    public static class Gio{
        private MonHoc m;
        private GiangVien e;
        private Float diem;

        public Gio(MonHoc m, GiangVien e, Float diem) {
            this.m = m;
            this.e = e;
            this.diem = diem;
        }
        public String getMagiangvien(){
            return e.getMa();
        }


        public Float getDiem() {
            return diem;
        }
        
        
        
        @Override
        public String toString() {
            return "Giang vien: " + e+"\n"+m+" "+diem+"\n"+"Tong: ";
//            +String.format("%.2f", diem)
            //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        List<MonHoc> mh = new ArrayList<>();
//        List<GiangVien> gv = new ArrayList<>();
        List<Gio> gi = new ArrayList<>();
        HashMap<String,MonHoc> mh = new HashMap<>();
        HashMap<String,GiangVien> gv = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i=1;i<=n;i++){
//            String s = sc.nextLine();
            String ma,mon;
            ma = sc.next();
            mon = sc.nextLine().trim();
//            sc.nextLine();
//            ma = s.substring(0,8).trim();
//            mon = s.substring(8,s.length()).trim();
            MonHoc x = new MonHoc(ma,mon);
            mh.put(ma, x);
            
        }
        int m = Integer.parseInt(sc.nextLine());
        for (int i=1;i<=m;i++){
//            String s = sc.nextLine();
            String ma,name;
            ma = sc.next();
            name = sc.nextLine().trim();
//            ma = s.substring(0,5).trim();
//            name = s.substring(5,s.length()).trim();
            GiangVien x = new GiangVien(ma,name);
            gv.put(ma, x);
        }
        int t = Integer.parseInt(sc.nextLine());
//        HashMap<GiangVien,Gio> gingvien = new HashMap<>();
        for (int i=1;i<=t;i++){
            //int[] a= new int[3];
            //String s = sc.nextLine();
            String[] a = sc.nextLine().split(" ");
            String ma1,ma2;
            ma1 = a[0].trim();
            ma2 = a[1].trim();
            Float diem = Float.valueOf(a[2]);
            Gio x = new Gio(mh.get(ma2),gv.get(ma1),diem);
            gi.add(x);
        }
        String s = sc.next();
        //String s = sc.nextLine().trim();
//        for (GiangVien x : gv){
//            if (x.getMa().equals(s)){
//                System.out.println(x);
//                System.out.println();
//            }
//        }
        float tong=0;
        GiangVien y = gv.get(s);
        for(Gio x : gi){
                if (x.getMagiangvien().equals(s)){
//                    System.out.println(x);
//                      y = x;
                      tong += x.getDiem();
                    
                    
                    
                }
        }
        System.out.println(String.format("%.2f", tong));
//        sc.close();
//          for (GiangVien x : gv){
//              System.out.println(x);
//          }
//          for (MonHoc x : mh){
//              System.out.println(x);
//          }
    }
}
//2
//INT1155 Tin hoc co so 2
//INT1306 Cau truc du lieu va giai thuat
//2
//GV01 Nguyen Van An
//GV02 Hoang Binh Minh
//2
//GV01 INT1155 113.2
//GV02 INT1306 126.72
//GV01