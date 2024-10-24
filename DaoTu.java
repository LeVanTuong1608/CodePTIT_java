/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author admin
 */ import java.util.Scanner;
public class DaoTu {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T-- > 0) {
            String[] ar = sc.nextLine().trim().split("\\s+");
            for (int i=0;i<ar.length;i++) {
                
                
                ar[i] = new StringBuilder(ar[i]).reverse().toString();
            }
            for (String i : ar) {
                System.out.print( i+ " ");
            }
            System.out.println();
        }
    }

}
