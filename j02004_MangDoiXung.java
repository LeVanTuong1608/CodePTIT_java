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

public class j02004_MangDoiXung {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int test = Integer.parseInt(sc.nextLine());
        int test = sc.nextInt();
        while (test-->0) {
           // sc.nextLine();
            //int n = Integer.parseInt(sc.nextLine());
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                //arr[i] = Integer.parseInt(sc.nextLine());
            }
            boolean ok = true;
            int l =0,r = n-1;
            while(l<=r){
                if (arr[r] != arr[l]){
                    ok = false;
                    break;
                }
                r-=1;
                l+=1;
            }
            if (ok == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
