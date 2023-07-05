/*
* 4. Napisati funkciju koja vraca najveci element iz ArrayListe.
* */
package grupa3arrayliste;

import java.util.ArrayList;
import java.util.Arrays;

public class Zadatak4 {

    static int maxEllement(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int i : list) {
            max = Math.max(max, i);
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println(maxEllement(lista));
    }
}
