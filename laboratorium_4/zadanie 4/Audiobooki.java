public class Audiobooki
{
    String lektor;
    int czas_trwania_audio;
    int wielkosc_pliku_audio;
    private final Pozycja pozycja_audiobooki;

    public Audiobooki()
    {
        this.pozycja_audiobooki=new Pozycja();
        pozycja_audiobooki.setTytul("Cisza przed burza");
        pozycja_audiobooki.setAutor("Kwiat jabloni");
        pozycja_audiobooki.setCena(30);
        pozycja_audiobooki.setNumerPozycji(1111);
        pozycja_audiobooki.setStatusDostepny(true);
        this.lektor = "Ziemiański Janusz";
        this.czas_trwania_audio = 30;
        this.wielkosc_pliku_audio = 40;
    }

    public String getTytul()
    {
        return pozycja_audiobooki.tytul;
    };
    public String getAutor()
    {
        return pozycja_audiobooki.autor;
    };
    public int getNumerPozycji()
    {
        return pozycja_audiobooki.numerpozycji;
    };
    public int getCena ()
    {
        return pozycja_audiobooki.cena;
    };
    public boolean getStatusDostepny()
    {
        return pozycja_audiobooki.statusdostepny;
    }



}