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
    private Float diem;
    private Integer id;

    public SinhVien(Integer id, String name, String lop, String snhat, Float diem) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.snhat = snhat;
        this.diem = diem;
    }

    public String getId() {
        return String.format("B20DCCN%03d",id);
    }

   public String getSnhat(){
        
        try{
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date date= format.parse(snhat);
            return format.format(date);
        }
         catch(ParseException e){
             System.out.println(e);
         }
        
        return "";
    }
    
    
    @Override
    public String toString() {
        return getId()+" "+name+" "+lop+" "+getSnhat()+" "+String.format("%.2f",diem);
        
    }
    
     
    
}
public class j05003_DanhSachDoiTuongSinhVien {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int test = sc.nextInt();
        int test = Integer.parseInt(sc.nextLine());
        
        for (int i=0;i<test;i++){
            String name,lop,snhat;
            name = sc.nextLine();
            lop = sc.nextLine();
            snhat = sc.nextLine();
            Float x = sc.nextFloat();
            sc.nextLine();
            //Float x = Float.parseFloat(sc.nextLine());
            SinhVien z = new SinhVien(i+1,name,lop,snhat,x);
            System.out.println(z);
            
        }
        
    }
}
