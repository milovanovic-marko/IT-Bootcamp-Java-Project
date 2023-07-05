/*
* 2. Napisati funkciju koja prima ArrayListu integera i vraca ArrayListu ciji su elementi duplirani u odnosu na
 	proslednjenju ArrayListu.
* */
package grupa3;

public class Zadatak2 {

    static int[][] doubleArrayElements(int[][] array) {
        int[][] resenje = copy2DArray(array);
        for (int i = 0; i < resenje.length; i++) {
            for (int j = 0; j < resenje[0].length; j++) {
                resenje[i][j] *= 2;
            }
        }
        return resenje;
    }

    public static int[][] copy2DArray(int[][] array) {
        int[][] resenje = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                resenje[i][j] = array[i][j];
            }
        }
        return resenje;
    }

    static void print2DArray(int[][] niz) {
        for (int i = 0; i < niz.length; i++) {
            for (int j = 0; j < niz[0].length; j++) {
                if (niz[i][j] < 10) {
                    System.out.print(niz[i][j] + "  ");
                } else {
                    System.out.print(niz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] niz = {{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        print2DArray(doubleArrayElements(niz));
    }
}
