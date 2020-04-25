import java.util.Scanner;

public class Zadanie_3
{
    private int dlugoscstringa;
    private int polowastringa;
    private String zadanie_3;

    public Zadanie_3(int dlugoscstringa, int polowastringa, String zadanie_3)
    {
        this.dlugoscstringa = dlugoscstringa;
        this.polowastringa = polowastringa;
        this.zadanie_3 = zadanie_3;
    }

    public static void main(String[] args)
    {
        Zadanie_3 zadanie_3 = new Zadanie_3(8, 4, "Wiktoria");
        System.out.println(zadanie_3.showString());
    }

    public int changeString()
    {
        dlugoscstringa = zadanie_3.length();
        polowastringa = dlugoscstringa/2;
        return polowastringa;
    }

    public String showString()
    {
        System.out.println(zadanie_3.substring(polowastringa));
        return zadanie_3.substring(polowastringa);
    }

    public int getDlugoscstringa()
    {
        return dlugoscstringa;
    }

    public int getPolowastringa()
    {
        return polowastringa;
    }

    public String getZadanie_3()
    {
        return zadanie_3;
    }
}
