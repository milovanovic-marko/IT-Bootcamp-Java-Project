/*
* 30.* Za unetu stranicu a, iscrtati jednakostranicni trougao. Npr za a = 5:
|    *
|   * *
|  * * *
| * * * *
|* * * * *
* */
package grupa1;

import java.util.Scanner;

public class Zadatak30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        System.out.print("Unesi velicinu stranice jednakostranicnog trougla: ");
        a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            // prazna mesta
            for (int j = a; j >= i; j--) {
                System.out.print(" ");
            }
            // pozicije zvezdica
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
