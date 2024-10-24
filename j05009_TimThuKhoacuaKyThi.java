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
class ThiSinh{
    private String name,snhat;
    private Integer id;
    private Float d1,d2,d3;

    public ThiSinh(Integer id, String name, String snhat,  Float d1, Float d2, Float d3) {
        this.name = name;
        this.snhat = snhat;
        this.id = id;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    public Float getTongDiem(){
        return d1+d2+d3;
    }
    @Override
    public String toString() {
        return id+" "+name+" "+snhat+" "+getTongDiem();
        //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
public class j05009_TimThuKhoacuaKyThi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<ThiSinh> ts = new ArrayList<>();
        for (int i=0;i<t;i++){
            String name,snhat;
            Float d1,d2,d3;
            name = sc.nextLine();
            snhat = sc.nextLine();
            d1 = sc.nextFloat();
            d2 = sc.nextFloat();
            d3 = sc.nextFloat();
            sc.nextLine();
            ThiSinh x = new ThiSinh(i+1,name,snhat,d1,d2,d3);
            ts.add(x);
        }
        Float diemMax = ts.stream().map(ThiSinh :: getTongDiem).max(Float :: compareTo).orElse(0f);
        for(ThiSinh x : ts){
            if (x.getTongDiem().equals(diemMax)){
                System.out.println(x);
            }
        }
    }
}
