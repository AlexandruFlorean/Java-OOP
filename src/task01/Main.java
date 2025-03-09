package task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scanner.nextInt();
        System.out.printf("The entered number is: %d \n", n);
        System.out.printf("The factorial of the entered number is: %d", simple_Factorial(n));
    }
    public static int simple_Factorial(int n) {
        if(n == 1)
            return n;
        return n * simple_Factorial(--n);
    }
}