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
public class j05021_SapXepTheoMaSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> sv = new ArrayList<>();
        while(sc.hasNext()){
            String msv,ten,lop,mail;
            msv = sc.nextLine();
            ten = sc.nextLine();
            lop = sc.nextLine();
            mail = sc.nextLine();
            //sc.nextLine();
            SinhVien x = new SinhVien(msv,ten,lop,mail);
            sv.add(x);
        }
        Collections.sort(sv,new Comparator<SinhVien>(){
            public int compare(SinhVien l ,SinhVien p){
            
                    return l.getMsv().compareTo(p.getMsv());
               
            }
        });
        for(SinhVien x: sv){
            System.out.println(x);
        }
        
    }
}
