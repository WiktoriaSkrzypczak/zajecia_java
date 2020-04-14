import java.util.ArrayList;
import java.util.Date;

//Publiczna klasa panelu klienta
public class Panel_Klienta
{
    String imie;
    String nazwisko;
    String adres;
    int wiek;
    boolean pelnoletnosc;
    Date zapis_do_biblioteki;
    int ID;
    ArrayList<String> lista_ksiazek = new ArrayList<>();

    public  Panel_Klienta(String imie, String nazwisko, String adres, int wiek, boolean pelnoletnosc, int numerklienta)
    {
        this.imie = imie;
        this.nazwisko= nazwisko;
        this.adres= adres;
        this.wiek = wiek;
        this.pelnoletnosc = true;
        this.ID = ID;
        this.lista_ksiazek = new ArrayList<>();
    }
}