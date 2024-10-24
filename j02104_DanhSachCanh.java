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
public class j02104_DanhSachCanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n]; 
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for (int j = i+1;j<n;j++){
                if (arr[i][j] == 1){
                    System.out.printf("(%d,%d)\n",i+1,j+1);
                 //   System.out.println("");
                }
            }
        }
    }
    
}
