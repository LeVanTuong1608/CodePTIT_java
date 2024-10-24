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
import java.math.*;
import java.lang.Math;
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

    @Override
    public String toString() {
        long v = gcd(x, y);
        return x/ v+"/"+y/v;
        //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
public class j04003_PhanSo {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long x,y;
        x = sc.nextLong();
        y = sc.nextLong();
        PhanSo a = new PhanSo(x,y);
        System.out.println(a);
    }
}
