package task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Enter two numbers:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("The greatest common divisor is: " + gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}