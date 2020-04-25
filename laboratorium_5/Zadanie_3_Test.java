import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Zadanie_3_Test
{
    @Test
    void testCorrectVariableAssign()
    {
        int expected1 = 10;
        int expected2 = 5;
        String expected3 = "Wiktoriabb";
        Zadanie_3 zadanie_3 = new Zadanie_3(expected1, expected2, expected3);
        assertEquals(expected1, zadanie_3.getDlugoscstringa());
        assertEquals(expected2, zadanie_3.getPolowastringa());
        assertEquals(expected3, zadanie_3.getZadanie_3());
    }

    @Test
    void testCorrectSizeChange()
    {
        int expected1 = 4;
        int expected2 = 2;
        String expected3 = "abcd";
        Zadanie_3 zadanie_3 = new Zadanie_3(expected1, expected2, expected3);
        assertEquals(expected2, zadanie_3.changeString());
    }

    @Test
    void testShowFalseString()
    {
        int expected1 = 6;
        int expected2 = 3;
        String expected3 = "cdefgh";
        Zadanie_3 zadanie_3 = new Zadanie_3(expected1, expected2, expected3);
        assertNotEquals(expected3, zadanie_3.showString());
    }


}
