package probnitest;
import java.util.Scanner;

public class Test {


    public static int[] nizBrojeva (Scanner skener){

        System.out.println ("Molimo unesite proizvoljan broj celih brojeva: ");
        int x = skener. nextInt ();

        String brojevi = "";  // skuplja unete borjeve u String
        int[] niz;            // definisanje niza

        while (x != 0){                 // petlja koja se vrti sve dok unos nije jednak 0
            brojevi += x;               // svaki broj se nadovezuje na String
            x = skener.nextInt ();      // update unosa
        }
        niz = new int[brojevi.length ()]; // inicijalizacija niza, duzina je jednaka duzini Stringa brojevi

        char karakter;                    // promenljiva koja prikuplja pojedinacne karaktere iz Stringa

        for (int i = 0; i < niz.length; i++) {

            karakter = brojevi.charAt (i);
            niz[i] = Character.getNumericValue (karakter);

        }

        return niz;
    }

    static void ispisNiza(int[] niz){
        for (int i = 0; i < niz.length; i++) {
            System.out.print (niz[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ispisNiza(nizBrojeva(sc));
    }
}
