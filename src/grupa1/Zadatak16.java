/*
* 16. Ispisati tablicu mnozenja jednocifrenih brojeva (dakle tabela 10x10, 0 u prvom polju, 81 u poslednjem polju)
* */
package grupa1;

import java.util.Scanner;

public class Zadatak16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (i * j < 10) {
                    System.out.print(i * j + "  ");
                } else {
                    System.out.print(i * j + " ");
                }
            }
            System.out.println();
        }
    }
}
