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
public class j02011_SapXepChon {
    public static Scanner sc =new Scanner(System.in);
    
    public static boolean check(int[] arr){
        for (int i=1;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]) return false;
        }
        return true;
    }
    public static void in(int[] arr){
        for (int i=1;i<arr.length;i++){
            System.out.print(arr[i]+" ");
//            if (i<arr.length-1) System.out.print(" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        
        int n=sc.nextInt();
        int[] arr= new int[n+1];
        for (int i=1;i<=n;i++){
            arr[i]= sc.nextInt();
        }
        for (int i=1;i<=n;i++){
            int x=i;
            for (int j=i+1;j<=n;j++){
                if (arr[j]<arr[x]) x=j;
            }
            int tmp=arr[i];
            arr[i]=arr[x];
            arr[x]=tmp;
            System.out.printf("Buoc %d: ",i);
            if(check(arr)){
                in(arr);
                break;
            }
            in(arr);
            
        }
        
    }
}
