/*
* 11. Napisati funkciju koja vraca prosecnu vrednost iz ArrayListe.
* */
package grupa3;

public class Zadatak11 {

    static double avgArray(double[][] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                sum += array[i][j];
            }
        }
        return sum / (array.length * array[0].length);
    }

    public static void main(String[] args) {
        double[][] niz1 = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        System.out.println(avgArray(niz1));
    }
}
