public class Książka
{
    String rodzajokladki;
    String gatunek;
    int iloscstron;
    private final Pozycja pozycja_książka;

    public Książka()
    {
        this.pozycja_książka = new Pozycja();
        pozycja_książka.setTytul("Kamien filozoficzny");
        pozycja_książka.setAutor("J.K. Rowling");
        pozycja_książka.setCena(30);
        pozycja_książka.setNumerPozycji(3333);
        pozycja_książka.setStatusDostepny(true);
        this.rodzajokladki = "miekka";
        this.gatunek = "fantastyka";
        this.iloscstron = 230;
    }

    public String getTytul()
    {
        return pozycja_książka.tytul;
    };
    public String getAutor()
    {
        return pozycja_książka.autor;
    };
    public int getNumerPozycji()
    {
        return pozycja_książka.numerpozycji;
    };
    public int getCena ()
    {
        return pozycja_książka.cena;
    };
    public boolean getStatusDostepny()
    {
        return pozycja_książka.statusdostepny;
    }

}