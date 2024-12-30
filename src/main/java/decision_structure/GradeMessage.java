package decision_structure;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("What is your grade?");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        String message;

        switch(grade) {
            case "A":
                message = "Excellent job!";
                break;

            case "B":
                message = "Great job!";
                break;

            case "C":
                message = "Good job!";
                break;

            case "D":
                message = "You can do better!";
                break;

            case "F":
                message = "Uh oh";
                break;

            default:
                message = "Invalid grade. Try again";
                break;
        }

        System.out.println(message);
    }
}
