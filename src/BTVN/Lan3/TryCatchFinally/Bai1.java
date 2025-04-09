package BTVN.Lan3.TryCatchFinally;

import java.util.Random;
import java.util.Scanner;

public class Bai1 {
    private static final int size = 10;
    private int[] a;

    public Bai1() {
        Random random = new Random();
        this.a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = random.nextInt(100);
        }
    }

    public void input(int n) throws InvalidNumberException {
        if (n < 1 || n > size) {
            throw new InvalidNumberException("Gia tri " + n  + " vuot qua kich thuoc cua mang!");
        }
        System.out.println("Gia tri o vi tri " + n + " la: " + a[n - 1]);
    }

    public int[] getA() {
        return a;
    }

    public static void main(String[] args) {
        Bai1 arr = new Bai1();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mang so nguyen:");
        for (var num : arr.getA()) {
            System.out.print(num + " ");
        }
        System.out.println("\nNhap vi tri: ");

        try {
            String input = scanner.nextLine();
            int n = Integer.parseInt(input);
            arr.input(n);
        } catch (NumberFormatException e) {
            System.out.println("Vui long nhap so nguyen!");
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Chuong trinh ket thuc");
            scanner.close();
        }
    }
}
