package firsthomework;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter time from 0 to 24 ");
        int time = scanner.nextInt();
        if((time >= 9) && (time <= 18)){
            System.out.println("I'm at work!");
        }else{
            System.out.println("I'm rest");
        }
    }
}
