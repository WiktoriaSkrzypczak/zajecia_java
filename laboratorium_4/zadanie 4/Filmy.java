public class Filmy
{
    String gatunek_filmu;
    String glowny_aktor;
    int czas_trwania_filmu;
    private final Pozycja pozycja_filmy;

public Filmy()
{
    this.pozycja_filmy = new Pozycja();
    pozycja_filmy.setTytul("Żelazne serce");
    pozycja_filmy.setAutor("Kazimierz Jakis");
    pozycja_filmy.setCena(30);
    pozycja_filmy.setNumerPozycji(2222);
    pozycja_filmy.setStatusDostepny(true);
    this.gatunek_filmu = "akcja";
    this.glowny_aktor = "Cezary Pazura";
    this.czas_trwania_filmu = 30;
}

    public String getTytul()
    {
        return pozycja_filmy.tytul;
    };
    public String getAutor()
    {
        return pozycja_filmy.autor;
    };
    public int getNumerPozycji()
    {
        return pozycja_filmy.numerpozycji;
    };
    public int getCena ()
    {
        return pozycja_filmy.cena;
    };
    public boolean getStatusDostepny()
    {
        return pozycja_filmy.statusdostepny;
    }

}