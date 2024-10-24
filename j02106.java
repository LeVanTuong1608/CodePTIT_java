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

public class j02106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        for (int i=0;i<n;i++){
            for (int j = 0; j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int i=0;i<n;i++){
            int cmp= 0;
            for (int j=0;j<3;j++){
                if (arr[i][j] ==1 ) cmp++;
            }
            if (cmp>=2 ) count++;
        }
        System.out.println(count);
    }
}
