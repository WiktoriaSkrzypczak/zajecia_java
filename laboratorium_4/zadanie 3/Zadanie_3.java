import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie_3
{
    public static void main(String[] args)
    {
        //Funkcja random umożliwia losowanie liczb
        Random r = new Random();

        // Tworzenie tablicy 10-elementowej
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++)
        {
            tab[i] = r.nextInt(10) + 1;
        }

        //Wyświetlanie całej tablicy
        System.out.println("Utworzono tablice z elementów: ");
        System.out.println(Arrays.toString(tab));
        System.out.println("W tablicy znajduje się tyle elementów: ");
        System.out.println(tab.length);

        //Wprowadzanie który numer elementu ma zostać wyświetlony
        Scanner wprowadzanie = new Scanner(System.in);
        System.out.println("Ktory element tablicy ma zostac wyswietlony?");
        String nr_elementu = wprowadzanie.nextLine();

        try
        {
            int tablica_element = Integer.parseInt(nr_elementu);
            System.out.println("Chcesz wyswietlic element nr ");
            System.out.println(nr_elementu);
            tablica_element = tablica_element - 1;
            System.out.println("Ten element to ");
            System.out.println(tab[tablica_element]);
        }

        catch (java.lang.ArrayIndexOutOfBoundsException zly_format)
        {
            System.out.println("Wprowadz poprawnie liczbe");
        };
    }
}
