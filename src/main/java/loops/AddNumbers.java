package loops;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again;

        do {
            System.out.println("Enter number 1 ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter number 2 ");
            double num2 = scanner.nextDouble();

            System.out.println("Sum of num1 and num2 " + (num1 + num2));
            System.out.println("Would you like to run again? type true if yes, false if no");
            again = scanner.nextBoolean();
        } while(again);
    }
}
