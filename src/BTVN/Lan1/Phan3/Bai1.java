package BTVN.Lan1.Phan3;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String loc = s.replace("a", "");

        String dao = new StringBuilder(loc).reverse().toString();

        System.out.println(dao);

        sc.close();
    }
}
