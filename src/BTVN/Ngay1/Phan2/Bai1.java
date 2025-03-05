package BTVN.Ngay1.Phan2;

import java.util.Scanner;

public class Bai1 {
    public static int spttm(int[] a, int n){
        int count = 0;
        for(int i = 0; i < n; i++){
            if(a[i] > 0 && a[i] % 3 != 0){
                count++;
            }
        }
        return count;
    }

    public static void tongvatbc(int[] a, int n){
        int S = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(a[i] >= -5 && a[i] <= 25) {
                S += a[i];
                count++;
            }
        }
        double tbc = 1.0 * S / count;
        System.out.println("Tong cac phan tu nam trong khoang [-5;25] la: S = " + S);
        System.out.println("TBC cac phan tu nam trong khoang [-5;25] la: " + tbc);
    }

    public static int max(int[] a, int n){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(a[i] > max && a[i] % 3 == 0) {
                max = a[i];
            }
        }
        return max;
    }

    public static void sx(int[] a, int n){
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (Math.abs(a[i]) > Math.abs(a[j])){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void loc(int[] a, int n){
        int[] l = new int[n];
        int j = 0;
        for(int i = 0; i < n; i++){
            if(a[i] % 5 != 0 || a[i] % 5 == 0 && a[i] % 3 == 0) {
                l[j] = a[i];
                j++;
            }
        }
        for(int i = 0; i < j; i++){
            System.out.print(l[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n = ");
        int n = sc.nextInt();

        System.out.println("Nhap cac phan tu: ");

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("So phan tu nguyen duong khong chia het cho 3 la: " + spttm(a,n));
        tongvatbc(a,n);
        System.out.println("Phan tu lon nhat chia het cho 3 la: " + max(a,n));
        sx(a,n);
        System.out.println("Day da sap xep: ");
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("\nDay da duoc loc: ");
        loc(a,n);

        sc.close();
    }
}
