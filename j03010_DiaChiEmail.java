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

public class j03010_DiaChiEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<String> d = new ArrayList<>();
        while(t-->0){
            
            String[] arr = sc.nextLine().trim().toLowerCase().split("\\s+");
            String x = arr[arr.length-1];
            
            //System.out.print(x);
            for(int i =0 ;i<arr.length-1;i++){
               
                x+= arr[i].charAt(0);
            }
            d.add(x);
            int count = Collections.frequency(d, x);
            x+= (count ==1 ? "" : count)+ "@ptit.edu.vn";
            System.out.println(x);
        }
    }
}
