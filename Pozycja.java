import java.util.Date;

public class Pozycja {

    //Dane dotyczace kazdej pozycji w systemie
    String tytul;
    String autor;
    Date datawydania;
    int numerpozycji;
    int cena;
    boolean statusdostepny;

    //Tworzenie elementow w klasie
    public Pozycja(String tytul, String autor, Date datawydania, int cena){

        this.tytul = tytul;
        this.autor = autor;
        this.datawydania = datawydania;
        this.numerpozycji = numerpozycji;
        this.cena = cena;
    }

}



