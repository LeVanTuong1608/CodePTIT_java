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
public class j01003_PhuongTrinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float x,y;
        x= sc.nextFloat();
        y=sc.nextFloat();
        if (x==0){
            if (y==0){
                System.out.println("VSN");
                
            }
            
            else {
                System.out.println("VN");
                
            }
        }
        else{
            double ans = -y/x;
            System.out.printf("%.2f",ans);
        }
    }
}
