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
class Xe{
    private String name,snhat,ngay;
    private Integer sluong,s,id;

    public Xe(Integer id ,String name, String snhat,  Integer s, Integer sluong, String ngay) {
        this.name = name;
        this.snhat = snhat;
        this.ngay = ngay;
        this.sluong = sluong;
        this.s = s;
        this.id=id;
    }
    
    public Integer getTia(){
        if (sluong<5){
            return sluong *800;
        }
        else if (sluong<10 && sluong>4){
            return sluong*780;
        }
        return sluong * 750;
    }
    public Double getGia(){
        if (ngay.equals("le")){
            return getTia()*1.2;
        }
        else if (ngay.equals("nghi")){
            return getTia()*1.1;
        }
        return getTia()*1.0;
    }
    public String getId() {
        return String.format("%02d",id);
    }

    @Override
    public String toString() {
        return "HN"+s+getId()+" "+name+" "+snhat+" "+s+" "+sluong+" "+ngay+" "+String.format("%.0f", getGia());
        //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name,snhat,ngay;
        Integer sluong,s;
        int t= Integer.parseInt(sc.nextLine());
        for (int i=1;i<=t;i++){
            name = sc.nextLine();
            snhat = sc.nextLine();
            s = sc.nextInt();
            sluong = sc.nextInt();
            sc.nextLine();
            ngay = sc.nextLine();
            Xe x = new Xe(i,name,snhat,s,sluong,ngay);
            System.out.println(x);
        }
    }
}
