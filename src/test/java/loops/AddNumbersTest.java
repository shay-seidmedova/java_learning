package loops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;


class AddNumbersTest {

    private InputStream originalIn;
    private PrintStream originalOut;

    @BeforeEach
    void setUp() {
        originalIn = System.in;
        originalOut = System.out;
    }

    @AfterEach
    void tearDown() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    @Test
    void getSumResultOnce() {
        String simulatedInput = "3\n5\nfalse";
        ByteArrayInputStream testIn = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(testIn);

        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));

        AddNumbers.main(new String[]{});

        String output = testOut.toString();
        Assertions.assertTrue(output.contains("Sum of num1 and num2 8.0"));
    }

    @Test
    void getSumResultTwice() {
        String simulatedInput = "3\n5\ntrue\n2\n7\nfalse";
        ByteArrayInputStream testIn = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(testIn);

        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));

        AddNumbers.main(new String[]{});

        String output = testOut.toString();
        Assertions.assertTrue(output.contains("Sum of num1 and num2 8.0"));
        Assertions.assertTrue(output.contains("Sum of num1 and num2 9.0"));
    }
}