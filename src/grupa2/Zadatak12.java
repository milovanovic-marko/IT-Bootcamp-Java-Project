/*
* 12. Napisati funkciju koja sabira 2 niza iste duzine element po element. (Dakle prosledjujemo 2 niza, a vracamo taj novi niz)
Primer: [2, 4, 6] + [1, 4, 4]  -> [3, 8, 10]
* */

package grupa2;

public class Zadatak12 {

    static int[] saberiNizove(int[] niz1, int[] niz2) {
        int[] resenje = new int[niz1.length];
        for (int i = 0; i < niz1.length; i++) {
            resenje[i] = niz1[i] + niz2[i];
        }
        return resenje;
    }

    public static void main(String[] args) {
        int[] niz1 = {2, 4, 6};
        int[] niz2 = {1, 4, 4};

        int[] zbir = saberiNizove(niz1, niz2);
        for (int i = 0; i < zbir.length; i++) {
            System.out.print(zbir[i] + " ");
        }
    }
}
