package BTVN.Ngay2.Phan5.Sudoku;

import java.util.Scanner;

public class Sudoku {

    private static int SIZE = 9;
    private boolean[][] fixedCell;

    // In bang
    public static void show(int[][] board){
        System.out.println("SUDOKU GAME");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Kiem tra o dien co hop le khong
    public static boolean isValid(int[][] board, int row, int col, int n) {
        // Kiem tra theo hang va cot
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == n || board[i][col] == n) {
                return false;
            }
        }
        // Kiem tra trong o 3x3
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == n) {
                    return false;
                }
            }
        }
        return true;
    }

    // Kiem tra game da thang hay chua
    public static boolean isWin(int[][] board) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // Bat dau choi
    public static void play(int[][] board){
        //init(board);
        Scanner sc = new Scanner(System.in);
        System.out.println("Choi game di bro");
        while (!isWin(board)){
            //b1 : show
            show(board);
            //b2 : input
            System.out.print("Hang = ");
            int row = sc.nextInt() - 1;
            System.out.print("Cot = ");
            int col = sc.nextInt() - 1;
            System.out.print("Gia tri = ");
            int n = sc.nextInt();
            //b3 : check
            if (isValid(board, row, col, n)){
                board[row][col] = n;
                System.out.println("Da dien thang cong");
            } else {
                System.out.println("So khong hop le");
            }
        }
        System.out.println("Chuc mung ban da thang tro choi");
        sc.close();
    }

//    // Tao bang random
//    public static void init(int[][] board){
//        int count = 0;
//        // Tao bang
//        for(int i = 0; i < SIZE; i ++){
//            for(int j = 0; j < SIZE; j ++){
//                board[i][j] = 0;
//            }
//        }
//        // Tao bang ngau nhien
//        Random random = new Random();
//        show(board);
//    }

    public static void main(String[] args){
        int[][] board = {
                {0, 2, 0, 6, 0, 8, 0, 0, 0},
                {5, 8, 0, 0, 0, 9, 7, 0, 0},
                {0, 0, 0, 0, 4, 0, 0, 0, 0},
                {3, 7, 0, 0, 0, 0, 5, 0, 0},
                {6, 0, 0, 0, 0, 0, 0, 0, 4},
                {0, 0, 8, 0, 0, 0, 0, 1, 3},
                {0, 0, 0, 0, 2, 0, 0, 0, 0},
                {0, 0, 9, 8, 0, 0, 0, 3, 6},
                {0, 0, 0, 3, 0, 6, 0, 9, 0}
        };

        play(board);
    }
}
