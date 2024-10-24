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
class GiaoVien{
    private String name,ma,luong;

    public GiaoVien(String ma ,String name, String luong) {
        this.name = name;
        this.ma = ma;
        this.luong = luong;
    }
    public String getCap(){
        int s = Integer.parseInt(ma.substring(2));
        //System.out.println(s);
      
        return String.valueOf(s);
    }
    public String getLuongCB(){
        String s = ma.substring(0,2);
        //System.out.println(s);
        //s = s.trim();
        switch(s){
            case "HP" : return "900000";
            case "HT" : return "2000000";
            default: return "500000";
        }
    }
    public String getLuongTong(){
        
        String x = getLuongCB();
        Integer s = (Integer.valueOf(luong) * Integer.valueOf(getCap())+ Integer.valueOf(x));
        return String.valueOf(s);
    }
    @Override
    public String toString() {
        return ma+" "+name+" "+getCap()+" "+getLuongCB()+" "+getLuongTong();
        //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
public class j04015_TinhThuNhatGiaoVien {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name,ma,luong;
        ma = sc.nextLine();
        name = sc.nextLine();
        luong = sc.nextLine();
        GiaoVien x = new GiaoVien(ma,name,luong);
        System.out.println(x);
    }
}
