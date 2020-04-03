import java.util.Date;

public class Książka extends Pozycja {
    String rodzajokladki;
    String gatunek;
    int iloscstron;
    public Książka(String tytul, String autor, Date datawydania, int cena, String rodzajokladki, String gatunek, int iloscstron){
        super(tytul, autor, datawydania, cena);
        this.rodzajokladki = rodzajokladki;
        this.gatunek = gatunek;
        this.iloscstron = iloscstron;
    }

}