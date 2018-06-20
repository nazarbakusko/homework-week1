package extrafirsthomework;

import java.util.Scanner;

public class ExtraTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a: ");
        int a = scanner.nextInt();
        System.out.println("Please enter b: ");
        int b = scanner.nextInt();
        System.out.println("Please enter c: ");
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && c + b > a) {
            if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                System.out.println("Your triangle is rectangular!");
            } else {
                System.out.println("Your triangle isn't rectangular!");
            }
        } else {
            System.out.println("It isn't triangle!");
        }
    }
}
