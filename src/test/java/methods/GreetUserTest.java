package methods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class GreetUserTest {

    @Test
    void getNameTest() {
        String simulatedInput = "Hagar\n";
        ByteArrayInputStream input = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(input);

        String name = GreetUser.getName();
        Assertions.assertEquals(name, "Hagar");
    }

    @Test
    void greetUserTest() {
        String name = "Hagar";
        ByteArrayOutputStream greeting = new ByteArrayOutputStream();
        System.setOut(new PrintStream(greeting));

        GreetUser.greetUser(name);

        String output = greeting.toString();
        Assertions.assertTrue(output.contains("Good morning, Hagar!"));
    }
}