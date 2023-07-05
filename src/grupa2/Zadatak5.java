/*
* 5. -//-. Izracunati proizvod elemenata tog niza.
Primer: [2, 4] -> 8
b) Napisati funkciju koja racuna proizvod elemenata zadatog niza.
* */
package grupa2;

import java.util.Scanner;

public class Zadatak5 {

    // b)
    static double proizvodNiza(double[] niz) {
        double proizvod = 1;
        for (int i = 0; i < niz.length ; i++) {
            proizvod *= niz[i];
        }
        return proizvod;
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

        double proizvod = 1;
        for (int i = 0; i < niz.length; i++) {
            proizvod *= niz[i];
        }
        System.out.println();
        System.out.println("Proizvod elemenata niza: " + proizvod);

        // b) test
        System.out.println("Proizvod elemenata niza: " + proizvodNiza(niz));

    }
}
