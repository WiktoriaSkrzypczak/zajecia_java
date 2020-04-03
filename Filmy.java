import java.util.Date;

public class Filmy extends Pozycja{
    String gatunek_filmu;
    String glowny_aktor;
    int czas_trwania_filmu;
    public Filmy(String tytul, String autor, Date datawydania, int cena, String gatunek_filmu, String glowny_aktor, int czas_trwania_filmu)
    {
        super(tytul, autor, datawydania, cena);
        this.gatunek_filmu = gatunek_filmu;
        this.glowny_aktor = glowny_aktor;
        this.czas_trwania_filmu = czas_trwania_filmu;
    }
}
