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

class TinhGio{
    private String name,timein,timeout;
    private String id;

    public TinhGio(String id , String name, String timein, String timeout) {
        this.name = name;
        this.timein = timein;
        this.timeout = timeout;
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public Integer getTotal(){
        Integer x = Integer.parseInt(timein.substring(0,2))* 60 + Integer.parseInt(timein.substring(3));
        Integer y = Integer.parseInt(timeout.substring(0,2))*60 + Integer.parseInt(timeout.substring(3));
        return y-x;
    }
    

    @Override
    public String toString() {
        return getId()+" "+name+" "+ getTotal()/60 +" gio "+getTotal()%60+" phut";
        //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
public class j05011_TinhGio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<TinhGio> gi = new ArrayList<>();
        for (int i=1;i<=t;i++){
            String name,timein,timeout,id;
            id =sc.nextLine();
            name = sc.nextLine();
            timein = sc.nextLine();
            timeout = sc.nextLine();
            TinhGio x = new TinhGio(id,name,timein,timeout);
            gi.add(x);
            
        }
        Collections.sort(gi, new Comparator<TinhGio>(){
            public int compare(TinhGio o,TinhGio l){
                if (o.getTotal().equals(l.getTotal())){
                    return o.getId().compareTo(l.getId());
                }
                return l.getTotal().compareTo(o.getTotal());
            }
        });
        for (TinhGio x : gi){
            System.out.println(x);
        }
        
    }
}
