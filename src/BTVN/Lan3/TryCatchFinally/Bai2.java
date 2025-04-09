package BTVN.Lan3.TryCatchFinally;

//import java.util.Scanner;

public class Bai2 {
    public static void checkNumberString(String input) throws InvalidNumberException {
        String[] parts = input.trim().split("\\s+");
        int count = 0;

        for (String part : parts) {
            try {
                Double.parseDouble(part);
                count++;
            } catch (NumberFormatException e) {
                throw new InvalidNumberException("chuoi ky tu khong phai so!");
            }
        }
        System.out.println("true, co " + count + " so");
    }

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        //System.out.println("Nhap chuoi so:");
        //String input = scanner.nextLine();
        String input = "2 34.5a -12.9 0 12 1.98";

        try {
            checkNumberString(input);
        } catch (InvalidNumberException e) {
            System.out.println("false, " + e.getMessage());
        } finally {
            System.out.println("Chuong trinh ket thuc!");
            //scanner.close();
        }
    }
}
