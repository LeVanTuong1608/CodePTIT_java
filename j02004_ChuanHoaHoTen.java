
package bai1;

import java.util.Scanner;

public class j02004_ChuanHoaHoTen {
    public static Scanner sc = new Scanner(System.in);
    public static String chụanhoachuacai(String s){
        if (s.length()==1){
            return s.toUpperCase();
        }
        return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    }
    public static void main(String[] args) {
        int test = Integer.parseInt(sc.nextLine());
        while(test-->0){
            
            String s =sc.nextLine().trim();
            String[] line = s.split("\\s+");
            for(int i=0;i<line.length;i++){
                line[i] =chụanhoachuacai(line[i]);
            }
            System.out.println(String.join(" ", line));
        }
        
    }
}
