/*
* 19.* Napisati funkciju koja sabira dva niza proizvoljne duzine.
Npr: [1, 2, 3, 4, 5] + [1, 2, 3] -> [2, 4, 6, 4, 5]
b)** -//- bez kreiranja dodatnih nizova
* */
package grupa2;

public class Zadatak19 {
    // a)
    static int[] saberiNizoveA(int[] niz1, int[] niz2) {
        int[] resenje;
        if (niz1.length > niz2.length) {
            resenje = copyArray(niz1);
            for (int i = 0; i < niz2.length; i++) {
                resenje[i] += niz2[i];
            }
        } else {
            resenje = copyArray(niz2);
            for (int i = 0; i < niz1.length; i++) {
                resenje[i] += niz1[i];
            }
        }
        return resenje;
    }

    // b)** - brez kreiranja dodatnih nizova
    static int[] saberiNizoveB(int[] niz1, int[] niz2) {

        if (niz1.length > niz2.length) {
            for (int i = 0; i < niz2.length; i++) {
                niz1[i] += niz2[i];
            }
            return niz1;
        } else {
            for (int i = 0; i < niz1.length; i++) {
                niz2[i] += niz1[i];
            }
            return niz2;
        }
    }

    public static int[] copyArray(int[] niz) {
        int[] resenje = new int[niz.length];
        for (int i = 0; i < niz.length; i++) {
            resenje[i] = niz[i];
        }
        return resenje;
    }

    public static void main(String[] args) {
        int[] niz1 = {1, 2, 3, 4, 5};
        int[] niz2 = {1, 2, 3, 4};

        int[] sabranoA = saberiNizoveA(niz1, niz2);
        int[] sabranoB = saberiNizoveB(niz1, niz2);

        for (int i = 0; i < sabranoA.length; i++) {
            System.out.print(sabranoA[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < sabranoB.length; i++) {
            System.out.print(sabranoB[i] + " ");
        }
    }
}
