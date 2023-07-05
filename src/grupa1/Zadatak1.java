/*
* 1. Za unet broj n, ispisati "Paran" ako je paran, a "Neparan" ako je neparan.
* */
package grupa1;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite neki broj: ");
        double n = sc.nextDouble();

        if (n % 2 == 0) {
            System.out.println("Paran");
        } else {
            System.out.println("Neparan");
        }
    }
}
