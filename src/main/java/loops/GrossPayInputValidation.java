package loops;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        double rate = 15;
        double maxHours = 40;
        System.out.println("How many hours did you work this week?");

        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while(hoursWorked > maxHours || hoursWorked < 0) {
            System.out.println("Invalid. Try again.");
            hoursWorked = scanner.nextDouble();
        }

        double pay = hoursWorked * rate;
        System.out.println("Your pay is " + pay);
    }
}
