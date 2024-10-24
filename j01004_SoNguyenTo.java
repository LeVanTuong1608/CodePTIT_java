
package bai1;

import java.util.Scanner;


public class j01004_SoNguyenTo {
    public static Scanner sc= new Scanner(System.in);
    public static boolean ktra(int s){
        if (s<2) return false;
        for (int i=2;i<=Math.sqrt(s);i++){
            if (s%i==0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        int test =sc.nextInt();
        while(test-->0 ){
                int s= sc.nextInt();
            if (ktra(s)) System.out.println("YES");
            else System.out.println("NO");
        }
        
    }
}
