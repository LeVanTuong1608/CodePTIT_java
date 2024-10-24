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
public class j07002_TinhTong {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        long  s = 0;
        while(sc.hasNext()){
            String l = sc.next();
            try{
                s+= Integer.parseInt(l);
            }
            catch(Exception e){
                
            }
        }
        System.out.println(s);
    }
}
