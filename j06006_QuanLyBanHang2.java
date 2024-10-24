/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.*;
import java.text.*;

/**
 *
 * @author admin
 */
public class j06006_QuanLyBanHang2 {
    static class KhachHang{
        private String name,gtinh,snhat,dchi;
        private Integer id;

        public KhachHang(String name, String gtinh, String snhat, String dchi, Integer id) {
            this.name = name;
            this.gtinh = gtinh;
            this.snhat = snhat;
            this.dchi = dchi;
            this.id = id;
        }

        public String getId() {
            return String.format("KH%03d", id);
        }
        
        public String getDchi() {
            return dchi;
        }

        public String getGtinh() {
            return gtinh;
        }

        public String getName() {
            return name;
        }

        public String getSnhat() {
            return snhat;
        }
        
        
    }
    static class MatHang{
        private String name,dvi;
        private Integer giam,giab;
        private Integer id;

        public MatHang(String name, String dvi, Integer giam, Integer giab, Integer id) {
            this.name = name;
            this.dvi = dvi;
            this.giam = giam;
            this.giab = giab;
            this.id = id;
        }

        public String getId() {
            return String.format("MH%03d", id);
        }
        
        public String getDvi() {
            return dvi;
        }

        public String getName() {
            return name;
        }

        public Integer getGiam() {
            return giam;
        }

        public Integer getGiab() {
            return giab;
        }
        
        
    }
    static class HoaDon{
        private KhachHang khang;
        private MatHang mhang;
        private Integer sluong,ma;

        public HoaDon(Integer ma,KhachHang khang,MatHang mhang, Integer sluong) {
            this.mhang = mhang;
            this.khang = khang;
            this.sluong = sluong;
            this.ma = ma;
        }

        public String getMa() {
            return String.format("HD%03d", ma);
        }
        public Integer getLoiNhuan(){
            return sluong *mhang.getGiab() - sluong * mhang.getGiam();
        }

        @Override
        public String toString() {
            return getMa()+" "+khang.getName()+" "+khang.getDchi()+" "+mhang.getName()+" "+sluong+" "+(sluong * mhang.getGiab())+" "+getLoiNhuan();
            //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
        
        
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<KhachHang> kh = new ArrayList<>();
        List<MatHang> mk = new ArrayList<>();
        List<HoaDon> hd = new ArrayList<>();
        for (int i = 1;i<=n;i++){
            String name = sc.nextLine();
            String gtinh = sc.nextLine();
            String snhat = sc.nextLine();
            String dchi = sc.nextLine();
            KhachHang x = new KhachHang(name,gtinh,snhat,dchi,i);
            kh.add(x);
        }
        n = Integer.parseInt(sc.nextLine());
        for (int i=1;i<=n;i++){
            String name = sc.nextLine();
            String dvi = sc.nextLine();
            Integer gmua = Integer.parseInt(sc.nextLine());
            Integer gban = Integer.parseInt(sc.nextLine());
            MatHang x = new MatHang(name,dvi,gmua,gban,i);
            mk.add(x);
        }
        n = Integer.parseInt(sc.nextLine());
        for (int i=1;i<=n;i++){
//            String id = sc.next();
//            String x = sc.next();
//            Integer sluong = sc.nextInt();
              String[] s = sc.nextLine().split("\\s+");
              String id,x ;
              id = s[0];
              x = s[1];
              Integer sluong = Integer.parseInt(s[2]);
//            sc.nextLine();
            KhachHang khang = kh.stream().filter(h -> h.getId().equals(id)).findFirst().orElse(null);
            MatHang mhang = mk.stream().filter(m -> m.getId().equals(x)).findFirst().orElse(null);
            HoaDon y = new HoaDon(i,khang,mhang,sluong);
            hd.add(y);
        }
        Collections.sort(hd, new Comparator<HoaDon>(){
            public int compare(HoaDon o1 , HoaDon o2){
                if (o1.getLoiNhuan().equals(o2.getLoiNhuan())){
                    return o1.getMa().compareTo(o2.getMa());
                }
                return o2.getLoiNhuan().compareTo(o1.getLoiNhuan());
            }
        });
        for (HoaDon x : hd){
            System.out.println(x);
        }
    }
}

