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

class NhanVien{
    private String name,gtinh,snhat,dchi,sodt,ngayg;
    private Integer id;
    public NhanVien(Integer id,String name, String gtinh, String snhat, String dchi, String sodt, String ngayg) {
        this.name = name;
        this.gtinh = gtinh;
        this.snhat = snhat;
        this.dchi = dchi;
        this.sodt = sodt;
        this.ngayg = ngayg;
        this.id = id;
    }

    public String getId() {
        return String.format("%05d",id);
    }

    @Override
    public String toString() {
        return getId()+" "+name+" "+gtinh+" "+snhat+" "+dchi+" "+sodt+" "+ngayg;
        
    }
    
    
}
public class j05006_DanhSachDoiTuongNV {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       sc.nextLine();
        for (int i=1;i<=t;i++){
            String name,gtinh,snhat,dchi,sodt,ngayg;
            
            name = sc.nextLine();
            gtinh = sc.nextLine();
            snhat = sc.nextLine();
            dchi = sc.nextLine();
            sodt = sc.nextLine();
            ngayg = sc.nextLine();
            //Date ns = ngch.parse(snhat);
            //Date ng = ngch.parse(ngayg);
            NhanVien x = new NhanVien(i,name,gtinh, snhat,dchi,sodt,ngayg);
            System.out.println(x);
        }

    }
}
