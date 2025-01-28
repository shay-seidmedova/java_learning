package string;

import org.jetbrains.annotations.NotNull;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("Hello World and the rest of the universe!");
        reverseWords("Hello World and the rest of the universe!");
        addSpace("HelloWorld!It'sMeHagar!");
    }

    public static StringBuilder countWords(@NotNull String text) {
        var words = text.split(" ");
        String message = String.format("You have %d words", words.length);
        StringBuilder result = new StringBuilder(message + "\n");

        for(String word: words) {
            result.append(word).append("\n");
        }
        return result;
    }
    
    public static StringBuilder reverseWords(@NotNull String text) {
        StringBuilder result = new StringBuilder();
        for(int i=text.length()-1;i>=0;i--) {
            result.append(text.charAt(i));
        }
        return result;
    }

    public static StringBuilder addSpace(String text) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<text.length();i++) {
            if(i !=0 && Character.isUpperCase(text.charAt(i))) {
                result.append(" ").append(text.charAt(i));
            } else {
                result.append(text.charAt(i));
            }
        }
        return result;
    }
}
