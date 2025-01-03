package basics;

import java.util.Scanner;

public class GrossPayCalculator {

    public double calculateGrossPay(int hours, double rate) {
        return hours * rate;
    }

    public static void main(String[] args) {
        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("What is your hourly pay rate?");
        double rate = scanner.nextDouble();
        scanner.close();

        GrossPayCalculator grossPayCalculator = new GrossPayCalculator();
        double pay = grossPayCalculator.calculateGrossPay(hours, rate);

        System.out.println("Gross pay: " + pay);
    }
}
