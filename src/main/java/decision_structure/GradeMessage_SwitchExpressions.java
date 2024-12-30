package decision_structure;

import java.util.Scanner;

public class GradeMessage_SwitchExpressions {
    public static void main(String[] args) {
        System.out.println("What is your letter grade?");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        String message = switch(grade) {
            case "A" -> "Excellent job!";
            case "B" -> "Great job!";
            // multiline cases
            case "C" -> {
                System.out.println("C is not bad!");
                yield "Good job!";
            }
            case "D" -> "You can do better!";
            case "F" -> "Uh oh!";
            default -> "Invalid grade. Try again";
        };

        System.out.println(message);
    }
}