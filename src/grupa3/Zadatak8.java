/*
* 8. Napisati funkciju koja vraca zbir svih elemenata iz ArrayListe.
* */
package grupa3;

public class Zadatak8 {

    static double sumArray(double[][] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        double[][] niz1 = {{1, 1, 1, 1}, {1, 1, 1, 1}};
        System.out.println(sumArray(niz1));
    }
}
