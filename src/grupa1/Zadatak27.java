/*
* 27. Za unetu visinu h, iscrtati levu Mario kulu. Npr za h = 5:
|#
|##
|###
|####
|#####
(| obelezava pocetak reda i to ne crtate)
* */
package grupa1;

import java.util.Scanner;

public class Zadatak27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h;
        System.out.print("Unesite visinu h: ");
        h = sc.nextInt();

        // 1. nacin
        System.out.println();
        System.out.println("1. nacin");
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        // 2. nacin
        System.out.println();
        System.out.println("2. nacin");
        for (int i = 1; i <= h; i++) {
            System.out.println("#".repeat(i));
        }
    }
}
