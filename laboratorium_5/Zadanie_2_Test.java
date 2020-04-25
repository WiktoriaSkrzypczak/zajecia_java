import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Zadanie_2_Test
{
    @Test
    void testCorrectVariableAssign()
    {
        //Sprawdzam czy poprawnie zwracane są liczby
        int[] expected1 = {1, 2, 3, 4, 5, 6};
        int expected2 = 7;
        Zadanie_2 zadanie_2 = new Zadanie_2(expected1, expected2);
        assertEquals(expected2, zadanie_2.getLiczbaelementow());
    }

    @Test
    void testCorrectCombination()
    {
        int[] expected1 = {1, 2, 3, 4, 5, 6};
        int expected2 = 0;
        Zadanie_2 zadanie_2 = new Zadanie_2(expected1, expected2);
        assertTrue(zadanie_2.checkCombination());
    }

    @Test
    void testWrongCombination()
    {
        int expected2 = 0;
        int[] expected1 = {1, 2, 4, 5, 6, 7};
        Zadanie_2 zadanie_2 = new Zadanie_2(expected1, expected2);
        assertFalse(zadanie_2.checkCombination());
}
}

