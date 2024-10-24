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
public class j07007_LietKeTuKhacNhau {
    public static void main(String[] args) throws FileNotFoundException,IOException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Map<String,Integer> mp = new HashMap<>();
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            if (!mp.containsKey(s)){
                mp.put(s,1);
            }
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(mp.entrySet());
        Collections.sort(list,new  Comparator<Map.Entry<String,Integer>>(){
            public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2){
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        for (Map.Entry<String,Integer> x: list){
            System.out.println(x.getKey());
        }
    }
}
