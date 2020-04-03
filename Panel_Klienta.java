import java.util.ArrayList;
import java.util.Date;

//Publiczna klasa panelu klienta
public class Panel_Klienta {
    String imie;
    String nazwisko;
    String adres;
    int wiek;
    boolean pelnoletnosc;
    Date zapis_do_biblioteki;
    int ID;
    ArrayList<String> lista_ksiazek = new ArrayList<>();

    public Panel_Klienta pierwszy_klient;

    public  Panel_Klienta(String imie, String nazwisko, String adres, int wiek, boolean pelnoletnosc, Date zapis_do_bilioteki, int numerklienta)
    {
        pierwszy_klient.imie = imie;
        pierwszy_klient.nazwisko= nazwisko;
        pierwszy_klient.adres= adres;
        pierwszy_klient.wiek = wiek;
        pierwszy_klient.pelnoletnosc = true;
        pierwszy_klient.zapis_do_biblioteki = zapis_do_bilioteki;
        pierwszy_klient.ID = 23451;
        pierwszy_klient.lista_ksiazek = new ArrayList<>();
    }
}
