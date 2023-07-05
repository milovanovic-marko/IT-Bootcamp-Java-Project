/*
* 4. -//-. Ispisati svaki treci element u obrnutom redosledu.
Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
b) Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.
* */
package grupa2;

import java.util.Scanner;

public class Zadatak4 {

    static void svakiTreciElement(double[] niz) {
        System.out.print("\nSvaki treci element niza ispisan u obrnutom redosledu -> [");
        for (int i = niz.length - 1; i >= 0 ; i -= 3) {
            if (i == 0 || i == 1) {
                System.out.print(niz[i] + "]\n");
            } else {
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

        System.out.print("Svaki treci element niza ispisan u obrnutom redosledu -> [");
        for (int i = niz.length - 1; i >= 0 ; i -= 3) {
            if (i == 0 || i == 1) {
                System.out.print(niz[i] + "]");
            } else {
                System.out.print(niz[i] + ", ");
            }
        }

        // b) test
        svakiTreciElement(niz);
    }
}
