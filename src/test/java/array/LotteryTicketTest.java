package array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTicketTest {
    int[] ticket;

    @BeforeEach
    void setUp() {
        Random mockRandom = Mockito.mock(Random.class);
        Mockito.when(mockRandom.nextInt(1, 69))
                .thenReturn(12, 63, 41 ,9, 45, 7);
        ticket = LotteryTicket.generateNumbers(mockRandom);
    }


    @Test
    void arrayLengthTest() {
        assertEquals(6, ticket.length, "Ticket should have exactly 6 numbers!");
    }

    @Test
    void withinBoundsTest() {
        for(int value: ticket) {
            assertTrue(value >= 1 && value <= 69, "Number should be between 1 and 69 inclusive!");
        }
    }

    @Test
    void uniqueNumbersTest(){
        assertTrue(LotteryTicket.search(ticket, 12));
        assertFalse(LotteryTicket.search(ticket, 60));
    }

    @Test
    void testGenerateNumbersWithMock(){
        int[] expected = {12, 63, 41 ,9, 45, 7};
        assertArrayEquals(expected, ticket, "The ticked needs to match the mocked values");
    }
}