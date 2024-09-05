import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Witaj na leckcji");
        int wylosowana =(int) (Math.random()*100+1);
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
        System.out.println("Wpisana z klawiatury"+wpisanaLiczba );
        if (wpisanaLiczba == wylosowana){
            System.out.println("Trafiona Liczba");
        }
        else {
            System.out.println("Nie trafiono spróbuj ponownie");
        }
        String komunikat = wylosowana == wpisanaLiczba ? "Poprawnie":"Niepoprawnie";
        System.out.println(komunikat);

        /*
        instrukcja warunkowe
         */

       int roznica = wylosowana>wpisanaLiczba? wylosowana - wpisanaLiczba:wpisanaLiczba-wylosowana;
       roznica = roznica/10; //dzielnie całkowite bo wynik typu int
        //insturkcja switch
       switch (roznica){
           case 0:
               System.out.println("Brawo ");
               break;
           case 1:
               System.out.println("Bardzo Blisko");
               break;
           case 2:
               System.out.println("Dość Blisko");
               break;
           default:
               System.out.println("Spróbuj szczęścia inny razem");
       }




    }
}
