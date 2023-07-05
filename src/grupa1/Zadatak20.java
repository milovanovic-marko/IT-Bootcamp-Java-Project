/*
* 20.* Unose se double konstante a, b, c, a zatim i pozitivan ceo broj n.
* Zatim se unose n double brojeva jedan po jedan. Cim se unese jedan od tih brojeva,
* na standardni izlaz ispisuje se vrednost polinoma: a*x^2 + b*x + c, gde je x taj uneti broj.
* */
package grupa1;

import java.util.Scanner;

public class Zadatak20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double A, B, C;
        int n;

        System.out.print("Unesite konstantu a: ");
        A = sc.nextDouble();

        System.out.print("Unesite konstantu b: ");
        B = sc.nextDouble();

        System.out.print("Unesite konstantu c: ");
        C = sc.nextDouble();

        System.out.print("Unesite neki pozitivan ceo broj: ");
        n = sc.nextInt();

        double x, rezultat;
        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj x: ");
            x = sc.nextDouble();
            rezultat = A * Math.pow(x, 2) + B * x + C;
            System.out.println("Resenje jednacine a*x^2 + b*x + c = " + rezultat);
        }
    }
}
