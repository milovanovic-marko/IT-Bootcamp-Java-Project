/*
* 18. Uneti pozitivan ceo broj n. Zatim izracunati sumu unetih narednih n brojeva (double).
* */
package grupa1;

import java.util.Scanner;

public class Zadatak18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double broj;
        System.out.print("Unesite neki pozitivan ceo broj: ");
        n = sc.nextInt();

        double suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Unesite neki broj: ");
            broj = sc.nextDouble();
            suma += broj;
        }
        System.out.println("Suma je: "+ suma);
    }
}
