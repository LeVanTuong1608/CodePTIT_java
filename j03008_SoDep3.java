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

public class j03008_SoDep3 {
    public static Scanner sc = new Scanner(System.in);
    public static boolean isprime(int n){
        if (n<2) return false;
        for (int i =2;i<= Math.sqrt(n);i++){
            if (n%i==0) return false;
            
        }
        return true;
    }
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-->0){
            String n = sc.next();
            boolean ok =true;
            int l = n.length();
            for (int i =0;i<=l/2;i++){
                if (n.charAt(i) != n.charAt(l-1-i) || !isprime(n.charAt(i)-'0')){
                    ok =false;
                    break;
                }
            }
            System.out.println(ok == true ? "YES" : "NO");
                    
        }
    }
}
