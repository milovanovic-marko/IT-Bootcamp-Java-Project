/*
* 7. Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.
* */
package grupa1;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Unesite neki negativan ceo broj: ");
        n = sc.nextInt();

        for (int i = n; i <= 0; i++) {
            System.out.println(i);
        }
    }
}
