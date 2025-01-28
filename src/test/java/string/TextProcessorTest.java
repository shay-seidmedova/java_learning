package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextProcessorTest {

    @Test
    void countWordsTest() {
        String expectedString = """
        You have 8 words
        Hello
        World
        and
        the
        rest
        of
        the
        universe!
        """;
        String actualString = TextProcessor.countWords("Hello World and the rest of the universe!").toString();
        assertEquals(expectedString, actualString, "Number of words don't match.");
    }

    @Test
    void reverseWordsTest() {
        String expectedString = "!esrevinu eht fo tser eht dna dlroW olleH";
        String actualString = TextProcessor.reverseWords("Hello World and the rest of the universe!").toString();
        assertEquals(expectedString, actualString, "Strings don't match");
    }

    @Test
    void addSpaceTest() {
        String expectedString = "Hello World!";
        String actualString = TextProcessor.addSpace("HelloWorld!").toString();
        assertEquals(expectedString, actualString, "Strings are not the same");
    }
}