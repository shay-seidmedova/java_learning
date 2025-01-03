package loops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;


class CashierTest {

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
    void getGroceryTotal() {
        String simulatedInput = "3\n10\n20\n30\n";
        ByteArrayInputStream testIn = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(testIn);

        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));

        Cashier.main(new String[]{});

        String output = testOut.toString();
        Assertions.assertTrue(output.contains("Total price is 60.0"));
    }
}