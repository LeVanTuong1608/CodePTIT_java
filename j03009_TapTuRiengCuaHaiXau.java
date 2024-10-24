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

public class j03009_TapTuRiengCuaHaiXau {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String[] arr1 = sc.nextLine().split("\\s+");
            String arr2 = sc.nextLine();
            HashSet<String> arr = new HashSet<>();
            for (String x : arr1){
                if (!arr2.contains(x)){
                    arr.add(x);
                }
            }
            for (String x : arr){
                System.out.print(x+" ");
            }
            System.out.println("");
        }
        
    }
}
