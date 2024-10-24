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
public class j01005_ChiaTamGiac {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0){
            int n=sc.nextInt();
            double h=sc.nextDouble();
            double res= h/(n*2);
//            while(n>1){
//                res = h*Math.sqrt( (double)(n-1/n));
//                
//                n--;
//                System.out.print(res+" ");
//                h = res;
//            }
               for (int i=0;i<n-1;i++){{
                   double ans = (double)(Math.sqrt((res*(i+1)/(h/2)*h*h)));
                   System.out.printf("%.6f ",ans);
                   
               }
                   
            }
               System.out.println("");
        }
    }
}
