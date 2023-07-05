/*
* 31.* Napisati funkciju koja za zadati niz celih brojeva i neki zadati ceo broj n vraca niz tih brojeva iz kojeg je uklanjeno svako
     pojavljivanje tog broja n, ako:
a)U zadatom nizu nema duplikata
b)U zadatom nizu moze biti duplikata
* */
package grupa2;

public class Zadatak31 {

    // a) i b)
    static int[] removeNum(int[] arr, int n) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != n) {
                temp++;
            }
        }
        int[] res = new int[temp];
        temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != n) {
                res[temp] = arr[i];
                temp++;
            }
        }
        return res;
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
        int[] niz = {1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 11, 12, 13, 14, 15, 16};
        int[] resenje = removeNum(niz, 5);
        printArray(resenje);
    }
}
