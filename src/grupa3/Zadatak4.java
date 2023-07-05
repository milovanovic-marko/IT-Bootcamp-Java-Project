/*
* 4. Napisati funkciju koja vraca najveci element iz ArrayListe.
* */
package grupa3;

public class Zadatak4 {

    static double maxArrayEllement(double[][] array) {
        double maxEllement = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                maxEllement = Math.max(maxEllement, array[i][j]);
            }
        }
        return maxEllement;
    }

    public static void main(String[] args) {
        double[][] niz1 = {{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        System.out.println(maxArrayEllement(niz1));
    }
}
