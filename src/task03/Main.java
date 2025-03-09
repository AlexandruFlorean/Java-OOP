package task03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int n;
        System.out.println("Please enter the number:");
        n = scanner.nextInt();
        int div = n;
        System.out.println("The divisors of the number is:");
        while (div > 0) {
            if (n % div == 0)
                System.out.println(div);
            div--;
        }
    }
}