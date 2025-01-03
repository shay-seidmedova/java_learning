package decision_structure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


class GradeMessageTest {

    @Test
    void getGradeMessage() {
        String simulatedInput = "B";
        ByteArrayInputStream testIn = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(testIn);

        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));

        GradeMessage.main(new String[]{});

        String output = testOut.toString();
        Assertions.assertTrue(output.contains("Great job!"));

        System.setIn(System.in);
        System.setOut(System.out);
    }
}