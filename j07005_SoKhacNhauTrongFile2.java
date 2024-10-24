/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author admin
 */import java.util.*;
import java.io.*;

public class j07005_SoKhacNhauTrongFile2 {
   
    public static void main(String[] args) throws FileNotFoundException, IOException{
        DataInputStream sc = new DataInputStream(new FileInputStream("DATA.IN"));
        Map<Integer,Integer> mp = new HashMap<>();
        Integer t =100000;
        while(t-->0){
            Integer n = sc.readInt();
                //Integer n = s;
                if (mp.containsKey(n)){
                    mp.put(n, mp.get(n)+1);
                }
                else {
                    mp.put(n, 1);
                }
          
        }
        List<Map.Entry<Integer,Integer>> emlist = new ArrayList<>(mp.entrySet());
        Collections.sort(emlist, new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2){
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        //System.out.println("Liệt kê các số tăng dần, ví dụ:");
        for (Map.Entry<Integer,Integer> x: emlist){
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
}
