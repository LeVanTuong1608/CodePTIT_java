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
public class j01006_Sòibonacci {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int test = sc.nextInt();
        while(test-->0){
            long a=0,b=1;
            int n=sc.nextInt();
            if (n<=2){
                if (n==2) System.out.println(n-1);
                else System.out.println(0);
            }
            else{
                for (int i=2;i<=n;i++){
                    long tmp=b;
                    b=a+b;
                    a=tmp;
                }
                System.out.println(b);
            }
            
        }
    }
}
