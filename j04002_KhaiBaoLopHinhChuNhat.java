
package bai1;


import java.util.*;


class HinhCN{
    private Integer x,y;
    private String s;

    public HinhCN(Integer x, Integer y,String s) {
        this.x = x;
        this.y = y;
        this.s = s;
    }

    public String getS() {
        return s;
    }
     
    public String getChuVi(){
        Integer z = x*2 + y*2;
        
        return String.valueOf(z) ;
    }
    public String getDienTich(){
        Integer z = x*y;
        return String.valueOf(z);
    }
    public String getMau(){
        return s.substring(0,1).toUpperCase()+ s.substring(1).toLowerCase();
    }
    @Override
    public String toString() {
        return getChuVi()+" "+getDienTich()+" "+getMau();
    }
    
}
public class j04002_KhaiBaoLopHinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();
        String s = sc.nextLine();
        if (x >0 && y>0){
            HinhCN a =new HinhCN(x,y,s.trim());
            System.out.println(a);
            
        }
        else{
            System.out.println("INVALID");
        }
    }
}
