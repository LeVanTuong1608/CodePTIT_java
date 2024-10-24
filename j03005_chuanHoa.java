/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;


public class j03005_chuanHoa {
    public static Scanner sc=new Scanner(System.in);
    public static String chuanhoachucai(String s){
        if (s.length()==1){
            return s.toUpperCase();
        }
        return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    }
    public static void main(String[] args) {
        int test = Integer.parseInt(sc.nextLine());
        while(test-->0){
            String s= sc.nextLine().trim();
            String[] line = s.split("\\s+");
            for (int i=0;i<line.length;i++){
                line[i] = chuanhoachucai(line[i]);
            }
            for (int i=1;i<line.length;i++){
                System.out.print(line[i]);
                if (i!=line.length-1) System.out.print(" ");
            }
            System.out.println(", "+line[0].toUpperCase());
        }

    }
}
