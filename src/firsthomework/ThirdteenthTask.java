package firsthomework;

import java.util.Scanner;

public class ThirdteenthTask {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int fibonacci[] = new int[1000];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i <= 1000 ; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            if(fibonacci[i]== number )
            {
                System.out.println(i);
                break;
            }
            if(fibonacci[i]>number){
                System.out.println("-1");
                break;
            }
        }
    }
}

