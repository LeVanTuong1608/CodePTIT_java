
package bai1;

import java.util.Scanner;

public class j01007_KtraSoFibonccil {
    public static Scanner sc =  new Scanner(System.in);
    public static boolean check(long x){
        long a=0, b=1;
        while(true){
            long tmp= b;
            b=a+b;
            a=tmp;
            if (b>=x) break;
        }
        if (b == x) return true;
        
        return false;
    }
    public static void main(String[] args) {
       int test = sc.nextInt();
       while(test-->0){
           long s= sc.nextLong();
           if (check(s)|| s==0) System.out.println("YES");
           else System.out.println("NO");
       }
    }
}
