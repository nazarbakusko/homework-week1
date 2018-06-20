package firsthomework;

import java.util.Scanner;

public class NinthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        String number = scanner.nextLine();
        int i = 0;
        int count = 0;
        char ch = '5';
        for (i=0; i < number.length(); i++) {
            if (ch==number.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
