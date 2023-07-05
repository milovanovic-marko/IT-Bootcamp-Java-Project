/*
* 14. Napisati funkciju koja vraca zbir drugog najmanjeg i drugog najveceg elementa niza.
* */
package grupa2;

public class Zadatak14 {

    static int zbirMaxMin(int[] niz) {
        sortirajNiz(niz);
        return niz[1] + niz[niz.length - 2];
    }

    static void sortirajNiz(int[] niz) {
        int temp;
        for (int i = 0; i < niz.length; i++) {
            for (int j = 0; j < niz.length; j++) {
                if (niz[i] > niz[j]) {
                    temp = niz[i];
                    niz[i] = niz[j];
                    niz[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] niz = {50, 40, 30, 20, 10, 5, 2, 1};
        System.out.println(zbirMaxMin(niz));
    }
}
