/*
* 9. Napisati funkciju koja vraca proizvod svih elemenata uvecanih za 3 iz ArrayListe.
* */
package grupa3;

public class Zadatak9 {

    static double proizvodElemenataUvecanihZa3(double[][] array) {
        double proizvod = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                proizvod *= (array[i][j] + 3);
            }
        }
        return proizvod;
    }

    public static void main(String[] args) {
        double[][] niz1 = {{1, 1, 1, 1}, {1, 1, 1, 1}};
        System.out.println(proizvodElemenataUvecanihZa3(niz1));
    }
}
