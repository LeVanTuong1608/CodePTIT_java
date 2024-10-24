package bai1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.util.*;

public class j02005_GiaoCua2DaySo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();m = sc.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[m];
        int[] crr = new int[1005];
        
        for (int i= 0;i<n;i++){
            arr[i] = sc.nextInt();
            crr[arr[i]] = 1;
        }
        for (int i = 0;i<m ;i++){
            brr[i] = sc.nextInt();
            //if (crr[brr[i]] == 1) crr[brr[i]] = 2;
        }
        Arrays.sort(brr);
        for (int i = 0 ;i< m; i++){
            if (crr[brr[i]]==1){
                System.out.print(brr[i]+" ");
                crr[brr[i]] = 2;
            }
        }
    }
}
