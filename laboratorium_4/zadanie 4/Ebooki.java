public class Ebooki
{
    int wielkosc_pliku_ebook;
    String rodzaj_pliku;
    private final Pozycja pozycja_ebooki;


    public Ebooki()
        {
            this.pozycja_ebooki = new Pozycja();
            pozycja_ebooki.setTytul("Czarna Madonna");
            pozycja_ebooki.setAutor("Artur Czarotyski");
            pozycja_ebooki.setCena(20);
            pozycja_ebooki.setNumerPozycji(5555);
            pozycja_ebooki.setStatusDostepny(true);
            this.wielkosc_pliku_ebook = 30;
            this.rodzaj_pliku = "pdf";
        }

    public String getTytul()
    {
        return pozycja_ebooki.tytul;
    };
    public String getAutor()
    {
        return pozycja_ebooki.autor;
    };
    public int getNumerPozycji() { return pozycja_ebooki.numerpozycji; };
    public int getCena ()
    {
        return pozycja_ebooki.cena;
    };
    public boolean getStatusDostepny()
    {
        return pozycja_ebooki.statusdostepny;
    }
}
