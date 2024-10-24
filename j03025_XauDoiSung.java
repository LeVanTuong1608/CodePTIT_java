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
public class j03025_XauDoiSung {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-->0){
            String n = sc.next();
            int cmp=0;
            int l = n.length();
            boolean ok = true;
            for (int i=0;i<l/2;i++){
                if(n.charAt(i) != n.charAt(l-1-i)){
                    ok =false;
                    cmp++;
                }
            }
            if ((cmp == 1 && l % 2 == 0) || ( l % 2== 1 && cmp <= 1)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        
    }
}
