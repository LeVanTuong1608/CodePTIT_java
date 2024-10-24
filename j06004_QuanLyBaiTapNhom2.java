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
class BaiTap{
    private String msv,name,number;
    private Integer id;

    public BaiTap(String msv, String name, String number, Integer id) {
        this.msv = msv;
        this.name = name;
        this.number = number;
        this.id = id;
    }

    public String getMsv() {
        return msv;
    }
    
    public Integer getId() {
        return id;
    }

    @Override
    public String toString(){
        return msv+" "+name+" "+number+" "+getId()+" ";
        //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    
}
public class j06004_QuanLyBaiTapNhom2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<BaiTap> nh = new ArrayList<>();
        Map<Integer,String> team = new HashMap<>();
        int t = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1;i<=t;i++){
            String msv, name, number;
            Integer id;
            msv = sc.nextLine();
            name = sc.nextLine();
            number = sc.nextLine();
            id = Integer.parseInt(sc.nextLine());
            BaiTap x = new BaiTap(msv,name,number,id);
            nh.add(x);
        }
        for (int i=1;i<=n;i++){
            String x = sc.nextLine();
            team.put(i, x);
        }
        Collections.sort(nh, new Comparator<BaiTap>(){
            public int compare(BaiTap l,BaiTap p){
                return l.getMsv().compareTo(p.getMsv());
            }
        });
        for (BaiTap x :nh){
            System.out.print(x);
            System.out.println(team.get(x.getId()));
        }
        
    }
    
}
