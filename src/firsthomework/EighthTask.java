package firsthomework;

import java.util.Scanner;

public class EighthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        boolean equal = false;
        if((number1%10)==(number2%10)){
            equal = true;
            System.out.println(equal);
        }else {
            System.out.println(equal);
        }
    }
}
