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

public class j02006_HopCuaHaiDaySo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[] arr = new int[1005];
        Arrays.fill(arr,0);
        for (int i=0;i<n;i++){
            int x = sc.nextInt();
            arr[x] = 1;
        }
        for (int i=0;i<m;i++){
            int x = sc.nextInt();
            arr[x] = 1;
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]==1) System.out.print(i+" ");
        }
    }
}
