package task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n = scanner.nextInt();
        System.out.println("The entered number is: " + n);
        int factorial = 1;
        while (n > 0) {
            factorial *= n;
            n--;
        }
        System.out.println("The factorial of the entered number is: " + factorial);
    }
}