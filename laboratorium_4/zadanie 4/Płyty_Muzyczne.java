public class Płyty_Muzyczne {
    String nazwakompozytora;
    String gatunek_muzyczny;
    int czas_albumu;
    private final Pozycja pozycja_płyty_muzyczne;

    public Płyty_Muzyczne() {
        this.pozycja_płyty_muzyczne = new Pozycja();
        pozycja_płyty_muzyczne.setTytul("Ale to juz bylo");
        pozycja_płyty_muzyczne.setAutor("Maryla Rodowicz");
        pozycja_płyty_muzyczne.setCena(35);
        pozycja_płyty_muzyczne.setNumerPozycji(4444);
        pozycja_płyty_muzyczne.setStatusDostepny(true);
        this.nazwakompozytora = "Rodowicz;";
        this.gatunek_muzyczny = "Stare piosenki";
        this.czas_albumu = 30;
    }
    public String getTytul()
    {
        return pozycja_płyty_muzyczne.tytul;
    };
    public String getAutor()
    {
        return pozycja_płyty_muzyczne.autor;
    };
    public int getNumerPozycji() { return pozycja_płyty_muzyczne.numerpozycji; };
    public int getCena ()
    {
        return pozycja_płyty_muzyczne.cena;
    };
    public boolean getStatusDostepny()
    {
        return pozycja_płyty_muzyczne.statusdostepny;
    }
}
