package decision_structure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class QuotaCalculatorTest {

    @Test
    void getQuotaMessage() {
        String simulatedInput = "12";
        ByteArrayInputStream testIn = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(testIn);

        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));

        QuotaCalculator.main(new String[]{});
        String output = testOut.toString().trim();

        System.out.println(output);

        Assertions.assertTrue(output.contains("Congrats! You met your quota!"));

        System.setIn(System.in);
        System.setOut(System.out);
    }

}