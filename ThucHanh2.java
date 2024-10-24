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
class MS{
    public Integer n ,t;
    private String id,name,mau;
    private Float g1,g2;
    public void input(Scanner sc){
        //Scanner sc =new Scanner(System.in);
        t = Integer.parseInt(sc.nextLine());
        for (int i =0;i<t;i++){
            id = sc.nextLine();
            name = sc.nextLine();
            mau = sc.nextLine();
            g1 = sc.nextFloat();
            g2 = sc.nextFloat();

        }
            }

    public String getName() {
        return name.toUpperCase();
    }
    public void out(){
        System.out.println(id +" "+ getName()+" "+String.format("%.1f",g2)+" "+String.format("%.0f",g1)+" "+mau);
    }
}
public class ThucHanh2 {
    public static void main(String[] args) {
        // in=new Scanner(System.in);
        Scanner in =new Scanner(System.in);
        MS ms=new MS();
        ms.input(in);
        ms.out();
    }
}
