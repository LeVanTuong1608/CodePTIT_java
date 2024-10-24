/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.math.BigInteger;
import java.util.Scanner;


public class j01009_TongGiaiThua {
    public static Scanner sc= new Scanner(System.in); 
    public static BigInteger giaithua(int n){
        BigInteger  tong= BigInteger.ONE;
        for (int i=1;i<=n;i++){
            tong = tong.multiply(BigInteger.valueOf(i));
        }
        return tong;
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        BigInteger tong = BigInteger.ZERO;
        for (int i=1;i<=n;i++){
            tong = tong.add(giaithua(i));
        }
        System.out.println(tong);
    }
}
