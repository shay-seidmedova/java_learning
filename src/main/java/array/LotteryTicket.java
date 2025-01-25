package array;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    // final - cannot be changed
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        Random random = new Random();
        int[] ticket = generateNumbers(random);
        printTicket(ticket);
    }

    public static int[] generateNumbers(Random random) {
        int[] ticket = new int[LENGTH];

        for(int i=0; i<LENGTH;i++) {
            int randomNumber;

            do{
                randomNumber = random.nextInt(1, MAX_TICKET_NUMBER);
            }while(search(ticket, randomNumber));
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    public static boolean search(int[] array, int numberToSearchFor) {
        for(int value : array) {
            if(value == numberToSearchFor) return true;
        }
        return false;
    }

    public static void printTicket(int[] array) {
        Arrays.sort(array);
        for(int value : array) {
            System.out.print(value + " | ");
        }
    }
}
