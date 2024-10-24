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

public class DemSoLanXuatHien {
    public static Scanner ip = new Scanner(System.in);

    public static void testCase(int t) {
        int n = ip.nextInt();
        int[] a = new int[n];
        int[] dd = new int[100005];

        for (int i = 0; i < n; i++) {
            a[i] = ip.nextInt();
            dd[a[i]]++;
        }

        System.out.printf("Test %d:\n", t);
        for (int i = 0; i < n; i++) {
            if (dd[a[i]] > 0) {
                System.out.printf("%d xuat hien %d lan\n", a[i], dd[a[i]]);
                dd[a[i]] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int T = ip.nextInt();
        for (int i = 1; i <= T; i++) {
            testCase(i);
        }
    }
}
