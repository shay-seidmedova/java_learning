package decision_structure;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SalaryCalculatorTest {

    @Test
    void calculateSalary(){
        String simulatedInput = "20";
        ByteArrayInputStream testIn = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(testIn);

        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));

        SalaryCalculator.main(new String[]{});

        String output = testOut.toString();
        assertTrue(output.contains("Salary is: 1250.0"));

        System.setIn(System.in);
        System.setOut(System.out);
    }
}