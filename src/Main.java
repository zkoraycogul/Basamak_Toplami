import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, total = 1, numberLength = 0, result = 0;
        System.out.print("Sayi Giriniz : ");
        number = input.nextInt();
        int copyNumber = number, copyNumber2 = number;

        while (copyNumber != 0) {
            int a = copyNumber % 10;
            result += a;
            copyNumber = copyNumber / 10;
        }
        System.out.println("Rakamlar Toplmaı = " + result);
    }
}