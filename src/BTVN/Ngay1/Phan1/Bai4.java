package BTVN.Ngay1.Phan1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap n = ");
        int n = sc.nextInt();
        System.out.println("Nhap x = ");
        int x = sc.nextInt();

        float[] mau = new float[n + 1];
        mau[0] = 1;
        for(int i = 1; i <= n; i++){
            mau[i] = mau[i-1] * i;
        }

        float[] tu = new float[n + 1];
        for(int i = 1; i <= n; i++){
            tu[i] = mau[n] / mau[n - i];
        }

        float S = 1;
        for(int i = 1; i <= n; i++){
            S += (Math.pow(x, i) / mau[i] ) * tu[i];
        }

        System.out.println("Ket qua S = " + S);

        sc.close();
    }
}
