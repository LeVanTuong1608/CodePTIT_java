
package bai1;

import java.util.Scanner;

public class j01002_Tong {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            long x=sc.nextLong();
            long tong=(x+1)*x/2;
            
            System.out.println(tong);
        }
    }
}
