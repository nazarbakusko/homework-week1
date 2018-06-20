package firsthomework;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if(number1>number2){
            System.out.println("Everage: "+(number1-number2));
        }else{
            System.out.println("Multiple: "+(number1+number2));
        }
    }
}
