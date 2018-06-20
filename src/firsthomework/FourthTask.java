package firsthomework;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        double number = scanner.nextDouble();
        if ((number>=0.0)&&(number<=1)){
            System.out.println("Your number is in the range of 0 and 1");
        }else if(number<0.0){
            System.out.println("Your number is less than 0");
        }else if(number>0.0) {
            System.out.println("Your number is greater than 0");
        }
    }
}
