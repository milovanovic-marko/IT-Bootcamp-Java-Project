/*
* 5. Napisati funkciju koja vraca drugi najmanji element iz ArrayListe. (Pretpostaviti da ce prosledjena ArrayLista uvek da ima barem 3
	elemenata).
* */
package grupa3;

public class Zadatak5 {

    static double secondMinArrayEllement(double[][] array) {
        double secondMin = Double.POSITIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                min = Math.min(min, array[i][j]);
                if (array[i][j] > min && array[i][j] < secondMin) {
                    secondMin = array[i][j];
                }
            }
        }
        return secondMin;
    }

    public static void main(String[] args) {
        double[][] niz1 = {{1, 2, 3,}, {4, 5, 6}, {7, -3, 9}, {10, 11, -2}};
        System.out.println(secondMinArrayEllement(niz1));
    }
}
