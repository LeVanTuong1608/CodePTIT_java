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

class SinhVien{
    private String name;
    private String lop;
    private String snhat;
    private double diem;

    public SinhVien(String name, String lop, String snhat, double diem) {
        this.name = name;
        this.lop = lop;
        this.snhat = snhat;
        this.diem = diem;
    }

    public String getSnhat() {
        return snhat;
    }
    public String getSinhNhat(){
        try{
            SimpleDateFormat in = new SimpleDateFormat("dd/MM/yyyy");
            Date date = in.parse(snhat);
            return in.format(date);
            
        }
        catch(ParseException e){
            System.out.println(e);
        }
        return "";
    }
   
    public double getDiem() {
        return diem;
    }

    @Override
    public String toString() {
        return "B20DCCN001"+" "+name+" "+lop+" "+getSinhNhat()+" "+String.format("%.2f",diem);
       // return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
public class j04006_KhaiBaoLopSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SinhVien> sv = new ArrayList<>();
        sv.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble()));
        sc.nextLine();
        for (SinhVien svien : sv){
            System.out.println(svien);
        }
    }
}
