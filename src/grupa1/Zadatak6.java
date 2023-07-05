/*
* 6. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0 do i zakljucno sa n.
* */
package grupa1;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Uneiste neki ceo pozitivan broj: ");
        n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
}
