import java.util.Date;

public class Płyty_Muzyczne extends Pozycja
{
    String nazwakompozytora;
    String gatunek_muzyczny;
    int czas_albumu;

    public Płyty_Muzyczne(String tytul, String autor, Date datawydania, int cena, String nazwakompozytora, String gatunek_muzyczny, int czas_albumu)
    {
        super(tytul, autor, datawydania, cena);
        this.nazwakompozytora = nazwakompozytora;
        this.gatunek_muzyczny = gatunek_muzyczny;
        this.czas_albumu = czas_albumu;
    }
}
