/*
* 17. Napraviti digitron koji prima double, char, double, gde je char neki od
* simbola: {+, -, *, /, %, ^} i ispisuje resenje odgovarajuce operacije.
* */
package grupa1;

import java.util.Scanner;

public class Zadatak17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b , rezultat;
        char operator;

        System.out.print("Unesite prvi broj u digitron: ");
        a = sc.nextDouble();

        System.out.print("Unesite oprator u digitron: ");
        operator = sc.next().charAt(0);

        System.out.print("Unesite drugi broj u digitron: ");
        b = sc.nextDouble();

        switch (operator) {
            case '+' -> {
                rezultat = a + b;
                System.out.print(" = " + rezultat);
            }
            case '-' -> {
                rezultat = a - b;
                System.out.print(" = " + rezultat);
            }
            case '*' -> {
                rezultat = a * b;
                System.out.print(" = " + rezultat);
            }
            case '/' -> {
                rezultat = a / b;
                System.out.print(" = " + rezultat);
            }
            case '%' -> {
                rezultat = a % b;
                System.out.print(" = " + rezultat);
            }
            case '^' -> {
                rezultat = Math.pow(a, b);
                System.out.print(" = " + rezultat);
            }
        }
    }
}
