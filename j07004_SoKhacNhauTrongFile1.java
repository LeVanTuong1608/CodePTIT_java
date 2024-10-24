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
public class j07004_SoKhacNhauTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        Map<Integer,Integer> mp = new HashMap<>();
        while(sc.hasNext()){
            String s = sc.next();
            try{
                Integer n = Integer.parseInt(s);
                if (mp.containsKey(n)){
                    mp.put(n, mp.get(n)+1);
                }
                else {
                    mp.put(n, 1);
                }
            }
            catch(Exception e){
                
            }
        }
        for (Map.Entry<Integer,Integer> x: mp.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
}
