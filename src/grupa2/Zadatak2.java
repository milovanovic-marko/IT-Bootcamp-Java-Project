/*
* 2. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati svaki drugi element tog niza
Primer: [1, 2, 3, 4, 5] -> 1 3 5
b) Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.
* */
package grupa2;

import java.util.Scanner;

public class Zadatak2 {

    // b)
    static void ispisiNeparneElemente(double[] niz) {
        System.out.print("\nSvaki drugi element niza: [");
        for (int i = 0; i < niz.length; i++) {
            if ((i % 2 == 0) && (i == niz.length-1)) {
                System.out.print(niz[i] + "]\n");
            } else if (i % 2 == 0) {
                System.out.print(niz[i] + ", ");
            }
        }
    }

    static void ispisiParneElemete(double[] niz) {
        System.out.print("\nSvaki paran element niza je: [");
        for (int i = 0; i < niz.length; i++) {
            if ((i % 2 != 0) && (i == niz.length-2)) {
                System.out.print(niz[i] + "]\n");
            } else if (i % 2 != 0) {
                System.out.print(niz[i] + ", ");
            }
        }
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

        System.out.print("Svaki drugi element niza je: [");
        for (int i = 0; i < niz.length; i++) {
            if ((i % 2 == 0) && (i == niz.length-1)) {
                System.out.print(niz[i] + "]");
            } else if (i % 2 == 0) {
                System.out.print(niz[i] + ", ");
            }
        }

        // b) test
        ispisiNeparneElemente(niz);
        ispisiParneElemete(niz);
    }
}
