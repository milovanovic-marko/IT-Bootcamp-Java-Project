/*
* 2. Za unet broj n, ispisati "Pozitivan" ako je strogo veci od 0, "Negativan" ako je strogo manji od 0 ili "Neutralan" ako je tacno 0.
* */
package grupa1;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;
        System.out.print("Unesite neki broj: ");
        n = sc.nextDouble();
        if (n > 0) {
            System.out.println("Pozitivan");
        }
        if (n < 0) {
            System.out.println("Negativan");
        }
        if (n == 0) {
            System.out.println("Neutralan");
        }
    }
}
