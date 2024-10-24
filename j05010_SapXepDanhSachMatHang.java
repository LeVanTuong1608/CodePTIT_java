
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
class MatHang{
    private String name,loai;
    private Float g1,g2;
    private Integer id;

    public MatHang(Integer id,String name, String loai, Float g1, Float g2) {
        this.name = name;
        this.loai = loai;
        this.g1 = g1;
        this.g2 = g2;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
    
    public Float getTong(){
        return g2-g1;
    }
    @Override
    public String toString() {
        return getId()+" "+name+" "+loai+" "+String.format("%.2f",getTong());
        //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
public class j05010_SapXepDanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<MatHang> mh = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i=1;i<=t;i++){
            String name,loai;
            Float g1,g2;
            name = sc.nextLine();
            loai = sc.nextLine();
            g1 = sc.nextFloat();
            g2 = sc.nextFloat();
            sc.nextLine();
            MatHang x = new MatHang(i,name,loai,g1,g2);
            mh.add(x);
        }
        Collections.sort(mh, new Comparator<MatHang>(){
            public int compare(MatHang o1, MatHang o2){
                if (o1.getTong().equals(o2.getTong())){
                    return o1.getId().compareTo(o2.getId());
                }
                return o2.getTong().compareTo(o1.getTong());
            }
        });
        for (MatHang x : mh){
            System.out.println(x);
        }
    }
}
