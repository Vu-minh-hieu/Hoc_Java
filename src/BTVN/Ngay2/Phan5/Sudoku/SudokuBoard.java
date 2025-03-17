package BTVN.Ngay2.Phan5.Sudoku;

public class SudokuBoard {
    private int[][] board;
    private boolean[][] fixedCell;
    private static final int SIZE = 9;

    public SudokuBoard() {
        this.board = new int[][]{
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
        this.fixedCell = new boolean[SIZE][SIZE];
        markFixedCell();
    }

    // Danh dau o co dinh
    private void markFixedCell() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] != 0) {
                    fixedCell[i][j] = true;
                }
            }
        }
    }

    // Kiem tra nhung o da co dinh
    public boolean isFixedCell(int row, int col) {
        return fixedCell[row][col];
    }

    // In bang
    public void show() {
        System.out.println("SUDOKU GAME");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Kiem tra o dien co hop le khong
    public int isValid(int row, int col, int n) {
        // Kiem tra o co dinh
        if (isFixedCell(row, col)) {
            return 0;
        }
        // Kiem tra theo hang va cot
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == n || board[i][col] == n) {
                return -1;
            }
        }
        // Kiem tra trong o 3x3
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == n) {
                    return -1;
                }
            }
        }
        return 1;
    }

    // Dien gia tri
    public void setNum(int row, int col, int num) {
        if (!fixedCell[row][col]) {
            board[row][col] = num;
        }
    }

    // Kiem tra game da thang hay chua
    public boolean isWin() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
