package methods;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class InstantCreditCheckTest {

    @Test
    void getSalaryTest() {
        String simulatedInput = "60000\n750\n";
        ByteArrayInputStream input = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(input);

        double salaryCall = InstantCreditCheck.getSalary();
        int creditScoreCall = InstantCreditCheck.getCreditScore();

        Assertions.assertEquals(60000.0, salaryCall);
        Assertions.assertEquals(750, creditScoreCall);
    }


    @Test
    void isUserQualifiedTest() {
        boolean qualified = InstantCreditCheck.isUserQualified(60000.0, 750);
        Assertions.assertTrue(qualified);
    }

    @Test
    void notifyUserApproveTest() {

        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));

        InstantCreditCheck.notifyUser(true);

        String output = testOut.toString();
        Assertions.assertTrue(output.contains("Congratulations! You have been approved!"));
    }

    @Test
    void notifyUserRejectTest() {

        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));

        InstantCreditCheck.notifyUser(false);

        String output = testOut.toString();
        Assertions.assertTrue(output.contains("Sorry you have been denied :("));
    }
}