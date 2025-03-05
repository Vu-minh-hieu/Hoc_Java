package GameBattleShip;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static int SIZE = 10;
    public static int NUM_BATTLE = 3;
    public static int NUM_FIGHT = 6;

    //in bang
    public static void show(int[][] game, boolean isCheat){
        System.out.println("BATTLE GAME - FIGHTING NOW");
        for(int i = 0; i < SIZE; i ++){
            for(int j = 0; j < SIZE; j ++){
                if(isCheat){
                    System.out.print(game[i][j] + "\t");
                }
                else{
                    if(game[i][j] == -1 || game[i][j] == -2){
                        System.out.print("*" + "\t");
                    }
                    else{
                        System.out.print(game[i][j] + "\t");
                    }
                }
            }
            System.out.print("\n");
        }
    }

    //dem so tau xung quanh
    public static int count(int[][] game, int x, int y){
        int s = 0;
        int xUp = x < SIZE - 1 ? x + 1 : SIZE - 1;
        int xLow = x > 0 ? x - 1 : 0;
        int yUp = y < SIZE - 1 ? y + 1 : SIZE - 1;
        int yLow = y > 0 ? y - 1 : 0;
        for(int i = xLow; i <= xUp; i++){
            for(int j = yLow; j <= yUp; j++){
                if(game[i][j] == -1){
                    s++;
                }
            }
        }
        return s;
    }

    //shoot
    public static void fight(int[][] game, int x, int y){
        if(game[x][y] == -1){
            game[x][y] = 10;
            NUM_BATTLE --;
        }
        else{
            game[x][y] = count(game, x, y);
        }
        NUM_FIGHT --;
    }

    //kiem tra tinh trang
    public static int getStatus(){
        if(NUM_BATTLE == 0){
            return 1;
        }
        if(NUM_FIGHT == 0){
            return -1;
        }
        return 0;
    }

    //bat dau choi
    public static void play(int[][] game){
        init(game);
        Scanner sc = new Scanner(System.in);
        System.out.println("Choi game di e");
        while (true){
            //b1 : show
            show(game,false);
            //b2 : input
            System.out.print("x = ");
            int x = sc.nextInt() - 1;
            System.out.print("y = ");
            int y = sc.nextInt() - 1;
            //b3 : fight
            fight(game, x, y);
            //b4 : check
            int status = getStatus();
            if(status == 1){
                System.out.println("You win");
                break;
            }
            if(status == -1){
                System.out.println("You lose");
                break;
            }
        }
        sc.close();
    }

    //tao bang random
    public static void init(int[][] game){
        int count = 0;
        //init game
        for(int i = 0; i < SIZE; i ++){
            for(int j = 0; j < SIZE; j ++){
                game[i][j] = -2;
            }
        }
        //random game
        Random random = new Random();
        while (count < NUM_BATTLE){
            int x = random.nextInt(SIZE);
            int y = random.nextInt(SIZE);
            if(game[x][y] != -1){
                game[x][y] = -1;
                count ++;
            }
        }
        show(game,true);
    }
    public static void main(String[] args){
        int[][] game = {{-2,-2,-2,-2,-2,-2,-2,-2,-2,-2},
                {-2,-2,-2,-2,-2,-2,-2,-2,-2,-2},
                {-2,-2,-1,-1,-1,-2,-2,-2,-2,-2},
                {-2,-2,-2,-2,-2,-2,-2,-2,-2,-2},
                {-2,-2,-2,-2,-2,-2,-2,-2,-2,-2},
                {-2,-2,-2,-2,-2,-2,-2,-2,-2,-2},
                {-2,-2,-2,-2,-2,-2,-2,-2,-2,-2},
                {-2,-2,-2,-2,-2,-2,-2,-2,-2,-2},
                {-2,-2,-2,-2,-2,-2,-2,-2,-2,-2},
                {-2,-2,-2,-2,-2,-2,-2,-2,-2,-2}};
        play(game);
    }
}
