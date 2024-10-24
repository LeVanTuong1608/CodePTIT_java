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

public class j02020_LietKeToHop1 {
    public static Scanner sc = new Scanner(System.in);
    public static int[] arr = new int[10];
    public static int n,k, count = 0;
    public static void in(){
        count++;
        for (int i=1;i<=k;i++){
            System.out.print(arr[i]);
        }
        System.out.print(" ");
    }
    public static void Try(int i){
        for (int j = arr[i-1]+1;j<=n-k+i;j++){
            arr[i] = j;
            if (i==k) in();
            else Try(i+1);
        }
    }
    public static void main(String[] args) {
        n = sc.nextInt();
        k = sc.nextInt();
        Try(1);
        System.out.printf("\nTong cong co %d to hop",count);
    }
}
