package decision_structure;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        double salary = 1000;
        double bonus = 250;
        int quota = 10;

        System.out.println("How many sales did the employee have this week? ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales > quota) {
            salary = salary + bonus;
        }

        System.out.printf("Salary is: " + salary);
    }
}