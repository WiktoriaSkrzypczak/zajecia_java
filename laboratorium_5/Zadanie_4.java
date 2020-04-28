import java.util.Arrays;
import java.util.Collections;

public class Zadanie_4
{
    public int[] tab1;
    public int dlugosc;
    int roznica_od_tylu;
    String tablica;

    public Zadanie_4(int tab1[])
    {
        this.tab1 = tab1;
    }

    public int[] getTab1()
    {
        return tab1;
    }

    public int checkNumbers()
    {
        int dlugosc = tab1.length;
        int roznica_od_tylu = dlugosc - 1;
        return roznica_od_tylu;
    }

    public String reverseCombination(int[] tab1)
    {
        String tablica = "";

        for (int i = 0; i < tab1.length; i++)
        {
            tablica = tablica + tab1[dlugosc - roznica_od_tylu];
            roznica_od_tylu--;
        }

        return tablica;
    }
}







