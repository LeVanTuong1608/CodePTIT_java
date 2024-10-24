/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;
import java.text.DecimalFormat;
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

    public double getDiem() {
        return diem;
    }

    public String getLop() {
        return lop;
    }

    public String getName() {
        return name;
    }
    public String getMa(){
        return "B20DCCN001";
    }
    public String getSnhat() {
        return snhat;
    }
    public String getSnhats(){
        
        try{
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date date= format.parse(snhat);
            return format.format(date);
        }
         catch(ParseException e){
             System.out.println(e);
         }
        
        return "";
    }
    public static  String removeZero(double so){
        DecimalFormat format = new DecimalFormat("#.##");
        return format.format(so);
    }
    @Override
    public String toString() {
        return(getMa()+" "+getName()+" "+getSnhats()+" "+String.format("%.2f",getDiem()));
        //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    

    
}
public class j04006_KhaiBaoLopSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SinhVien> sv = new ArrayList<>();
        sv.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine())));
        sc.nextLine();
        for (SinhVien x :sv){
            System.out.println(x);
        }
    }
 
}
