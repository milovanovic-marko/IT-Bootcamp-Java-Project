/*
* 7. Napisati funkciju koja ispisuje sve neparne brojeve zadatog niza.
* */

package grupa2;

public class Zadatak7 {

    static void neparniBrojeviNiza(int[] niz) {
        System.out.print("\nNeparni brojevi niza: ");
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] % 2 != 0) {
                System.out.print(niz[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] niz = {1, 2, 3, 4, 5, 6, 7, 8};

        neparniBrojeviNiza(niz);
    }
}
