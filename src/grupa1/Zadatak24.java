/*
* 24.* Izracunati sumu povrsina svih kvadrata koji imaju celobrojne stranice cija je duzina manja od 200.
* */
package grupa1;

import java.util.Scanner;

public class Zadatak24 {
    public static void main(String[] args) {

        double sum = 0;
        for (int i = 1; i <= 200; i++) {
            sum += i * i;
        }
        System.out.println("Suma povrsina kvadrata koji imaju celobrojnu stranicu cija je duzna manja od 200 je: " + sum);


        /* NIJE ZAHTEVANO U ZADATAKU
        Scanner sc = new Scanner(System.in);
        int brojKvadrata;
        double a;
        System.out.print("Unesite broj kvadrata za koji se racuna ukupuna povrsina: ");
        brojKvadrata = sc.nextInt();

        double suma = 0;
        for (int i = 0; i < brojKvadrata; i++) {
            System.out.print("Unesite duzinu strane kvadrata: ");
            a = sc.nextDouble();

            if (a <= 0) {
                System.out.println("Greska! Uneli ste negativan broj ili 0! Unesite broj ponovo!");
                i -= 1; // smanjujem brojac kako bi se petrlja jos jednom izvrsili i korisnik bio u mogucnosti da ispravi gresku prilikom unosa
            } else if (a % 1 == 0 && a < 200) {
                suma += a * a;
            }
        }
        System.out.println("Suma povrsina kvadrata koji imaju celobrojnu stranicu i manju od 200 je: " + suma);
         */
    }
}
