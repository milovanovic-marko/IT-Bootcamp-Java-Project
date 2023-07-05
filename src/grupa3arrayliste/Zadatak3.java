/*
* 3. Napisati funkciju koja proverava da li su dve double ArrayListe potpuno iste.
* */
package grupa3arrayliste;

import java.util.ArrayList;
import java.util.Arrays;

public class Zadatak3 {

    static boolean identicalLists(ArrayList<Double> ls1, ArrayList<Double> ls2) {
        return ls1.equals(ls2);
    }

    public static void main(String[] args) {
        ArrayList<Double> ls1 = new ArrayList<Double>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0));
        ArrayList<Double> ls2 = new ArrayList<Double>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0));

        System.out.println(identicalLists(ls1, ls2));
    }
}
