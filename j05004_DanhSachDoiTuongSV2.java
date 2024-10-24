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

class SinhVien{
    private String name,lop,snhat;
    private Integer id;
    private Float diem;

    public SinhVien( Integer id, String name, String lop, String snhat, Float diem) {
        this.name = name;
        this.lop = lop;
        this.snhat = snhat;
        this.id = id;
        this.diem = diem;
    }
    public String getMa(){
        return String.format("B20DCCN%03d",id);
    }

    public String getName() {
        String[] line = name.trim().split("\\s+");
        String res = "";
        for (String lines : line){
            res += lines.substring(0,1).toUpperCase()+ lines.substring(1).toLowerCase()+" ";
        }
        return res.substring(0,res.length()-1);
    }

    public String getSnhat() {
        try{
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date date = format.parse(snhat);
        
            return format.format(date);
        }
        catch(ParseException e){
            System.out.println(e);
        }
        return "";
        
    }
    

    @Override
    public String toString() {
        return getMa()+" "+getName()+" "+lop+" "+getSnhat()+" "+String.format("%.2f",diem);
        //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
   
    
}
public class j05004_DanhSachDoiTuongSV2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i=1;i<=n;i++){
            String name,lop,snhat;
            name = sc.nextLine();
            lop = sc.nextLine();
            snhat = sc.nextLine();
            Float x = sc.nextFloat();
            //Float x = Float.parseFloat(sc.nextLine());
            sc.nextLine();
            SinhVien z = new SinhVien(i,name,lop,snhat,x);
            System.out.println(z);
        }
    }
}
