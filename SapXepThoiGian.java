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
public class SapXepThoiGian {
    static class ThoiGian{
        private Integer a,b,c,id;

        public ThoiGian(Integer a, Integer b, Integer c, Integer id) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.id = id;
        }

        public Integer getA() {
            return a;
        }

        public Integer getB() {
            return b;
        }

        public Integer getC() {
            return c;
        }

        public Integer getId() {
            return id;
        }
       
        @Override
        public String toString() {
            return getA()+" "+getB()+" "+getC();
            //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<ThoiGian> th = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i= 1;i<=n;i++){
            Integer a,b,c;
            a = Integer.parseInt(sc.next());
            b = Integer.parseInt(sc.next());
            c =Integer.parseInt(sc.next());
            sc.nextLine();
            ThoiGian x = new ThoiGian(a,b,c,i);
            th.add(x);
        }
         Collections.sort(th, new Comparator<ThoiGian>(){
            public int compare(ThoiGian o1, ThoiGian o2){
               if (o1.getA().equals(o2.getA())){
                   if (o1.getB().equals(o2.getB())){
                       return o1.getC().compareTo(o2.getC());
                   }
                   return o1.getB().compareTo(o2.getB());
               }
               return o1.getA().compareTo(o2.getA());
            }
        });
         for (ThoiGian x : th){
             System.out.println(x);
         }
    }
}
