package BTVN.Ngay1.Phan3;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] temp = s.split("\\s+");
        int count = 0;
        char[] check = s.toCharArray();
        for(var c:check){
            if(c >= 'a' && c <='z' || c >= 'A' && c <= 'Z'){
                count = 1;
            }
        }
        if (count == 1){
            System.out.println("False");
        }
        else{
            System.out.println("True, co " + temp.length + " so");
        }

        sc.close();
    }
}
