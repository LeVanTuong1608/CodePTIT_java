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
public class j03022_XuLyVanBan {
    public static String chuanhoacau(String s){
        s = s.trim();
        if (s.length()==0) return "";
        
        s = s.substring(0,1).toUpperCase()+ s.substring(1).toLowerCase();
//        if (!s.endsWith(".") && !s.endsWith("!") && !s.endsWith("?")){
//            s +=".";
//        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder stri = new StringBuilder();
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            stri.append(line).append(" ");
        }
        //sc.close();
        String text = stri.toString().trim();
        String[] arr = text.split("[.?!]+");
        for (String x : arr){
            System.out.println(chuanhoacau(x));
        }
    }
}

