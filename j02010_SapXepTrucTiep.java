
package bai1;

import java.util.Scanner;

public class j02010_SapXepTrucTiep {
    public static Scanner sc= new Scanner(System.in);
    public static boolean ktra(int[] x){
        for(int i=0;i<x.length-1;i++){
            if (x[i]>x[i+1]) return false;
        }
        return true;
    }
    public static void in(int[] x){
        for (int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
//            if (i<x.length-1) System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            System.out.printf("Buoc %d: ",(i+1));
//            for (int j=0;j<n;j++){
                int x=arr[i];
                for(int k=i+1;k<n;k++){
                    if (arr[i]>arr[k]){
                        int tmp= arr[i];
                        arr[i]=arr[k];
                        arr[k]=tmp;
                    }
                }
                
//            }
//            if (ktra(arr)){
//                in(arr);
//                break;
////                System.out.println("");
//            }
            in(arr);
            System.out.println("");
        }
    }
    
    
}
