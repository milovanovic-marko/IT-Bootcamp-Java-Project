/*
* 3. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Izracunati sumu tog niza.
Primer: [1, 2, 3, 4, 5] -> 15 (1 + 2 + 3 + 4 + 5 = 15)
b) Napraviti funkciju koja vraca sumu prosledjenog niza.
* */
package grupa2;

import java.util.Scanner;

public class Zadatak3 {

    // b)
    static double sumArray(double[] niz) {
        double suma = 0;
        for (int i = 0; i < niz.length; i++) {
            suma += niz[i];
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite duzinu niza: ");
        int duzina = sc.nextInt();

        double[] niz = new double[duzina];

        System.out.println("Unesite " + niz.length + " elemenata niza.");
        for (int i = 0; i < niz.length; i++) {
            System.out.print("Unesite element niza: ");
            niz[i] = sc.nextDouble();
        }

        double suma = 0;
        for (int i = 0; i < niz.length; i++) {
            suma += niz[i];
        }
        System.out.println("Suma niza je: " + suma);

        // b) test
        System.out.println("Suma niza je: " + sumArray(niz));
    }
}
