package extrafirsthomework;

import java.util.Scanner;

public class ExtraTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three-digits number: ");
        int number = scanner.nextInt();
        if (number % 10 == (int)(number / 100) && number % 10 == ((int)(number / 10)) % 10) {
            System.out.println("Three equal digits");
        } else if(number % 10 == (int)(number / 100) || number % 10 == ((int)(number / 10)) % 10 || (int)(number / 100) == ((int)(number / 10)) % 10) {
            System.out.println("Some of your digits are equal");
        } else System.out.println("There are no equal digits");
    }
}
