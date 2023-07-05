/*
* 3. Za uneta dva broja a i b ispisati rezultat svih 5 osnovnih aritmetickih operacija: a+b, a-b, a*b, a/b, a%b.
* */
package grupa1;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b;
        System.out.print("Unesite prvi broj: ");
        a = sc.nextDouble();

        System.out.print("Unesite drugi broj: ");
        b = sc.nextDouble();

        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
        System.out.println("a % b = " + (a%b));
    }
}
