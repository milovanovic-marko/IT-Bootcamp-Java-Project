/*
* 1. Napisati fukciju koja prima ArrayListu integera i ispisuje sve njene elemente.
* */

package grupa3arrayliste;

import java.util.ArrayList;
import java.util.Arrays;

public class Zadatak1 {

    static void printArray(ArrayList<Integer> lista) {
        System.out.println(lista);
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        printArray(lista);
    }
}
