package task05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number or a month");
        String[] arrayMonths = {"Ianuarie", "Februarie", "Martie", "Aprilie", "Mai", "Iunie", "Iulie", "August", "Septembrie", "Octombrie", "Noiembrie", "Decembrie"};
        String n = scanner.next();
        for (int i = 0; i < 12; i++) {
            if (n.equals(arrayMonths[i]))
                System.out.printf("you would enter the number corresponding to the month: %s", (i + 1));
            if (n.equals(String.valueOf(i + 1)))
                System.out.printf("You are enter the month %s", arrayMonths[i]);
        }
    }
}
