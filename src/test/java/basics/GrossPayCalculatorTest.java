package basics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class GrossPayCalculatorTest {

    @Test
    void calculateGrossPayTest() {
        GrossPayCalculator grossPayCalculator = new GrossPayCalculator();
        double pay = grossPayCalculator.calculateGrossPay(30, 15);

        Assertions.assertEquals(pay, 450.0);
    }

    @Test
    void getGrossPayWithMockInput() {
        String simulatedInput = "30\n15\n";
        ByteArrayInputStream testIn = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(testIn);

        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream((testOut)));

        GrossPayCalculator.main(new String[]{});

        String output = testOut.toString();
        Assertions.assertTrue(output.contains("Gross pay: 450.0"));

        System.setIn(System.in);
        System.setOut(System.out);
    }
}