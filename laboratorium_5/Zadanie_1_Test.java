import org.junit.jupiter.api.Test;
import org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.*;

public class Zadanie_1_Test {

    @Test
    void testCorrectVariableAssign() {
        //Sprawdzam czy poprawnie zwracane są temperatury założone dla temp1
        int expected1 = 30;
        int expected2 = 80;
        Zadanie_1 zadanie_1 = new Zadanie_1(expected1, expected2);
        assertEquals(expected1, zadanie_1.getTemp1());
        assertEquals(expected2, zadanie_1.getTemp2());
    }

    @Test
    void testNormalTemperatures() {
        //Sprawdzam czy poprawnie zwracane są temperatury założone dla temp2
        int temp1 = 80;
        int temp2 = 99;
        Zadanie_1 zadanie_1 = new Zadanie_1(temp1, temp2);
        assertFalse(zadanie_1.checkTemp());
    }

    @Test
    void testOneTempOutOfRange() {
        int temp1 = 50;
        int temp2 = 101;
        Zadanie_1 zadanie_1 = new Zadanie_1(temp1, temp2);
        assertTrue(zadanie_1.checkTemp());
    }

    @Test
    void testTwoTempsOutOfRange() {
        int temp1 = 230;
        int temp2 = 150;
        Zadanie_1 zadanie_1 = new Zadanie_1(temp1, temp2);
        assertTrue(zadanie_1.checkTemp());
    }
}
