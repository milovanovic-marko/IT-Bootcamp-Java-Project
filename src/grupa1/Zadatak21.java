/*
* 21.* Uneti pozitivan ceo broj n. Zatim ispisati najmanji i najveci broj od unetih narednih n brojeva (double).
* */
package grupa1;

import java.util.Scanner;

public class Zadatak21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Unesite neki pozitivan ceo broj: ");
        n = sc.nextInt();

        double minimum = Double.MAX_VALUE;
        double maksimum = Double.MIN_VALUE;

        double broj;
        for (int i = 0; i < n; i++) {
            System.out.print("Unesite neki broj: ");
            broj = sc.nextDouble();

            if (broj < minimum) {
                minimum = broj;
            }

            if (broj > maksimum) {
                maksimum = broj;
            }
        }
        System.out.println("\nNajveci broj je: " + maksimum);
        System.out.println("Najmanji broj je: " + minimum);
    }
}
