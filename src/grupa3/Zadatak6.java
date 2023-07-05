/*
* 6.* Napisati funkciju koja trazi najveci element medju tri ArrayListe.
* */
package grupa3;

public class Zadatak6 {

    static double maxArrayEllement(double[][] array1, double[][] array2, double[][] array3) {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                max = Math.max(max, array1[i][j]);
            }
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                max = Math.max(max, array2[i][j]);
            }
        }
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[0].length; j++) {
                max = Math.max(max, array3[i][j]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        double[][] niz1 = {{1, 2, 3,}, {4, 5, 6}, {70, -3, 9}, {10, 11, -2}};
        double[][] niz2 = {{1, 2, 3,}, {4, 5, 6}, {700, -3, 9}, {10, 11, -2}};
        double[][] niz3 = {{1, 2, 3,}, {4, 5, 60}, {7, -3, 9}, {10, 11, -2}};

        System.out.println(maxArrayEllement(niz1, niz2, niz3));
    }
}
