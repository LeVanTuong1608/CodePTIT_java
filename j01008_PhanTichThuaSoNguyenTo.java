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
public class j01008_PhanTichThuaSoNguyenTo {
    public static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int test = sc.nextInt();
        for (int i=1;i<=test;i++){
            int n =sc.nextInt();
            int m =n;
            System.out.printf("Test %d: ",i);
            for (int j=2;j<=Math.sqrt(m)+1;j++){
                if (n%j==0){
                    int count =0;
                    while(n%j==0){
                        count++;
                        n/=j;
                    }
                    System.out.print(j+"("+count+") ");
                }
            }
            if (n!=1 ) System.out.println(n+"("+1+")");
            else System.out.println("");
        }
    }
}
