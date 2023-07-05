/*
* 8. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa -14 do i zakljucno sa 2n.
* */
package grupa1;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Unesite neki pozitivan ceo broj: ");
        n = sc.nextInt();

        for (int i = -14; i <= 2*n; i++) {
            System.out.println(i);
        }
    }
}
