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
public class ThucHanh10_26{
    static class MatHang{
        private String name,ten;
        private Integer g1,g2,id;

        public MatHang(String name, String ten, Integer g1, Integer g2, Integer id) {
            this.name = name;
            this.ten = ten;
            this.g1 = g1;
            this.g2 = g2;
            this.id = id;
        }


        public Integer getLoiNhuan(){
            return g2 - g1;
        }
        public String getId() {
            return String.format("MH%03d", id);
        }

        @Override
        public String toString() {
            return getId()+" "+name+" "+ten+" "+g1+" "+g2+" "+getLoiNhuan();
            //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
    }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<MatHang> mh = new ArrayList<>();
        for (int i =1;i<=n;i++){
            String name = sc.nextLine();
            String ten = sc.nextLine();
            Integer a,b;
            a = Integer.parseInt(sc.nextLine());
            b = Integer.parseInt(sc.nextLine());
            MatHang x = new MatHang(name,ten,a,b,i);
            mh.add(x);
        }
        Collections.sort(mh, new Comparator<MatHang>(){
            public int compare(MatHang o1, MatHang o2){
                if (o1.getLoiNhuan().equals(o2.getLoiNhuan())){
                    return o1.getId().compareTo(o2.getId());
                }
                return o2.getLoiNhuan().compareTo(o1.getLoiNhuan());
            }
        });
        for (MatHang x : mh){
            System.out.println(x);
        }
    }
}
