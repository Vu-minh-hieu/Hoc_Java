package BTVN.Ngay2.Phan5.Sudoku.Model;

public class Game {
    private Node[][] board;
    private boolean[][] fixedCell;
    private static final int SIZE = 9;

    public Game() {
        this.board = new Node[SIZE][SIZE];
        this.fixedCell = new boolean[SIZE][SIZE];
    }

    public Game(int[][] b) {
        this.board = new Node[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                board[i][j] = new Node(i, j, b[i][j]);
            }
        }
        this.fixedCell = new boolean[SIZE][SIZE];
        markFixedCell();
    }

    // Danh dau o co dinh
    private void markFixedCell() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j].getValue() != 0) {
                    fixedCell[i][j] = true;
                }
            }
        }
    }

    // Kiem tra nhung o da co dinh
    public boolean isFixedCell(int row, int col) {
        return fixedCell[row][col];
    }

    // Kiem tra o dien co hop le khong
    public int isValid(int row, int col, int n) {
        // Kiem tra o co dinh
        if (isFixedCell(row, col)) {
            return 0;
        }
        // Kiem tra theo hang va cot
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i].getValue() == n || board[i][col].getValue() == n) {
                return -1;
            }
        }
        // Kiem tra trong o 3x3
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j].getValue() == n) {
                    return -1;
                }
            }
        }
        return 1;
    }

    // Dien gia tri
    public void setVal(int row, int col, int num) {
        if (!fixedCell[row][col]) {
            board[row][col].setValue(num);
        }
    }

    // Lay gia tri hien tai
    public int getVal(int row, int col) {
        return board[row][col].getValue();
    }

    // Kiem tra game da thang hay chua
    public boolean isWin() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j].getValue() == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public int getSize(){
        return SIZE;
    }

    public Node getNode(int row, int col){
        return board[row][col];
    }
}