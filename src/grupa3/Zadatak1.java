/*
* 1. Napisati fukciju koja prima ArrayListu integera i ispisuje sve njene elemente.
* */
package grupa3;

public class Zadatak1 {

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
        print2DArray(niz);
    }
}
