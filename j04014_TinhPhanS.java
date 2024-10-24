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
class PhanSo{
    private Long tu,mau;

    public PhanSo(Long tu,Long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public Long getMau() {
        return mau;
    }

    public Long getTu() {
        return tu;
    }
    
    public Long gcd(Long n,Long m){
        while(m!=0){
            long tmp = n%m;
            n = m;
            m = tmp;
        }
        return n;
    }
    
    @Override
    public String toString() {
        long x = gcd(getTu(),getMau());
        return getTu()/x+"/"+getMau()/x; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
public class j04014_TinhPhanS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            //int a,b,c,d;
//            a = sc.nextInt();b = sc.nextInt();c = sc.nextInt();d = sc.nextInt();
//            PhanSo ab = new PhanSo(a,b);
//            PhanSo cd = new PhanSo(c,d);
              PhanSo a = new PhanSo(sc.nextLong(),sc.nextLong());
              PhanSo b = new PhanSo(sc.nextLong(),sc.nextLong());
              
              PhanSo c = new PhanSo((long)Math.pow(a.getTu()*b.getMau()+b.getTu()*a.getMau(),2),(long)Math.pow(a.getMau()*b.getMau(),2));
              PhanSo d = new PhanSo(a.getTu()*b.getTu()*c.getTu(),a.getMau()*b.getMau()*c.getMau());
              System.out.print(c+" "+d);
              System.out.println("");
              
        }
    }
}
