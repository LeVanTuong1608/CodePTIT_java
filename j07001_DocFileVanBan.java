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
import java.text.*;

public class j07001_DocFileVanBan {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("test/bai1/Data.in"));
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
