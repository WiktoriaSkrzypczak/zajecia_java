import java.util.ArrayList;
import java.util.Date;

    public class System {

        public ArrayList<Pozycja> lista_pozycji;
        public System()
        {
            this.lista_pozycji = new ArrayList<>();
        }

        public void add(Pozycja plik)
        {
            lista_pozycji.add(plik);
        }

        public static void main()
        {
            System Biblioteka = new System();
            Audiobooki cisza = new Audiobooki("Cisza przed burza", "Kwiat jabloni", new Date(20, 12, 11), 20, "Ziemiański Janusz", 30, 40);
            Filmy zelazne_serce = new Filmy("Żelazne serce", "Kazimierz Jakis",  new Date(20, 12, 10 ), 30, "akcja", "Cezary Pazura", 30);
            Książka kamien_filozoficzny = new Książka("Kamien filozoficzny", "J.K. Rowling", new Date(20, 12, 9), 30, "miekka", "fantastyka", 230);
            Płyty_Muzyczne ale_to_juz_bylo = new Płyty_Muzyczne("Ale to już było", "Maryla Rodowicz", new Date(20, 1, 11), 35, "Rodowicz", "Stare piosenki", 30);
            Ebooki nowe_zycie = new Ebooki("Czarna Madonna", "Artur Czartoryski", new Date(19, 10, 15), 20, 30, "pdf");
            Biblioteka.add(cisza);
            Biblioteka.add(ale_to_juz_bylo);
            Biblioteka.add(zelazne_serce);
            Biblioteka.add(kamien_filozoficzny);
            Biblioteka.add(nowe_zycie);
        }
    }


