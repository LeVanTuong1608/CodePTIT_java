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
class PhanSo{
    
    private long x;
    private long y;

    public PhanSo(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }
    public long gcd(long x,long y){
        while(y!=0){
            long z  = x%y;
            x = y;
            y = z;
        }
        return x;
    }
    public PhanSo cong(PhanSo a,PhanSo b){
        long tu = a.x*b.y+a.y*b.x;
        long mau = a.y*b.y;
        return new PhanSo(tu,mau);
    }
    @Override
    public String toString() {
        long v = gcd(x,y);
        return x/v+"/"+y/v;
        //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
public class j04004_TongphanSo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x,y;
        x = sc.nextLong();
        y = sc.nextLong();
        PhanSo a = new PhanSo(x,y);
        long x1 = sc.nextLong();
        long y1 = sc.nextLong();
        PhanSo b = new PhanSo(x1,y1);
        PhanSo c = a.cong(a,b);
        System.out.println(c);
    }
}
