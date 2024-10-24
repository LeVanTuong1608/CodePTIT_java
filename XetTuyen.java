/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author admin
 */
import java.time.*;
import java.time.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.text.*;
import javax.swing.text.DateFormatter;
public class XetTuyen {
    static class HocSinh{
        private String name,sn;
        private Float d1,d2;
        private Integer id;
        public HocSinh(String name, String sn, Float d1, Float d2, Integer id) {
            this.name = name;
            this.sn = sn;
            this.d1 = d1;
            this.d2 = d2;
            this.id = id;
        }

        public String getId() {
            return String.format("PH%02d", id);
        }

        public String getName() {
            String[] s = name.trim().split("\\s+");
            name = "";
            for (String x : s){
                name += x.substring(0,1).toUpperCase()+ x.substring(1).toLowerCase();
                name +=" ";
            }
            return name.trim();
        }
        public Integer getDiemTB(){
            float diem ;
            if (d1 >=8 && d2 >=8){
                diem = d2 + d1 + 2;
            }
            else if(d1> 7.5 && d2>7.5){
                diem = d1 + d2 + 0.5f + 0.5f;
            }
            else diem = d1 + d2;
            diem = diem/2;
//            diem = Math.round(diem);
            return Math.round(diem);
        }

        public String getSn() {
            try{
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                Date date = format.parse(sn);
                return format.format(date);
            }
            catch(ParseException e){
                System.out.println(e);
            }
            return "";
        }
        public String getLoai(){
            int x = Integer.valueOf(getDiemTB());
            if (x <5){
                return "Truot";
            }
            else if (x <=6){
                return "Trung binh";
            }
            else if(x == 7){
                return "Kha";
            }
            else if (x == 8){
                return "Gioi";
            }
            else return "Xuat sac";
        }
        
        public Integer getTuoi(){
            LocalDate x = LocalDate.now();
            
            int v = Integer.valueOf(getSn().substring(6,getSn().length()));
//            System.out.println(v);
            return x.getYear() - v ;
            
           // DateFormatter formater = DateFormatter.ofPattern(dd)
        }
        

        @Override
        public String toString() {
            return getId()+" "+getName()+" "+getTuoi()+" "+getDiemTB()+" "+getLoai();
            //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
        
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        List<HocSinh> hs = new ArrayList<>();
        Scanner sc = new Scanner(new File("test/bai1/SV.in"));
        int n = Integer.parseInt(sc.nextLine());
        for (int i=1;i<=n;i++){
            String name,sn;
            Float d1,d2;
            name = sc.nextLine();
            sn = sc.nextLine();
            d1 = Float.parseFloat(sc.nextLine());
            d2 = Float.parseFloat(sc.nextLine());
            HocSinh x = new HocSinh(name,sn,d1,d2,i);
            hs.add(x);
        }
//        Collections.sort(hs, new Comparator<ThoiGian>(){
//            public int compare(HocSinh o1, HocSinh o2){
//               if (o1.getDiemTB().equals(o2.getDiemTB())){
//                   
//                   return o1.getId().compareTo(o2.getId());
//               }
//               return o1.getDiemTB().compareTo(o2.getDiemTB());
//            }
//        });
        for(HocSinh x : hs){
            System.out.println(x);
        }
    }
}
