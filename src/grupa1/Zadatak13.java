/*
* 13.* Za unet pozitivan ceo broj n, ispisati za svaki pozitivan ceo broj t,
* koji je strogo manji od njega (dakle t < n), sumu svih pozitivnih celih
* brojeva od 1 do tog broja (dakle 1 + 2 + 3 + ... + t).
* */
package grupa1;

import java.util.Scanner;

public class Zadatak13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Unesite neki pozitivan ceo broj: ");
        n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.print("Za t = " + i + " suma je = ");
            int suma = 0;
            for (int j = 1; j <= i; j++) {
                suma += j;
            }
            System.out.println(suma);
        }
    }
}
