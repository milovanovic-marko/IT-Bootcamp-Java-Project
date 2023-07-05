/*
* 19. Uneti pozitivan ceo broj n. Zatim izracunati proizvod unetih narednih n brojeva (double).
* */
package grupa1;

import java.util.Scanner;

public class Zadatak19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double broj;
        System.out.print("Unesite neki pozitivan ceo broj: ");
        n = sc.nextInt();

        double proizvod = 1;
        for (int i = 0; i < n; i++) {
            System.out.print("Unesite neki broj: ");
            broj = sc.nextDouble();

            proizvod *= broj;
        }
        System.out.println("Proizvod je: " + proizvod);
    }
}
