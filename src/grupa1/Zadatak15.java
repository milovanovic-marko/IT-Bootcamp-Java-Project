/*
* 15. Za unete brojeve a, b i c ispisati najmanji od njih
* */
package grupa1;

import java.util.Scanner;

public class Zadatak15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("Unesite prvi broj: ");
        a = sc.nextDouble();

        System.out.print("Unesite drugi broj: ");
        b = sc.nextDouble();

        System.out.print("Unesite treci broj: ");
        c = sc.nextDouble();

        System.out.println("Najmanji broj je: " + Math.min(c, Math.min(a, b)));
    }
}
