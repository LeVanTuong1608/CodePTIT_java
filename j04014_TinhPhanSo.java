
package bai1;

import java.util.Scanner;
class PhanSo{
    private long tu,mau;
    public PhanSo(long tu,long mau){
        this.tu=tu;
        this.mau=mau;
    }

    public long getTu() {
        return tu;
    }

    public long getMau() {
        return mau;
    }
    public static long gtrichung(long x,long y){
        if (y==0){
            return x;
        }
      return gtrichung(y,x%y);
    } 
    public static PhanSo Rutgon(PhanSo a){
        long x;
        if (a.tu>a.mau) x=gtrichung(a.tu,a.mau);
        else x=gtrichung(a.mau,a.tu);
        PhanSo ans=new PhanSo(a.tu/x,a.mau/x);
        return ans;
    }

    @Override
    public String toString() {
      //  return super.toString();
        return(tu +"/"+mau+" ");
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}

public class j04014_TinhPhanSo {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int test=sc.nextInt();
        while(test-->0){
            PhanSo a= new PhanSo(sc.nextLong(),sc.nextLong());
            PhanSo b= new PhanSo(sc.nextLong(),sc.nextLong());
            PhanSo c= new PhanSo((long)Math.pow(a.getTu()*b.getMau()+b.getTu()+a.getMau(),2),(long)Math.pow(a.getMau()*b.getMau(),2));
            System.out.print(c);
            PhanSo d= new PhanSo(a.getTu()*b.getTu()*c.getTu(),a.getMau()*b.getMau()*c.getMau());
            System.out.println(d);
        }
    }
}
