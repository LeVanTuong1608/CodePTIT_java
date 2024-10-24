
package bai1;

import java.util.Scanner;

public class j02012_SapXepChen {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for (int i=0;i<n;i++){
            list[i] = sc.nextInt();
        }
        System.out.print("Buoc 0: "+list[0]);
        System.out.println("");
        for (int i=1;i<n;i++){
            
            int j=i+1;
            while(j-->1){
                if (list[j]<list[j-1]){
                    int tmp= list[j];
                    list[j] = list[j-1];
                    list[j-1] =tmp;
                }
                else break;
            }
            System.out.printf("Buoc %d: ",i);
            for (j=0;j<=i;j++){
                System.out.print(list[j]+" ");
            }
            System.out.println("");
        }
    }
}
