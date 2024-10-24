
package bai1;

import java.util.Scanner;


public class ThiSinh_4005 {
    String name;
    String brith;
    Float d1;
    Float d2;
    Float d3;

    public ThiSinh_4005(String name, String brith, Float d1, Float d2, Float d3) {
        this.name = name;
        this.brith = brith;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
     
    public String getName() {
        
        return name;
    }

    
    public String getBrith() {
        return brith;
    }

    public Float getD1() {
        return d1;
    }

    public Float getD2() {
        return d2;
    }

    public Float getD3() {
        return d3;
    }

    @Override
    public String toString() {
        return(this.getName()+" "+this.getBrith()+" "+(this.d1+this.getD2()+this.d3));
    }
     
   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name;
        String brith;
        Float d1,d2,d3;
        name=sc.nextLine();
        brith=sc.nextLine();
        d1=sc.nextFloat();
        d2=sc.nextFloat();
        d3=sc.nextFloat();
        ThiSinh_4005 th = new ThiSinh_4005(name, brith, d1, d2, d3);
        System.out.println(th);
    }
}
