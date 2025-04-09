package BTVN.Lan2.Phan5.Sudoku.Model;

public class Node {
    private int x, y, value, oldValue;

    public Node() {
        this.x = 0;
        this.y = 0;
        this.value = 0;
        this.oldValue = 0;
    }

    public Node(int x, int y, int value) {
        this.x = x;
        this.y = y;
        this.value = value;
        this.oldValue = 0;
    }

    public Node(int x, int y, int value, int oldValue) {
        this.x = x;
        this.y = y;
        this.value = value;
        this.oldValue = oldValue;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getOldValue() {
        return oldValue;
    }
    public void setOldValue(int oldValue) {
        this.oldValue = oldValue;
    }
}
