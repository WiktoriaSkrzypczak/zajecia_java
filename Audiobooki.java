import java.util.Date;

public class Audiobooki extends  Pozycja{
    String lektor;
    int czas_trwania_audio;
    int wielkosc_pliku_audio;


    public Audiobooki(String tytul, String autor, Date datawydania, int cena, String lektor, int czas_trwania_audio, int wielkosc_pliku_audio)
    {
        super(tytul, autor, datawydania, cena);
        this.lektor = lektor;
        this.czas_trwania_audio = czas_trwania_audio;
        this.wielkosc_pliku_audio = wielkosc_pliku_audio;
    }
}