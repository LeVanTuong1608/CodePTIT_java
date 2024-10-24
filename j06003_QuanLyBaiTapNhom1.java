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
class Student{
    private String msv,name,number;
    private Integer teams;

    public Student(String msv, String name, String number, Integer teams) {
        this.msv = msv;
        this.name = name;
        this.number = number;
        this.teams = teams;
    }

    public Integer getTeams() {
        return teams;
    }

    @Override
    public String toString() {
        return msv+" "+name+" "+number;
        //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
public class j06003_QuanLyBaiTapNhom1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> st = new ArrayList<>();
        Map<Integer,String> team = new HashMap<>();
        int t = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i =1;i<=t;i++){
            String msv,name,number;
            Integer teams;
            msv = sc.nextLine();
            name = sc.nextLine();
            number = sc.nextLine();
            teams = sc.nextInt();
            sc.nextLine();
            Student x = new Student(msv,name,number,teams);
            st.add(x);
        }
        for (int i=1;i<=n;i++){
            String x = sc.nextLine();
            team.put(i, x);
        }
        int m = Integer.parseInt(sc.nextLine());
        for (int i=0;i<m;i++){
            int x = Integer.parseInt(sc.nextLine());
            System.out.printf("DANH SACH NHOM %d:\n",x);
            for (Student z : st){
                if (z.getTeams()== x){
                    System.out.println(z);
                }
            }
            System.out.println("Bai tap dang ky: "+team.get(x));
        }
    }
}
