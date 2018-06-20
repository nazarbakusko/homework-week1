package firsthomework;

import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int sum = number1+number2;
        if(sum>=11&&sum<=19){
            System.out.println("Sum of two numbers: "+sum);
        }else{
            System.out.println("Your number isn't in range of 11 and 19!");
        }
    }
}
