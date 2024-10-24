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
public class j05024_LietKeSinhVienTheoNganh {
    static class SinhVien{
    private String msv,ten,lop,mail;

    public SinhVien(String msv, String ten, String lop, String mail) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }
    public String getMsv() {
        return msv;
    }
    public String getLopE(){
        return String.valueOf(lop.charAt(0));
    }
    public String getNam(){
        String x = getMsv().substring(3,7);
        return x;
    }


    

    @Override
    public String toString() {
        return getMsv()+" "+ten+" "+lop+" "+mail;
     //   return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
     
    
    
}
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
        int n = sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String x = sc.nextLine().toLowerCase();
            String c ;
            switch(x){
                case "ke toan" :
                    c = "DCKT";
                    break;
                case "cong nghe thong tin":
                    c = "DCCN";
                    break;
                case "an toan thong tin":
                    c = "DCAT";
                    break;
                case "vien thong":
                    c = "DCVT";
                    break;
                case "dien tu":
                    c = "DCDT";
                    break;
                default:
                    c = "";
                    break;
                
            }
            
            
            //System.out.println(c);
            System.out.println("DANH SACH SINH VIEN NGANH "+x.toUpperCase()+":");
            for (SinhVien v :sv){
                if (c.equals("DCCN") || c.equals("DCAT")){
                    if (! v.getLopE().equals("E") && c.equals(v.getNam())){
                        System.out.println(v);
                    }
                }
                else if (v.getNam().equals(c)) System.out.println(v);
            }
        }
        
    }
}
