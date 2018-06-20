package firsthomework;

import java.util.Scanner;

public class TwelfthTask {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int fibonacci[] = new int[number+1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i <= number ; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        System.out.println("Fibonacci = "+ fibonacci[number]);
    }
}
