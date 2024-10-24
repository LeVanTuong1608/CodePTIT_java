
package bai1;

import java.util.Scanner;


public class SoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        if (line.length()>=5){
//             int digit1 = Character.getNumericValue(line.charAt(2));
//            int digit2 = Character.getNumericValue(line.charAt(4));
//            if (digit1==3 || digit1 == 5 && digit2 ==3 || digit2 == 5){
//                System.out.println("YES");
//             }
            if ((line.charAt(2)=='3'|| line.charAt(2)=='5') && (line.charAt(4)=='3'||line.charAt(4)=='5')) System.out.println("YES");
            else System.out.println("NO");
        }
        else System.out.println("NO");
    }
   
}
