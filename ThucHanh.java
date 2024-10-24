/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author admin
 */
import java.io.*;
import java.util.*;
public class ThucHanh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("test/bai1/DATA.in"));
        while(sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(s);
        }
    }
}
