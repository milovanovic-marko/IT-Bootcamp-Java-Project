/*
* 18.* Napisati funkciju koja deli proslednjen niz na dva jednaka dela i onda ih sabira element po element.
Npr:
[1, 2, 3, 4, 5, 6] -> [1, 2, 3] + [4, 5, 6] -> [5, 7, 9]
[1, 2, 3, 4, 5] -> [1, 2, 3] + [3, 4, 5] -> [4, 6, 8]
* */
package grupa2;

public class Zadatak18 {

    static int[] podeliIOsvoji(int[] niz){
        int[] resenje;
        int[] niz1;
        int[] niz2;
        // delim na dva niza
        if (niz.length % 2 == 0) {
            resenje = new int[niz.length / 2];
            niz1 = new int[niz.length / 2];
            niz2 = new int[niz.length / 2];
            for (int i = 0; i < niz1.length; i++) {
                niz1[i] = niz[i];
                niz2[i] = niz[i + niz1.length];
            }
        } else {
            resenje = new int[niz.length / 2 + 1];
            niz1 = new int[niz.length / 2 + 1];
            niz2 = new int[niz.length / 2 + 1];
            for (int i = 0; i < niz1.length; i++) {
                niz1[i] = niz[i];
                niz2[i] = niz[i + niz1.length - 1];
            }
        }

        for (int i = 0; i < resenje.length; i++) {
            resenje[i] = niz1[i] + niz2[i];
        }

        return resenje;
    }

    public static void main(String[] args) {
        int[] niz = {1, 2, 3, 4, 5};
        int[] resenje = podeliIOsvoji(niz);

        for (int i = 0; i < resenje.length; i++) {
            System.out.print(resenje[i] + " ");
        }
    }
}
