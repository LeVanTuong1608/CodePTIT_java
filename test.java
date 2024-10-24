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
class SanPham{
    static int id=0;
    private String name,loai;
    private Integer sluong;
    private Double gia;
   // private Integer id=1;
    
    public SanPham(String name, Integer sluong, Double gia, String loai) {
        this.name = name;
        this.loai = loai;
        this.sluong = sluong;
        this.gia = gia;
    }

    public String getId() {
        id +=1;
        return String.format("%03d", id);
    }
    
    public String getLoai() {
        loai = loai.toUpperCase();
        return loai;
    }
    public Double getGiaTong(){
        if (sluong<20){
            return (sluong*gia);
        }
        return (sluong*gia)*0.9;
    }
    
    @Override
    public String toString() {
        return getLoai()+"-"+getId()+" "+name+" "+sluong+" "+String.format("%.1f", gia)+" "+String.format("%.1f", getGiaTong());
        //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String ten;
        String nhaSX;
        int soLuong;
        double gia;
        while(n-->0){
            ten=sc.nextLine();
            nhaSX=sc.nextLine();
            soLuong=Integer.parseInt(sc.nextLine());
            gia=Double.parseDouble(sc.nextLine());
            SanPham p=new SanPham(ten, soLuong, gia, nhaSX);
            System.out.println(p);
        }
    }
    
}
