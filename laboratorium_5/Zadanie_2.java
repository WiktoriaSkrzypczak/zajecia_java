import java.util.Scanner;

public class Zadanie_2 {
    private int tab[];
    private int liczbaelementow;


    public Zadanie_2(int tab[], int liczbaelementow)
    {
        this.tab = tab;
        this.liczbaelementow = liczbaelementow;
    }

    public boolean checkCombination()
    {
        return tab[liczbaelementow] == 1 && tab[liczbaelementow + 1] == 2 && tab[liczbaelementow + 2] == 3;
    }

    public int getLiczbaelementow()
    {
        return liczbaelementow;
    }

}
