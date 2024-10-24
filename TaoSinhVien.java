
package bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class TaoSinhVien {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<SinhVien> sinhvien = new ArrayList<>();
        sinhvien.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt()));
        sc.nextLine();
        for (SinhVien sinhviens : sinhvien){
            System.out.println(sinhviens);
        }
    }
}
class SinhVien{
    private String ma;
    private String name;
    private String gtinh;
    private Integer diem;

    public SinhVien(String ma, String name, String gtinh, Integer diem) {
        this.ma = ma;
        this.name = name;
        this.gtinh = gtinh;
        this.diem = diem;
    }

    public String getMa() {
        ma = ma.toUpperCase();
        return ma;
    }

    public String getName() {
        return name;
    }

    public Integer getDiem() {
        return diem;
    }

    public String getGinhtinh() {
        if (gtinh.equalsIgnoreCase("true")) return "nam";
        return "nu";
    }
    public String getStatus(){
        if (diem>=5) return "dat";
        return "hoc lai";
    }

    @Override
    public String toString() {
        return (getMa()+" "+getName()+" "+getGinhtinh()+" "+getStatus());
        //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}