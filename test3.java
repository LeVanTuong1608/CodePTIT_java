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
class Matran{
     private int[][] b;
     private int a;

    public Matran(int a) {
        this.a = a;
    }
     public void input(Scanner sc){
         for (int i=0;i<a;i++){
            for (int j=0;j<a;j++){
                b[i][j] = sc.nextInt();
            }
        }
     }
     
     public void out(){
         for (int i=0;i<a;i++){
            for (int j=0;j<a;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println("");
        }
     }
}
public class test3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] a =new int[n][n];
//        int[][] b =new int[n][n];
//        int[][] c =new int[n][n];
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                b[i][j] = sc.nextInt();
//            }
//        }
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                c[i][j] = a[i][j]-b[i][j];
//            }
//        }
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                System.out.print(c[i][j]+" ");
//            }
//            System.out.println("");
//        }
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //nhap kich thuoc
        int n=sc.nextInt();
        Matran m=new Matran(n);
        //nhap ma tran a
        m.input(sc);
        Matran b=new Matran(m.getKT());
        //nhap ma tran b
        b.input(sc);
        Matran h=m.hieu(b.getMatran());
        //viet ra ma tran hieu
        h.out();
    //}
}
