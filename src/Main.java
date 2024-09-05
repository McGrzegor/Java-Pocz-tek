import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Witaj na leckcji");
        int wylosowana =(int) (Math.random()*10+1);
        System.out.println(wylosowana);
        /*
        typy proste z małej litery, mają tylko wartość
        logiczny: boolean
        całkowite: byte, short, int, long
        rzeczywiste: float, double
        znakowy: char

        typy złożone zawsze pisane wielką literą
        obiekty mają własności i metody

         */
        System.out.println("Zgadnij licznę z zakresu 1 do 10");
        Scanner klawiatura = new Scanner(System.in);
        int wpisanaLiczba = klawiatura.nextInt();//wczytwanie z klawiatury
        System.out.println("Wpisana z klawiatury"+wpisanaLiczba);
        if (wpisanaLiczba == wylosowana){
            System.out.println("Trafiona Liczba");
        }
        else {
            System.out.println("Nie trafiono spróbuj ponownie");
        }

    }
}
