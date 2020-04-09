import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        
        Random r = new Random();

        //Tworzy tablicę 200 elementów
        int[] tab = new int[200];
        for(int i = 0; i < tab.length; i++)
        {
         tab[i] = r.nextInt(20) + 1;
        }

        
        System.out.println(Arrays.toString(tab));

      System.out.println("Wybierz algorytm");
        System.out.println("1 to Kubelkowa metoda");
        System.out.println("2 to Babelkowa metoda");
        Scanner wybor = new Scanner(System.in);

        int n = wybor.nextInt();
        if (n == 1)
        {
            Kubełkowa kubełkowa = new Kubełkowa();
            System.out.println(Arrays.toString(kubełkowa.sort(tab)));
            System.out.println(kubełkowa.step_counting());
        }

        else if (n == 2)
        {
            Bąbelkowa bąbelkowa = new Bąbelkowa();
            System.out.println(Arrays.toString(bąbelkowa.sort(tab)));
            System.out.println(bąbelkowa.step_counting());
        }

        else
            {
            System.out.println("Nie rozpoznano wyboru, wybierz poprawna opcje");
        }



    }
}
