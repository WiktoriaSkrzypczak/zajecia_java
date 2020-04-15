import java.util.Scanner;

public class Zadanie_2 {
    public static void main(String[] args)
    {

        //Wprowadzanie ciągu znaków do zamiany
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz znaki do zamiany");
        String znak = scan.nextLine();

        try
        {
            //Zamiana ciągu znaków ze stringa na inta
            System.out.println("Nastepuje zamiana");
            int zamiana = Integer.parseInt(znak);
            System.out.print("Wynik zamiany to: ");
            System.out.print(zamiana);
            System.out.print(" ze Stringa do int: ");
            System.out.print(zamiana);
            //Powinno pokazać tą samą wpisaną liczbę

        }

        catch (NumberFormatException zly_format)
        {
            //Int jest tylko do liczb, więc w stringu musi też być liczba wpisana, żeby przeszło
            //Jeżeli będzie w stringu znak inny niż liczba, to pojawi się błąd
            //Z informacją o złym formacie wprowadzonych danych
            System.out.println("Wprowadz poprawnie dane, nastapil blad");
            System.out.print(zly_format);
        }
    }
}
