/*
* 9. Ispisati proizvod prvih n celih brojeva [1, n].
* */
package grupa1;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Uneiste neki ceo broj: ");
        n = sc.nextInt();

        double faktorijel = 1;
        for (int i = 1; i <= n; i++) {
            faktorijel *= i;
        }
        System.out.println("Faktorijel broja: " + faktorijel);
    }
}
