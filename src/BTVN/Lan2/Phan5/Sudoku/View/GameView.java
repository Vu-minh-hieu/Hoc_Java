package BTVN.Lan2.Phan5.Sudoku.View;

import BTVN.Lan2.Phan5.Sudoku.Model.Game;
import java.util.Scanner;

public class GameView {
    private Game game;
    private Scanner scanner;

    public GameView(Game game) {
        this.game = game;
        scanner = new Scanner(System.in);
    }

    // In bang
    public void show() {
        System.out.println("SUDOKU GAME");
        for (int i = 0; i < game.getSize(); i++) {
            for (int j = 0; j < game.getSize(); j++) {
                System.out.print(game.getVal(i,j) + "\t");
            }
            System.out.println();
        }
    }

    // Nhap du lieu
    public int[] input() {
        int[] input = new int[3];
        System.out.println("Hay nhap hang, cot, gia tri: ");
        System.out.print("Hang = ");
        input[0] = scanner.nextInt() - 1;
        System.out.print("Cot = ");
        input[1] = scanner.nextInt() - 1;
        System.out.print("Gia tri = ");
        input[2] = scanner.nextInt();
        return input;
    }

    public Scanner getScanner() {
        return scanner;
    }
}
