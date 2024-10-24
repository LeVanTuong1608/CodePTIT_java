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
public class j02101_InMaTran {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int test = Integer.parseInt(sc.nextLine());
        while(test-->0){
            int n = sc.nextInt();
          //  int n = Integer.parseInt(sc.nextLine());
            int[][] arr = new int[n][n];
            for (int i =0;i<n;i++){
                for (int j =0;j<n;j++){
                    arr[i][j] = sc.nextInt();
                    //arr[i][j] = Integer.parseInt(sc.nextLine());
                }
            }
            for (int i=0;i<n;i++){
                if (i%2==0){
                    for (int j=0;j<n;j++){
                        System.out.print(arr[i][j]+" ");
                    }
                  
                }
                else {
                    for (int j=n-1;j>=0;j--){
                        System.out.print(arr[i][j]+" ");
                    }
                   // System.out.println("");
                }
            }
            System.out.println("");
        }
    }
}
