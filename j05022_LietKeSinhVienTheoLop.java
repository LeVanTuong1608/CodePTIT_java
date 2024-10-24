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
class SinhVien{
    private String msv,ten,lop,mail;

    public SinhVien(String msv, String ten, String lop, String mail) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }

    public String getLop() {
        return lop;
    }

    public String getMsv() {
        return msv;
    }

    @Override
    public String toString() {
        return getMsv()+" "+ten+" "+getLop()+" "+mail;
     //   return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
     
    
    
}
public class j05022_LietKeSinhVienTheoLop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> sv = new ArrayList<>();
       int t = sc.nextInt();
       sc.nextLine();
        for (int i =1;i<=t;i++){
            String msv,ten,lop,mail;
            msv = sc.nextLine();
            ten = sc.nextLine();
            lop = sc.nextLine();
            mail = sc.nextLine();
            //sc.nextLine();
            SinhVien x = new SinhVien(msv,ten,lop,mail);
            sv.add(x);
        }
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String s = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP "+s+":");
            for (SinhVien x:sv){
                if (s.equals(x.getLop())){
                    System.out.println(x);
                }
            }
        }
        
    }
}
