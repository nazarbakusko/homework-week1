package firsthomework;

import java.util.Scanner;

public class EleventhTask {
    public static void main(String[] args) {
        long n,fact=1;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter number: ");
        n = scanner.nextLong();
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("fact = "+fact);
    }
}
