package task04;

import java.util.Scanner;

public class Main {

    public static boolean prime_Number(int a) {
        if (a < 2)
            return false;
        for (int i = 2; i < a; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int n;
        if (args.length == 0) {
            System.out.println("Enter the number of numbers:");
            n = scanner.nextInt();
        } else {
            n = Integer.parseInt(args[0]);
            System.out.printf("Please enter %s numbers\n", args[0]);
        }
        int[] array;
        array = new int[n];
        System.out.println("Please enter the numbers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Prime numbers are:");
        for (int i = 0; i < n; i++) {
            if (prime_Number(array[i]))
                System.out.println(array[i]);
        }
    }
}
