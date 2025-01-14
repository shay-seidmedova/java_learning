package methods;

import java.util.Scanner;

public class InstantCreditCheck {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();

        scanner.close();

        boolean qualified = isUserQualified(salary, creditScore);
        notifyUser(qualified);
    }

    public static double getSalary() {
        System.out.println("What is your salary?");
        return scanner.nextDouble();
    }

    public static int getCreditScore() {
        System.out.println("What is your credit score?");
        return scanner.nextInt();
    }

    public static boolean isUserQualified(double salary, int creditScore) {
        return salary > 50000 && creditScore > 700;
    }

    public static void notifyUser(boolean qualified) {
        if (qualified) {
            System.out.println("Congratulations! You have been approved!");
        } else {
            System.out.println("Sorry you have been denied :(");
        }
    }
}
