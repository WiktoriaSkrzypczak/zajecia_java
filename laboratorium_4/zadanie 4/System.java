import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.List;

public class System
{
    public static void main(String[] args)
    {
        //Plik audio z klasy Audiobook
        Audiobooki audio = new Audiobooki();
        String tytul_audio = audio.getTytul();
        String autor_audio = audio.getAutor();
        int cena_audio = audio.getCena();
        int numer_pozycji_audio = audio.getNumerPozycji();
        boolean status_dostepny_audio = audio.getStatusDostepny();
        String lektor = audio.lektor;
        int czas_trwania_audio = audio.czas_trwania_audio;
        int wielkosc_pliku_audio = audio.wielkosc_pliku_audio;

        //Wyświetlanie informacji o pliku audio dla sprawdzenia czy działa
        java.lang.System.out.println(audio.getTytul());
        java.lang.System.out.println(audio.getAutor());
        java.lang.System.out.println(audio.getCena());
        java.lang.System.out.println(audio.getNumerPozycji());
        java.lang.System.out.println(audio.getStatusDostepny());
        java.lang.System.out.println(audio.czas_trwania_audio);
        java.lang.System.out.println(audio.lektor);
        java.lang.System.out.println(audio.wielkosc_pliku_audio);

        //Plik film z klasy Filmy
        Filmy film = new Filmy();
        String tytul_film = film.getTytul();
        String autor_film = film.getAutor();
        int cena_film = film.getCena();
        int numer_pozycji_film = film.getNumerPozycji();
        boolean status_dostepny_film = film.getStatusDostepny();
        String gatunek_filmu_film = film.gatunek_filmu;
        String glowny_aktor_film = film.glowny_aktor;
        int czas_trwania_filmu_filmy = film.czas_trwania_filmu;

        //Wyświetlanie informacji o pliku film dla sprawdzenia czy działa
        java.lang.System.out.println(film.getTytul());
        java.lang.System.out.println(film.getAutor());
        java.lang.System.out.println(film.getCena());
        java.lang.System.out.println(film.getNumerPozycji());
        java.lang.System.out.println(film.getStatusDostepny());
        java.lang.System.out.println(film.gatunek_filmu);
        java.lang.System.out.println(film.glowny_aktor);
        java.lang.System.out.println(film.czas_trwania_filmu);

        //Plik książka z klasy Książka
        Książka książka = new Książka();
        String tytul_książka = książka.getTytul();
        String autor_książka = książka.getAutor();
        int cena_książka = książka.getCena();
        int numer_pozycji_książka = książka.getNumerPozycji();
        boolean status_dostepny_książka = książka.getStatusDostepny();
        String rodzaj_okladki_książka = książka.rodzajokladki;
        String gatunek_książka = książka.gatunek;
        int ilosc_stron_książka = książka.iloscstron;

        //Wyświetlanie informacji o pliku książka  dla sprawdzenia czy działa
        java.lang.System.out.println(książka.getTytul());
        java.lang.System.out.println(książka.getAutor());
        java.lang.System.out.println(książka.getCena());
        java.lang.System.out.println(książka.getNumerPozycji());
        java.lang.System.out.println(książka.getStatusDostepny());
        java.lang.System.out.println(książka.rodzajokladki);
        java.lang.System.out.println(książka.gatunek);
        java.lang.System.out.println(książka.iloscstron);

        //Plik płyta z klasy Płyty_Muzyczne
        Płyty_Muzyczne płyta = new Płyty_Muzyczne();
        String tytul_płyta = płyta.getTytul();
        String autor_płyta = płyta.getAutor();
        int cena_płyta = płyta.getCena();
        int numer_pozycji_płyta = płyta.getNumerPozycji();
        boolean status_dostepny_płyta = płyta.getStatusDostepny();
        String rodzaj_okladki_płyta = płyta.nazwakompozytora;
        String gatunek_płyta = płyta.gatunek_muzyczny;
        int ilosc_stron_płyta = płyta.czas_albumu;

        //Wyświetlanie informacji o pliku płyta dla sprawdzenia czy działa
        java.lang.System.out.println(płyta.getTytul());
        java.lang.System.out.println(płyta.getAutor());
        java.lang.System.out.println(płyta.getCena());
        java.lang.System.out.println(płyta.getNumerPozycji());
        java.lang.System.out.println(płyta.getStatusDostepny());
        java.lang.System.out.println(płyta.nazwakompozytora);
        java.lang.System.out.println(płyta.gatunek_muzyczny);
        java.lang.System.out.println(płyta.czas_albumu);


        //Plik ebook z klasy Ebooki
        Ebooki ebook = new Ebooki();
        String tytul_ebook = ebook.getTytul();
        String autor_ebook = ebook.getAutor();
        int cena_ebook = ebook.getCena();
        int numer_pozycji_ebook = ebook.getNumerPozycji();
        boolean status_dostepny_pebook = ebook.getStatusDostepny();
        String rodzaj_pliku_ebook  = ebook.rodzaj_pliku;
        int wielkosc_pliku_ebook = ebook.wielkosc_pliku_ebook;

        //Wyświetlanie informacji o pliku ebook dla sprawdzenia czy działa
        java.lang.System.out.println(ebook.getTytul());
        java.lang.System.out.println(ebook.getAutor());
        java.lang.System.out.println(ebook.getCena());
        java.lang.System.out.println(ebook.getNumerPozycji());
        java.lang.System.out.println(ebook.getStatusDostepny());
        java.lang.System.out.println(ebook.rodzaj_pliku);
        java.lang.System.out.println(ebook.wielkosc_pliku_ebook);

        //Tworzenie listy wszystkich plików dostępnych w systemie
        List<Object> Biblioteka = new ArrayList<Object>();
        Biblioteka.add(audio);
        Biblioteka.add(film);
        Biblioteka.add(książka);
        Biblioteka.add(płyta);
        Biblioteka.add(ebook);

    }

    public ArrayList<Pozycja> lista_pozycji;

    public System()
    {
        this.lista_pozycji = new ArrayList<>();
    }

    //pierwszy klient
    Panel_Klienta pierwszy_klient = new Panel_Klienta("Jason", "Schock", "Lipowa 20", 25, true, 23451);

    public void add(Pozycja plik)
    {
        lista_pozycji.add(plik);
    }
}


