import java.util.Scanner;

/*
 * Marko Milovanović - PROJEKAT JAVA
 * */
public class ProjektniZadatak7 {

    /*
    * * 7) Napraviti program koji(ovaj zadatak mozda bolje uraditi u posebnoj klasi) :
    * a) Ima funkciju koja omogucava korisniku da unese u niz 6 brojeva(nebitno kojih).
    * public static int[] unesiBrojeve()
    * */

    public static int[] unesiBrojeve(Scanner sc) {
        int[] niz = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("Unesi neki broj od 1-90: "); // da bi se slagalo sa "bingo" funkcijom
            niz[i] = sc.nextInt();
            if (niz[i] > 90 || niz[i] <1) { // da bi se slagalo sa "bingo" funkcijom / moje razumevanje je da je ovaj ceo zadatak pravljenje binga
                System.out.println("Greska! Unesite broj od 1-90!");
                i--;
            }
        }
        return niz;
    }

    /*
    * b) Funkciju koja generise nasumicnih 30 brojeva.(Ovde ce nam trebati Math.random()
    * funkcija koja generise Random broj, ali je problem sto generise jedan double broj sa dugom
    * decimalom, osmislite kako bi vi taj broj skratili i pretvorili ga u ceo broj)
    * public static int[] randomBrojevi()
    * */

    public static int[] randomBrojevi() {
        int[] randomNiz = new int[30];
        for (int i = 0; i < randomNiz.length; i++) {
            double randomBroj = Math.random() * 90 + 1; // generise random brojeve od 1-90
            // trazim jedinstvene brojeve kako bi mogao da se igra Bingo / dodao sam dodatni uslov kako prvi element ne bi bio "0"
            for (int j = 0; j < i || j == 0; j++) {
                if ((int) randomBroj == randomNiz[j]) {
                    i--;
                    break;
                } else {
                    randomNiz[i] = (int) randomBroj;
                }
            }
        }
        return randomNiz;
    }

    /*
    * c) Funkcija koja ispisuje korisniku koliko je brojeva pogodio i koje brojeve je pogodio.
    * public static void bingo(int[] niz1, int[] niz2)
    * */
    public static void bingo(int[] pokusaj, int[] zaPogadjanje) {
        int pogodjeno = 0;
        System.out.print("\nCestitamo! Pogodili ste sledece brojeve: ");
        for (int i = 0; i < pokusaj.length; i++) {
            for (int j = 0; j < zaPogadjanje.length; j++) {
                if (pokusaj[i] == zaPogadjanje[j]) {
                    pogodjeno++;
                    System.out.print(pokusaj[i] + " ");
                }
            }
        }
        System.out.print("/ To je ukupno " + pogodjeno + " pogodaka!\n");
    }
    static void printArray(int[] niz) {
        System.out.print("\n[");
        for (int i = 0; i < niz.length; i++) {
            if (i != niz.length - 1) {
                System.out.print(niz[i] + ", ");
            } else {
                System.out.print(niz[i] + "]\n");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Test pod a)
        int[] niz = unesiBrojeve(sc);
        printArray(niz);

        // Test pod b)
        int[] randomNiz = randomBrojevi();
        printArray(randomNiz);

        // Test pod c)
        int[] randomBrojevi = randomBrojevi();
        printArray(randomBrojevi);
        int[] pokusaj = unesiBrojeve(sc);
        bingo(pokusaj, randomBrojevi);
    }
}
