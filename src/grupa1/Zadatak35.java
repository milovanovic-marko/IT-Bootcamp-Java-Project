/*
* 35.** Za zadati celi broj n izracunati njegov skriven broj.
* Skriven broj se racuna tako sto sabiramo njegove cifre sve dok ne dobijemo jednocifren broj.
Npr 9999 -> 9 jer:
9+9+9+9 = 36
3+6 = 9
* */
package grupa1;

import java.util.Scanner;

public class Zadatak35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res;
        System.out.print("Unesite neki ceo broj: ");
        res = sc.nextInt();

        // 1. nacin
        int numOfDigits = (int) (Math.log10(res) + 1);
        int temp = 1;

        /* 2. nacin
        int numOfDigits = 0;
        while (temp <= res) {
            numOfDigits++;
            temp *= 10;
        }
         */

        int digit;
        int sum;
        while (numOfDigits > 1) {
            sum = 0;
            for (int i = numOfDigits; i > 0; i--) {
                digit = (int) (res / Math.pow(10, i - 1));
                res -= digit * Math.pow(10, i-1);
                sum += digit;
            }

            res = sum;
            numOfDigits = 0; // broj cifara vracamo na 0 za novi broj
            temp = 1;
            while (temp <= res) {
                numOfDigits++;
                temp *= 10;
            }
        }
        System.out.println("Tajni broj je: " + res);
    }
}
