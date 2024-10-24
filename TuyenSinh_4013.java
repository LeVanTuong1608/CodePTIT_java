/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class DanhSach{
    
    public String ma,name;
    public Float tongdiem,diemuutien;
    

    public DanhSach(String ma, String name, Float[] diem) {
        this.ma = ma;
        this.name = name;
        this.diemuutien=0.f;
        this.tongdiem=0.f;
        this.tongdiem+=diem[0]*2 +diem[1]+diem[2];
        switch(ma.substring(0,3)){
            case "KV1":
                this.diemuutien=0.5f;
                break;
            case "KV2":
                this.diemuutien=1f;
                break;
            case "KV3":
                this.diemuutien=1.5f;
                break;
            default:this.diemuutien =0f;
        }
        
        
    }
    
//    public String formatso(Float x){
//        BigDecimal bc= new BigDecimal(x.toString());
//        bc = bc.setScale(2, RoundingMode.HALF_UP);
//        if (bc.stripTrailingZeros().scale()<=0){
//            return bc.toPlainString();
//        }
//        return bc.toString();
//    }
    
    public String formatso(float x) {
        int xInt = (int) (x * 10);
        return xInt % 10 == 0 ? String.format("%.0f", x) : String.format("%.1f", x);
    }
    public String kQua(){
        float diemchuan=24.f;
        return tongdiem+diemuutien>=diemchuan ?"TRUNG TUYEN":"TRUOT";
    }
    @Override
    public String toString() {
      // return(ma+" "+name+" "+diemuutien+" "+tongdiem+" "+kQua());
        return(ma+" "+name+" "+formatso(diemuutien)+" "+formatso(tongdiem)+" "+kQua());// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}

public class TuyenSinh_4013 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String ma=sc.nextLine();
        String name= sc.nextLine();
        Float[] diem=new Float[3];
        for (int i=0;i<3;i++){
           // diem[i]=sc.nextFloat();
           diem[i]=Float.parseFloat(sc.nextLine());
        }
        DanhSach ts= new DanhSach(ma, name, diem);
        System.out.println(ts);
    }
}
