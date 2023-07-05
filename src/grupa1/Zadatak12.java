/*
* 12. Za unet ceo broj n, ispisati za svaki od brojeva [1, n] "Fizz" ako je deljiv sa 3,
* "Buzz" ako je deljiv sa 5, "Zazz" ako je deljiv sa 7 i sve ostale varijacije ("BuzzZazz" ako je deljiv i sa 5 i sa 7, ...)
* */
package grupa1;

import java.util.Scanner;

public class Zadatak12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Unesite neki ceo broj: ");
        n = sc.nextInt();

        String tekst;
        for (int i = 1; i <= n; i++) {
            tekst = "";
            if (i % 3 == 0) {
                tekst += "Fizz";
            }
            if (i % 5 == 0) {
                tekst += "Buzz";
            }
            if (i % 7 == 0) {
                tekst += "Zazz";
            }
            System.out.println(i + ": " + tekst);
        }
    }
}
