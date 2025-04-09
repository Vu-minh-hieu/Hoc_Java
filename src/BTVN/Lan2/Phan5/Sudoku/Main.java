package BTVN.Ngay2.Phan5.Sudoku;

import BTVN.Ngay2.Phan5.Sudoku.Model.Game;
import BTVN.Ngay2.Phan5.Sudoku.View.GameView;
import BTVN.Ngay2.Phan5.Sudoku.Controller.GameControl;

public class Main {
    public static void main(String[] args) {
        int[][] b = new int[][]{
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
        Game game = new Game(b);
        GameView view = new GameView(game);
        GameControl control = new GameControl(game, view);
        control.play();
    }
}
