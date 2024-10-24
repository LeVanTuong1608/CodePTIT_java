
package bai1;

import java.util.*;


class NhanVien{
    private String name,ma;
    private String gtinh;
    private String Snhat;
    private String noio;
    private String so;
    private String ngay;

    public NhanVien() {
        this("00001","","","","","","");
    }
    
    public NhanVien(String ma,String name, String gtinh, String Snhat, String noio, String so, String ngay) {
        this.name = name;
        this.gtinh = gtinh;
        this.Snhat = Snhat;
        this.noio = noio;
        this.so = so;
        this.ngay = ngay;
        this.ma = ma;
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + gtinh + " " + Snhat + " " + noio + " " + so + " " + ngay;
       
    }
    
}
public class j04007_KhaiBaoLopNhanVien {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       String name = sc.nextLine();
        String sex = sc.nextLine();
        String dob = sc.nextLine();
        String address = sc.nextLine();
        String tax = sc.nextLine();
        String date = sc.nextLine();
        NhanVien sta = new NhanVien("00001", name, sex, dob, address, tax, date);
        System.out.println(sta);
    }
}
