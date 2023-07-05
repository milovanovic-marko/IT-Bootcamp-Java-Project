/*
* 7. Napisati funkciju koja prima dve ArrayListe i vraca listu dobijenu nadovezivanjem druge liste na prvu.
* */
package grupa3;

public class Zadatak7 {

    static double[][] concArray(double[][] array1, double[][] array2) {
        double[][] result = new double[0][];
        if (array1.length == array2.length) {
            result = new double[array1.length][array1[0].length + array2[0].length];

            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[0].length; j++) {
                    result[i][j] = array1[i][j];
                }
            }
            for (int i = 0; i < array1.length; i++) {
                for (int j = array1[0].length; j < array1[0].length + array2[0].length ; j++) {
                    result[i][j] = array2[i][j - array1[0].length];
                }
            }
        } else if (array1[0].length == array2[0].length) {
            result = new double[array1.length + array2.length][array1[0].length];
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[0].length; j++) {
                    result[i][j] = array1[i][j];
                }
            }
            for (int i = array1.length; i < array1.length + array2.length; i++) {
                for (int j = 0; j < array2[0].length ; j++) {
                    result[i][j] = array2[i - array1.length][j];
                }
            }
        }
        return result;
    }

    static void print2DArray(double[][] niz) {
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
        double[][] niz1 = {{1, 2, 3, 70}, {4, 5, 6, 23}, {70, -3, 9, 78}, {10, 11, -2, 4}, {10, 11, -2, 4}};
        double[][] niz2 = {{1, 2, 3, 56}, {4, 5, 6, 24}, {700, -3, 9, 78}, {10, 11, -2, 3}};

        print2DArray(concArray(niz1, niz2));
    }
}
