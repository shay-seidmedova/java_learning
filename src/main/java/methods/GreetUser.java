package methods;

import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) {
        String name = getName();
        greetUser(name);
    }

    public static String getName() {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.close();
        return name;
    }

    public static void greetUser(String name) {
        System.out.println("Good morning, " + name + "!");
    }
}
