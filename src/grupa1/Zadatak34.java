/*
* 34.** Za unet k-tocifren broj n izracunati sumu n1 - n2 + n3 - .... +/- nk, gde su n1,n2,n3,...,nk cifre broja n
	citane s leva na desno, redom.
* */
package grupa1;

import java.util.Scanner;

public class Zadatak34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Unesite neki broj: ");
        n = sc.nextInt();

        // Odredjujem broj cifara
        double temp = 1;

        // 1. nacin
        int brojCifara = (int) (Math.log10(n) + 1);

        /* 2. nacin
        int brojCifara = String.valueOf(n).length();
         */

        /* 3. nacin
        int brojCifara = 0;
        while (temp <= n) {
            brojCifara++;
            temp *= 10;
        }
         */

        int brojac = 0;
        double rezultat = 0;
        double decimale;
        for (int i = brojCifara; i > 0; i--) {
            brojac++;
            if (brojac == 1) {
                decimale = (n / Math.pow(10, i - 1)) % 1;
                temp = (n / Math.pow(10, i - 1)) - decimale;
                n -= temp * Math.pow(10, i - 1);
                rezultat = temp;
            } else if (brojac % 2 == 0) {
                decimale = (n / Math.pow(10, i - 1)) % 1;
                temp = n / Math.pow(10, i - 1) - decimale;
                n -= temp * Math.pow(10, i - 1);
                rezultat -= temp;
            } else {
                decimale = (n / Math.pow(10, i - 1)) % 1;
                temp = n / Math.pow(10, i - 1) - decimale;
                n -= temp * Math.pow(10, i - 1);
                rezultat += temp;
            }
        }
        System.out.println("Rezultat = " + rezultat);
    }
}
