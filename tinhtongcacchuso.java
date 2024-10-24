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
public class tinhtongcacchuso {
    public static Scanner in = new Scanner(System.in);
    public static void testCase(){
        
        String s;
        s=in.next();
        int tong=0;
        for (int i=0;i<s.length();i++){
            if (!Character.isDigit(s.charAt(i))) {
                System.out.print(s.charAt(i));
            } else {
                tong+= s.charAt(i)-'0';
            }
        }
        System.out.println(tong);
    }
    public static void main(String[] args) {
     
        int T= in.nextInt();
        while(T-- >0){
            testCase();
        }
    }
}
