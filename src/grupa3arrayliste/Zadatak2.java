/*
* 2. Napisati funkciju koja prima ArrayListu integera i vraca ArrayListu ciji su elementi duplirani u odnosu na
 	proslednjenju ArrayListu.
* */
package grupa3arrayliste;

import java.util.ArrayList;
import java.util.Arrays;

public class Zadatak2 {

    static ArrayList<Integer> doubleElements(ArrayList<Integer> lista) {
        ArrayList<Integer> ls = new ArrayList<>();
        ls.addAll(lista);
        for (int i = 0; i < lista.size(); i++) {
            ls.set(i, lista.get(i) * 2);
        }
        return ls;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        ArrayList<Integer> ls;
        ls = doubleElements(lista);
        System.out.println(ls);
    }
}
