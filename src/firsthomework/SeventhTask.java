package firsthomework;

import java.util.Scanner;

public class SeventhTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        boolean num = false;
        if (number1%number2==0){
            num = true;
            System.out.println(num);
            System.out.println(number1/number2);
        }else{
            System.out.println(num);
            System.out.println(number1/number2);
            System.out.println(number1%number2);
        }
    }
}
