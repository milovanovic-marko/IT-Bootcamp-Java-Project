/*
* 14. Za unete brojeve a i b ispisati veci od njih.
* */
package grupa1;

import java.util.Scanner;

public class Zadatak14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b;

        System.out.print("Unesite prvi broj: ");
        a = sc.nextDouble();

        System.out.print("Unesite drugi broj: ");
        b = sc.nextDouble();

        System.out.println("Najveci broj je: " + Math.max(a, b));
    }
}
