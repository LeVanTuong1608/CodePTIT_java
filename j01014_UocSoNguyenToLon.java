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

public class j01014_UocSoNguyenToLon {
    public static Scanner sc = new Scanner(System.in);
    public static boolean isprime(long n){
        if(n<2) return false;
        for (int i=2;i<= Math.sqrt(n);i++){
            if (n % i ==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int test = sc.nextInt();
        while (test-->0){
            
        
            long n = sc.nextLong();
            long res=0;
            boolean cmp = false;
            for (int i = 1;i<= Math.sqrt(n);i++){
                if (n%i==0){
                    if (isprime(n/i)){
                       // System.out.println(n/i);
                        res = n/i;
                        cmp = true;
                        break;
                    }
                    if (isprime(i)){
                        res = i;
                    }
                }
                if (cmp== true) break;
            }
            System.out.println(res);
        }
    }
}
