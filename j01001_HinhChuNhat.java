/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;

public class j01001_HinhChuNhat {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int x,y;
        x=sc.nextInt();y=sc.nextInt();
        if (x<=0||y<=0){
            System.out.println(0);
        }
        else{
            System.out.println((x+y)*2 +" "+ x*y);
        }
    }
}
