
package bai1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class j01013_TongUocSo1 {
    public static Scanner sc= new Scanner(System.in);
    public static final int N = (int)2e6;
    public static int[] array2 = new int[N+10];
    public static void sangnguyento(){
        for (int i=2;i*i<=N;i++){
            if (array2[i]==0){
                for (int j=i;j<=N;j+=i){
                    if (array2[j]==0){
                        array2[j] =i;
                    }
                }
            }
        }
    }
    public static long tonguocnguyento(int n){
        long tong=0;
        return tong;
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] array= new int[n];
        long tong = 0;
        for (int i=0;i<n;i++){
            array[i]=sc.nextInt();
            tong+=tonguocnguyento(array[i]);
        }
        
        System.out.println(tong);
    }
}
