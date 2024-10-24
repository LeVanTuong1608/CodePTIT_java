/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.*;
import java.text.*;

/**
 *
 * @author admin
 */
class Customer{
    private int id;
    private String name;
    private int so_dau;
    private int so_cuoi;

    public Customer(int id, String name, int so_dau, int so_cuoi) {
        this.id = id;
        this.name = name;
        this.so_dau = so_dau;
        this.so_cuoi = so_cuoi;
    }

    public String getId() {
        return String.format("KH%02d", id);
    }
    public double thanhTien(){
        int so = so_cuoi - so_dau;
        if (so<51){
            return so*102;
        }
        else if( so<101){
            return (50*100 + (so - 50)*150 )*1.03;
        }
        return (50*100 + 50*150 + (so-100)*200)*1.05;
    }

    @Override
    public String toString() {
        return(getId() +" "+name+" "+(int)Math.ceil(thanhTien()));
    }
    
    
}
public class j05017_HoaDonTienNuoc{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws ParseException{
        int test = Integer.parseInt(sc.nextLine());
        List<Customer> customers = new ArrayList<>();
        for (int i=1;i<=test;i++){
            customers.add(new Customer(i,sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(customers,new Comparator<Customer>(){
            @Override
            public int compare(Customer o1,Customer o2){
                if(o1.thanhTien() == o2.thanhTien()){
                    return o1.getId().compareTo(o2.getId());
                }
                return o1.thanhTien() < o2.thanhTien() ? 1 : -1;
            }
            
        });
        for (Customer customer : customers){
            System.out.println(customer);
        }
    }
}
