package BTVN.Ngay2.Phan5.Sudoku;

import java.util.Scanner;

public class SudokuGame {
    private SudokuBoard board;
    private Scanner scanner;

    public SudokuGame() {
        board = new SudokuBoard();
        scanner = new Scanner(System.in);
    }

    // Bat dau choi
    public void play() {
        //init(board);
        Scanner sc = new Scanner(System.in);
        System.out.println("Choi game di bro :3");
        while (!board.isWin()) {
            //b1 : show
            board.show();
            //b2 : input
            System.out.print("Hang = ");
            int row = sc.nextInt() - 1;
            System.out.print("Cot = ");
            int col = sc.nextInt() - 1;
            System.out.print("Gia tri = ");
            int n = sc.nextInt();
            //b3 : check
            int status = board.isValid(row, col, n);
            if (status == 1) {
                board.setNum(row, col, n);
                System.out.println("Da dien thang cong!");
            } else if (status == 0) {
                System.out.println("Khong the dien vao o da co dinh!");
            } else {
                System.out.println("Gia tri khong hop le!");
            }
        }
        System.out.println("Chuc mung ban da thang tro choi!!");
        sc.close();
    }
}
