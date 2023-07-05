/*
* 33.** Napisati funkciju koja za zadati niz celih brojeva i zadati ceo broj k vraca taj niz zarotiran za k mesta,
* gde znak broja k
     odredjuje smer rotacije.
    Npr:
    [1, 2, 3, 4, 5], k = 1 -> [5, 1, 2, 3, 4]
    [1, 2, 3, 4, 5], k = -3 -> [4, 5, 1, 2, 3]
    [1, 2], k = 0 -> [1, 2]
* */
package grupa2;

public class Zadatak33 {
    static int[] zarotirajNiz(int[] niz, int k) {
        int[] resenje = new int[niz.length];
        if (k == 0) {
            return niz;
        } else if (k > 0) {
            int brojac = 0;
            for (int i = 0; i < niz.length; i++) {
                if ((i + k) > (niz.length - 1)) {
                    resenje[brojac] = niz[i];
                    brojac++;
                } else {
                    resenje[i + k] = niz[i];
                }
            }
        } else {
            int brojac = 1;
            for (int i = niz.length - 1; i >= 0; i--) {
                if ((i + k) < 0) {
                    resenje[niz.length - brojac] = niz[i];
                    brojac++;
                } else {
                    resenje[i + k] = niz[i];
                }
            }
        }
        return resenje;
    }

    static int[] copyArray(int[] niz) {
        int[] resenje = new int[niz.length];
        for (int i = 0; i < niz.length; i++) {
            resenje[i] = niz[i];
        }
        return resenje;
    }

    static void printArray(int[] niz) {
        System.out.print("\n[");
        for (int i = 0; i < niz.length; i++) {
            if (i != niz.length - 1) {
                System.out.print(niz[i] + ", ");
            } else {
                System.out.print(niz[i] + "]\n");
            }
        }
    }

    public static void main(String[] args) {
        int[] niz = {1, 2, 3, 4, 5};
        int[] resenje = zarotirajNiz(niz, -3);
        printArray(resenje);
    }
}
