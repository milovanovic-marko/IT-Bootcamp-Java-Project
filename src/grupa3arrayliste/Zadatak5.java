/*
* 5. Napisati funkciju koja vraca drugi najmanji element iz ArrayListe.
* (Pretpostaviti da ce prosledjena ArrayLista uvek da ima barem 3 elemenata).
* */
package grupa3arrayliste;

import java.util.ArrayList;
import java.util.Arrays;

public class Zadatak5 {

    static double secondMinElement(ArrayList<Double> list) {
        double min = Double.POSITIVE_INFINITY;
        double secMin = min;

        for (double i : list) {
           if (i < min) {
               if (min < secMin) {
                   secMin = min;
               }
               min = i;
           }
        }
        return secMin;
    }

    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<>(Arrays.asList(1.0, 1.0, 3.0, 4.0, 5.0, 2.0));
        System.out.println(secondMinElement(lista));
    }
}
