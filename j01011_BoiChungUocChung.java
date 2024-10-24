/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class j01011_BoiChungUocChung {
    public static Scanner sc= new Scanner(System.in);
    public static long uocchung(long a,long b){
         if (a<b){
           Long tmp =a;
            a=b;
            b=tmp;
        }
         while(b!=0){
             long tmd = b;
             b = a%b;
             a=tmd;
         }
        return a;
    }
    public static long boichung(long a,long b){
       return(a*b)/uocchung(a, b);
    }
    
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-->0){
            long x=sc.nextLong();
            long y=sc.nextLong();
//            long boi =boichung(x,y);
//            long uoc =uocchung(x,y);
//            System.out.println(boi+" "+uoc );
               System.out.println(boichung(x, y)+" "+uocchung(x, y));
        }
       
    }
}
