/*
* 8. Napisati funkciju koja ispisuje sve parne brojeve zadatog niza.
* */

package grupa2;

public class Zadatak8 {

    static void parniBrojeviNiza(int[] niz) {
        System.out.print("\nParni brojevi niza: ");
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] % 2 == 0) {
                System.out.print(niz[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] niz = {1, 2, 3, 4, 5, 6, 7, 8};
        parniBrojeviNiza(niz);
    }
}
