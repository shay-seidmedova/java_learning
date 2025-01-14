package decision_structure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TestResultsTest {

    @Test
    void getLetterGrade(){
        String simulatedInput = "88";
        ByteArrayInputStream testIn = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(testIn);

        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));

        TestResults.main(new String[]{});

        String output = testOut.toString();
        Assertions.assertTrue(output.contains("B"));

        System.setIn(System.in);
        System.setOut(System.out);
    }
}