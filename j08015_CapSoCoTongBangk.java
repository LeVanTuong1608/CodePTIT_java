/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class j08015_CapSoCoTongBangk {
    public static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] list  = new long[n];
            for (int j =0; j<n;j++){
                list[j] = sc.nextLong();
            }
            Arrays.sort(list);
            
        }
    }
}
