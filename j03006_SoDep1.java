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

public class j03006_SoDep1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-->0){
            String n =sc.next();
            int r = 0;
            boolean ok =true;
            int l = n.length();
            for (int i=0;i<=l/2;i++){
                if (n.charAt(i) != n.charAt(l-i-1) || (n.charAt(i)-'0')%2 !=0){
                    ok =false;
                    break;
                }
            }
            if (ok==true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
