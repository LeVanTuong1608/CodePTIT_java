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

public class j03007_SoDep2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-->0){
            String n = sc.next();
            boolean ok = true;
            int r =0, l = n.length();
            int sum = 0;
            for (int i=0;i<l/2;i++){
                if (n.charAt(i) != n.charAt(l-1-i)){
                    ok = false;
                    break;
                }
                sum +=(n.charAt(i)-'0');
                
            }
            sum = sum*2;
            if (l%2==1) sum += (n.charAt(l/2+1)-'0'); 
            //System.out.println(ok+" "+sum);
            if (n.charAt(0)!='8' || n.charAt(l-1) !='8'|| sum % 10!=0) ok = false;
            System.out.println(ok == true ? "YES" : "NO");
        }
    }
}
