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
public class j01012_UocChiaHetCho2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-->0){
            int n = sc.nextInt();
            int count = 0;
            for (int i=1;i<=Math.sqrt(n);i++){
                if (n%i==0){
                    if (i% 2==0) count++;
                    
                    if ((n/i) % 2==0&& i!=(n/i)) count++;
                }
                
            }
            
            System.out.println(count);
        }
    }
}
