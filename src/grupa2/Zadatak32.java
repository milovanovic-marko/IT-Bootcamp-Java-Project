/*
* 32. Napisati funkciju koja za zadati niz celih brojeva vraca taj niz zarotiran za 2 mesta udesno
    Npr:
    [1, 2, 3, 4, 5] -> [4, 5, 1, 2, 3]
* */
package grupa2;

public class Zadatak32 {

    static int[] zarotirajNiz(int[] niz) {
        int[] resenje = new int[niz.length];
        int brojac = 0;
        for (int i = 0; i < niz.length; i++) {
            if ((i + 2) > (niz.length - 1)) {
                resenje[brojac] = niz[i];
                brojac++;
            } else {
                resenje[i+2] = niz[i];
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
        int[] resenje = zarotirajNiz(niz);
        printArray(resenje);
    }
}
