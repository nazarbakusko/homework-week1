package firsthomework;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter tree numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int maxValue = Math.max(number1,Math.max(number2,number3));
        int minValue = Math.min(number1,Math.min(number2,number3));
        if (maxValue == minValue){
            System.out.println("Values are same!");
        }
        else {
            System.out.println("Min value is " + minValue);
            System.out.println("Max value is " + maxValue);
        }
    }
}
