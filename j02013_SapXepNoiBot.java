/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;

public class j02013_SapXepNoiBot {
    public static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int n= sc.nextInt();
        int[] list = new int[n];
        for (int i=0;i<n;i++){
            list[i]=sc.nextInt();
        }
        for (int i=0;i<n-1;i++){
            boolean check= false;
            for (int j=0;j<n-i-1;j++){
                if (list[j]>list[j+1]){
                    check=true;
                    int tmp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = tmp;
                }
            }
            if (check){
                System.out.printf("Buoc %d: ",i+1);
                for (int j=0;j<n;j++){
                    System.out.print(list[j]+" ");
                }
                System.out.println("");
            }
            else break;
        }
    }
}
