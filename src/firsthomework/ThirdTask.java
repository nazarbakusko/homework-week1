package firsthomework;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        int number = scanner.nextInt();
        if (number%7==0){
            System.out.println(number*2);
        }else{
            System.out.println("Wrong number");
        }
    }
}
