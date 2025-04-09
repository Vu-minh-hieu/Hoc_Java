package BTVN.Lan1.Phan1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap n = ");
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println("Gia tri so thu 1 la: 1");
        }
        else if (n == 2) {
            System.out.println("Gia tri so thu 2 la: 1");
        }
        else {
            int[] a = new int[n];
            a[0] = 1;
            a[1] = 1;
            for (int i = 2; i < n; i++) {
                a[i] = a[i - 1] + a[i - 2];
            }
            System.out.println("Gia tri so thu " + n + " la: " + a[n - 1]);
        }

        sc.close();
    }
}
