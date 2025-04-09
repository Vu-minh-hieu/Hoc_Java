package BTVN.Lan1.Phan1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap n = ");
        int n = sc.nextInt();

        int a = 1;
        int b = 1;
        while (b < n){
            int temp = b;
            b = b + a;
            a = temp;
        }
        if( (n - a) == (b - n) ){
            System.out.println("Phan tu gan voi " + n +" nhat la: " + a + " va " + b);
        }
        else {
            int min = (n - a) < (b - n) ? a : b;
            System.out.println("Phan tu gan voi " + n +" nhat la: " + min);
        }
        sc.close();
    }
}
