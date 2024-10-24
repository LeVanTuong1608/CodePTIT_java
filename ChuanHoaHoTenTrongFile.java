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
public class ChuanHoaHoTenTrongFile {
    public static String chuanhoa(String s){
        String[] n = s.split("\\s+");
        s = "";
        for (String i : n){
            s+= i.substring(0,1).toUpperCase()+i.substring(1).toLowerCase();
            s+=" ";
        }
        return s.trim();
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("test/bai1/DATA.in"));
        while(sc.hasNext()){
            String s = sc.nextLine().trim();
            if (s.equals("END")){
                
                //sc.close();
                //break;
            }
            else System.out.println(chuanhoa(s));
        }
    }
}
