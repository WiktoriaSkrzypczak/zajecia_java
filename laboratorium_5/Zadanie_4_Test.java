import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Zadanie_4_Test {

    @Test
    void testCorrectVariableAssign()
    {
        //Sprawdzam czy poprawnie zwracane są wartości tablicy przypisane
        int expectedtab[] = {1, 2, 3, 4} ;
        Zadanie_4 zadanie_4 = new Zadanie_4(expectedtab);
        assertEquals(expectedtab, zadanie_4.getTab1());
    }


    @Test
    void testCorrectCheckNumbers()
    {
        int expectedtab[] = {1, 2, 3, 4} ;
        int expected_roznica_od_tylu = 3;
        Zadanie_4 zadanie_4 = new Zadanie_4(expectedtab);
        assertEquals(expected_roznica_od_tylu, zadanie_4.checkNumbers());
    }

    @Test
    void testFalseCheckNumbers()
    {
        int expectedtab[] = {1, 2, 3, 4} ;
        int expected_roznica_od_tylu = 2;
        Zadanie_4 zadanie_4 = new Zadanie_4(expectedtab);
        assertNotEquals(expected_roznica_od_tylu, zadanie_4.checkNumbers());
    }

    @Test
    void testFalseCombination()
    {
        int expectedtab1[] = {1, 2, 3, 4} ;
        String expectedtab2 = "321";
        Zadanie_4 zadanie_4 = new Zadanie_4(expectedtab1);
        assertNotEquals(expectedtab2, zadanie_4.reverseCombination(expectedtab1));
    }
}

