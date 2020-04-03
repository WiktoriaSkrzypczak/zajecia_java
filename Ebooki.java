import java.util.Date;

public class Ebooki extends Pozycja {
    int wielkosc_pliku_ebook;
    String rodzaj_pliku;
    public Ebooki(String tytul, String autor, Date datawydania,  int cena, int wielkosc_pliku_ebook, String rodzaj_pliku)
    {
        super(tytul, autor, datawydania, cena);
        this.wielkosc_pliku_ebook = wielkosc_pliku_ebook;
        this.rodzaj_pliku = rodzaj_pliku;
    }
}



