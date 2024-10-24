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

    public SinhVien(Integer id, String name, String lop, String snhat, Float diem) {
        this.name = name;
        this.lop = lop;
        this.snhat = snhat;
        this.id = id;
        this.diem = diem;
    }

    public String getId() {
        return String.format("B20DCCN%03d", id);
    }

    public Float getDiem() {
        return diem;
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

    public String getName() {
        String[] line = name.trim().split("\\s+");
        String res = "";
        for (String lines : line){
            res+= lines.substring(0, 1).toUpperCase()+ lines.substring(1).toLowerCase()+" ";
            
        }
        return res.substring(0, res.length()-1);
    }
    

    @Override
    public String toString() {
        return getId()+" "+getName()+" "+lop+" "+getSnhat()+" "+String.format("%.2f",getDiem()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
public class j05005_DanhSachDoiTuongSV3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<SinhVien> sv = new ArrayList<>();
        //int t = Integer.parseInt(sc.nextLine());
        for (int i=1;i<=t;i++){
            sc.nextLine();
            String name,lop,snhat;
            Float diem;
            name = sc.nextLine();
            lop = sc.nextLine();
            snhat = sc.nextLine();
            diem = sc.nextFloat();
            //diem = Float.parseFloat(sc.nextLine());
            //sc.nextLine();
            sv.add(new SinhVien(i,name,lop,snhat,diem));
        }
        
        Collections.sort(sv, new Comparator<SinhVien>(){
            public int compare(SinhVien o1, SinhVien o2){
                if (!o1.getDiem().equals(o2.getDiem())){
                    return o2.getDiem().compareTo(o1.getDiem());
                }
                return o1.getId().compareTo(o2.getId());
                
            }
        });
        for (SinhVien sinhvien : sv){
            System.out.println(sinhvien);
        }
        
    }
}