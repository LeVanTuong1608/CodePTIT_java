
package bai1;

/**
 *
 * @author admin
 */
import java.util.*;

class SinhVien{
    private String name,snhat;
    private Float d1,d2,d3;

    public SinhVien(String name, String snhat, Float d1, Float d2, Float d3) {
        this.name = name;
        this.snhat = snhat;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    public Float getDiemtong(){
        return d1+d2+d3;
    }
    @Override
    public String toString() {
        return name+" "+snhat+" "+String.format("%.1f",getDiemtong());
        //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
public class KhaiBaoLopSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name,snhat;
        Float d1,d2,d3;
        name = sc.nextLine();
        snhat = sc.nextLine();
        d1 = sc.nextFloat();
        d2 = sc.nextFloat();
        d3 = sc.nextFloat();
        SinhVien x = new SinhVien(name,snhat,d1,d2,d3);
        System.out.println(x);
    }
    
}
