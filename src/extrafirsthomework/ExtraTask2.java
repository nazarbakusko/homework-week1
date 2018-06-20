package extrafirsthomework;

import java.util.Scanner;

public class ExtraTask2 {

    public static int cubeOrZero(int number) {
        if (number > 0) {
            return (int) Math.pow(number, 3);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter tree numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println(cubeOrZero(number1));
        System.out.println(cubeOrZero(number2));
        System.out.println(cubeOrZero(number3));
    }
}
