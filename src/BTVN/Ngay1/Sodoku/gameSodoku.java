package BTVN.Ngay1.Sodoku;

import java.util.Scanner;

public class gameSodoku {
    //in bang
    public static void in(int[][] bang){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(bang[i][j] + " ");
            }
            System.out.println();
        }
    }
    //kiem tra hop le
    public static boolean check(int[][] bang, int hang, int cot, int n) {
        //kiem tra rong hay khong
        if(bang[hang][cot] != 0){
            return false;
        }
        //kiem tra theo hang va cot
        for (int i = 0; i < 9; i++) {
            if (bang[hang][i] == n || bang[i][cot] == n) {
                return false;
            }
        }
        // kiem tra trong o 3x3
        int cHang = hang - hang % 3;
        int cCot = cot - cot % 3;
        for (int i = cHang; i < cHang + 3; i++) {
            for (int j = cCot; j < cCot + 3; j++) {
                if (bang[i][j] == n) {
                    return false;
                }
            }
        }
        return true;
    }
    //kiem tra thang hay chua
    public static boolean win(int[][] bang) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (bang[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[][] bang = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        Scanner sc = new Scanner(System.in);
        while (!win(bang)) {
            in(bang);
            System.out.println("Nhap hang, cot, gia tri: ");
            int hang = sc.nextInt();
            int cot = sc.nextInt();
            hang--;
            cot--;
            int n = sc.nextInt();
            if (check(bang, hang, cot, n)) {
                bang[hang][cot] = n;
                System.out.println("Da dien thang cong");
            } else {
                System.out.println("So khong hop le");
            }
        }
        System.out.println("Chuc mung ban da thang tro choi");

        sc.close();
    }
}
