/*
*1. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati taj niz u obrtnutom redosledu
Primer: [4, 2, 3, 5] -> 5 3 2 4
b) Napraviti funkciju koja ispisuje dat niz u obrnutom redosledu.
* */
package grupa2;

import java.util.Scanner;

public class Zadatak1 {

    // b)
    static void obrniNiz(double[] niz) {
        System.out.print("\nNiz ispisan u obrnutom redosledu: [");
        for (int i = niz.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(niz[i] + ", ");
            } else {
                System.out.print(niz[i] + "]\n");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int duzina;
        System.out.print("Unesite duzinu niza: ");
        duzina = sc.nextInt();

        double[] niz = new double[duzina];

        System.out.println("Unesite " + niz.length + " elemenata niza.");
        for (int i = 0; i < niz.length; i++) {
            System.out.print("Unesite element niza: ");
            niz[i] = sc.nextDouble();
        }

        System.out.print("Niz ispisan u obrnutom redosledu: [");
        for (int i = niz.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(niz[i] + ", ");
            } else {
                System.out.print(niz[i] + "]");
            }
        }

        // b) test
        obrniNiz(niz);
    }
}
