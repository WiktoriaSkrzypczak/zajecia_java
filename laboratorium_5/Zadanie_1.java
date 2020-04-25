import java.util.Scanner;

public class Zadanie_1 {
    private int temp1;
    private int temp2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zadanie_1 zadanie_1 = new Zadanie_1(scanner.nextInt(), scanner.nextInt());
        scanner.close();
        System.out.println(zadanie_1.checkTemp());
    }

    public Zadanie_1(int temp1, int temp2) {
        this.temp1 = temp1;
        this.temp2 = temp2;
    }

    public boolean checkTemp() {
        return temp1 > 100 || temp2 > 100;
    }

    public int getTemp1() {
        return temp1;
    }

    public int getTemp2() {
        return temp2;
    }
}


