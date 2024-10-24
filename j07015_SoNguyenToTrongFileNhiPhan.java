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
import java.text.*;
import java.io.*;

public class j07015_SoNguyenToTrongFileNhiPhan {
    public static Boolean IsPrime(int n){
        if(n<2) return false;
        for (int i=2; i<=(int)Math.sqrt(n);i++){
            if (n % i== 0) return false;
        }
        return true;
    }
//    test/bai1/
    public static void main(String[] args) throws FileNotFoundException, IOException,ClassNotFoundException {
        try(ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SONGUYEN.in"))){;
            List<Integer> nc = (List<Integer>) sc.readObject();
            //sc.close();
            int[] arr = new int[1000];
            Map<Integer,Integer> ans = new TreeMap<>();
            for (int i : nc){
                if(IsPrime(i)){
                    ans.put(i, ans.getOrDefault(i,0)+1);
                }
            }
            sc.close();
            for (Map.Entry<Integer,Integer> x: ans.entrySet()){
                System.out.println(x.getKey()+" "+x.getValue());
            }
        }
    }
}
