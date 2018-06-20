package firsthomework;

import java.util.Scanner;

public class TenthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter binary number");
        String binaryString = scanner.nextLine();
        System.out.println("Output in decimal: "+Integer.parseInt(binaryString,2));
        System.out.println("Please enter decimal number");
        String decimalString = scanner.nextLine();
        System.out.println("Output in binary: "+Integer.toBinaryString(Integer.parseInt(decimalString)));
    }
}
