package task03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n = scanner.nextInt();
        System.out.println("The divisors of the number is:");
        for(int div = n; div > 0; div--) {
            if (n % div == 0)
                System.out.println(div);
        }
    }
}