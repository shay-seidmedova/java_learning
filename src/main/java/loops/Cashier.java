package loops;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        System.out.println("How many items would you like to scan?");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;

        for (int i=0; i<quantity; i++) {
            System.out.println("What is the price of this item? ");
            double price = scanner.nextDouble();

            total = total + price;
        }

        System.out.println("Total price is " + total);
    }
}
