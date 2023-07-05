/*
* 4. Za uneta dva broja ispisati poruku "Istog znaka" ako su oba broja istog znaka, a poruku "Suprotnog znaka", ako nisu istog znaka.
* */
package grupa1;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b;
        System.out.print("Unesite prvi broj: ");
        a = sc.nextDouble();

        System.out.print("Unesite drugi broj: ");
        b = sc.nextDouble();

        if (a * b > 0) {
            System.out.println("Istog znaka");
        } else {
            System.out.println("Suprotnog znaka");
        }
    }
}
