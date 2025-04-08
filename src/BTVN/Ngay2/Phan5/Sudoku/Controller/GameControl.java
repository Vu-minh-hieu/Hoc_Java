package BTVN.Ngay2.Phan5.Sudoku.Controller;

import BTVN.Ngay2.Phan5.Sudoku.Model.Game;
import BTVN.Ngay2.Phan5.Sudoku.Model.Node;
import BTVN.Ngay2.Phan5.Sudoku.View.GameView;

import java.util.Stack;

public class GameControl {
    private Game game;
    private GameView view;
    private Stack<Node> undo;
    private Stack<Node> redo;

    public GameControl(Game game, GameView view) {
        this.game = game;
        this.view = view;
        this.undo = new Stack<>();
        this.redo = new Stack<>();
    }

    //Quay lai buoc truoc
    public void undo(){
        if (undo.isEmpty()) {
            System.out.println("Khong co buoc nao de undo!");
        } else {
            Node node = undo.pop();
            int curValue = game.getVal(node.getX(), node.getY());
            game.setVal(node.getX(), node.getY(), node.getOldValue());
            redo.push(new Node(node.getX(), node.getY(), node.getOldValue(), curValue));
            System.out.println("Undo thang cong!");
        }
    }

    //Tro lai buoc truoc khi undo
    public void redo(){
        if (redo.isEmpty()) {
            System.out.println("Khong co buoc nao de redo!");
        } else {
            Node node = redo.pop();
            int curValue = game.getVal(node.getX(), node.getY());
            game.setVal(node.getX(), node.getY(), node.getOldValue());
            undo.push(new Node(node.getX(), node.getY(), node.getOldValue(), curValue));
            System.out.println("Redo thang cong!");
        }
    }

    // Bat dau choi
    public void play() {
        //init(game);
        System.out.println("Choi game di bro :3");
        while (!game.isWin()) {
            //b1 : show
            view.show();
            System.out.println("1. Dien ");
            System.out.println("2. Undo ");
            System.out.println("3. Redo ");
            System.out.println("Hay chon chuc nang (dien so): ");
            int function = view.getScanner().nextInt();

            switch (function) {
                case 1:
                    //b2 : input
                    int[] input = view.input();
                    int row = input[0];
                    int col = input[1];
                    int n = input[2];
                    //b3 : check
                    int status = game.isValid(row, col, n);
                    if (status == 1) {
                        int oldValue = game.getVal(row, col);
                        game.setVal(row, col, n);
                        undo.push(new Node(row, col, n, oldValue));
                        redo.clear();
                        System.out.println("Da dien thang cong!");
                    } else if (status == 0) {
                        System.out.println("Khong the dien vao o da co dinh!");
                    } else {
                        System.out.println("Gia tri khong hop le!");
                    }
                    break;
                case 2:
                    undo();
                    break;
                case 3:
                    redo();
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        }
        view.show();
        System.out.println("Chuc mung ban da thang tro choi!!");
    }
}
