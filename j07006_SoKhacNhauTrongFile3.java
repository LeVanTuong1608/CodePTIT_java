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
import java.io.*;
public class j07006_SoKhacNhauTrongFile3 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> list = (ArrayList<Integer>) sc.readObject();
        int[] a = new int[1000];
        for (Integer x :list ){
            a[x]++;
            
        }
        for (int i=0 ;i<1000;i++){
            if (a[i] > 0){
                System.out.println(i +" "+a[i]);
            }
        }
    }
}
