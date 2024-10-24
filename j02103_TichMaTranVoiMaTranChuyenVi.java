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
public class j02103_TichMaTranVoiMaTranChuyenVi {
    public static Scanner sc = new Scanner(System.in);
    public static void tong(int T){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[m][n];
        int[][] arr3 = new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr1[i][j] = sc.nextInt();
                arr2[j][i] = arr1[i][j];
            }
        }
        for (int i =0;i<n;i++){
            for (int j=0;j<n;j++){
                arr3[i][j] = 0;
                for (int k =0;k<m;k++){
                    arr3[i][j] +=arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.printf("Test %d:\n",T+1);
        for (int i =0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println("");
        }
        
    }
    public static void main(String[] args) {
        int test = Integer.parseInt(sc.nextLine());
        for (int i =0;i<test;i++){
            
            tong(i);
        }
    }
}
