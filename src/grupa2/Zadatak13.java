/*
* 13. Napisati funkciju koja nadovezuje 2 niza, drugi na kraj prvog.
* Primer: [1, 2, 3] [17, 20, -3, 14, 20] -> [1, 2, 3, 17, 20, -3, 14, 20]
* */
package grupa2;

public class Zadatak13 {

    static int[] nadoveziNiz(int[] niz1, int[] niz2) {
        int[] resenje = new int[niz1.length + niz2.length];
        for (int i = 0; i < niz1.length; i++) {
            resenje[i] = niz1[i];
        }
        for (int i = niz1.length; i < resenje.length; i++) {
            resenje[i] = niz2[i - niz1.length];
        }
        return resenje;
    }

    public static void main(String[] args) {
        int[] niz1 = {1, 2, 3};
        int[] niz2 = {17, 20, -3, 14, 20};

        int[] nadovezano = nadoveziNiz(niz1, niz2);
        for (int i = 0; i < nadovezano.length; i++) {
            System.out.print(nadovezano[i] + " ");
        }
    }
}
