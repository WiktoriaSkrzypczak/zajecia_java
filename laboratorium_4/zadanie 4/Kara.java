public class Kara {

    public void zaplata(long data_wypozycz, long data_zwrot) {
        long ilosc_dni = data_zwrot - data_wypozycz;
        //maksymalny czas wypozyczenia 7 dni

        if (ilosc_dni > 7) {
            long liczenie_dni = (ilosc_dni - 7);
            long kara = 2 * liczenie_dni;
            java.lang.System.out.println("Przekroczono limit, do zaplaty jest " +kara+"zlotych");
            //2zł naliczane za każdy dzień zwłoki
        }
        else
        {
            if (ilosc_dni == 7) {
                java.lang.System.out.println("Musisz dzisiaj oddac wypozyczona pozycje");
                //Jeżeli jest  7 dni od wypożyczenia, to pojawia się informacja, że trzeba oddać wypożyczoną rzecz
            }
            else
            {
                long ile_dni_zostalo = 7 - ilosc_dni;
                java.lang.System.out.println("Zostalo ci " +ile_dni_zostalo+ " na oddanie pozycji");
                //Jeżeli jest mniej niż 7 dni od wypożyczenia, to pojawia się informacja o tym, ile dni zostało.
            }
        }
    }

}