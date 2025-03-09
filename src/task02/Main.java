package task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("The greatest common divisor is: %d", gcd(a, b));
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}