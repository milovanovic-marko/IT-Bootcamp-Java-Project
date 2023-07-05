/*
* 11. Napisati funkciju koja duplira sve elemente niza.
* Primer: [1, 2, 3, 4, 5] -> [2, 4, 6, 8, 10]
* */

package grupa2;

public class Zadatak11 {

    static void duplirajNiz(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            niz[i] = niz[i] * 2;
        }
    }

    public static void main(String[] args) {
        int[] niz = {1, 2, 3, 4, 5};
        duplirajNiz(niz);
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + " ");
        }
    }
}
