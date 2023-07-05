/*
* 3. Napisati funkciju koja proverava da li su dve double ArrayListe potpuno iste.
* */
package grupa3;

public class Zadatak3 {

    static boolean areArrayIdentical(double[][] array1, double[][] array2) {
        if (array1.length != array2.length || array1[0].length != array2[0].length) {
            return false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[0].length; j++) {
                    if (array1[i][j] != array2[i][j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        double[][] niz1 = {{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        double[][] niz2 = {{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

        if (areArrayIdentical(niz1, niz2)) {
            System.out.println("Isti su");
        } else {
            System.out.println("Nisu isti");
        }
    }
}
