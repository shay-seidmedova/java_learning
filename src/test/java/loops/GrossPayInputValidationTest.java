package loops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

class GrossPayInputValidationTest {

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
    void testForMaximumAllowedHours() {
        String simulatedInput = "40\n";
        ByteArrayInputStream testIn = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(testIn);

        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));

        GrossPayInputValidation.main(new String[]{});

        String output = testOut.toString();

        Assertions.assertTrue(output.contains("Your pay is 600.0"));
    }

    @Test
    void testForOvertimeHours() {
        String simulatedInput = "50\n30\n";
        ByteArrayInputStream testIn = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(testIn);

        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));

        GrossPayInputValidation.main(new String[]{});

        String output = testOut.toString();

        Assertions.assertTrue(output.contains("Invalid. Try again."));
        Assertions.assertTrue(output.contains("Your pay is 450.0"));
    }

    @Test
    void testForNegativeHours() {
        String simulatedInput = "-10\n30\n";
        ByteArrayInputStream testIn = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(testIn);

        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));

        GrossPayInputValidation.main(new String[]{});

        String output = testOut.toString();

        Assertions.assertTrue(output.contains("Invalid. Try again."));
        Assertions.assertTrue(output.contains("Your pay is 450.0"));

    }



}