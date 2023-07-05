/*
* 29.* Za uneto m i n (intovi) iscrtati mxn sahovsku tablu, gde je belo polje oznaceno sa ' ' (space karakter),
	a crno polje sa '.' (tacka). Uzeti da je gornje levo polje uvek crno. Npr za m = 3, n = 3:
|. .|
| . |
|. .|
* */
package grupa1;

import java.util.Scanner;

public class Zadatak29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n;
        System.out.print("Unesite broj redova sahovske table: ");
        m = sc.nextInt();

        System.out.print("Unesite broj kolona sahovske table: ");
        n = sc.nextInt();

        for (int i = 0; i < m; i++) {
            System.out.print("|");
            for (int j = 0; j < n; j++) {
                if (i % 2 != 0) {
                    if (j % 2 != 0) {
                        System.out.print(".");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print(".");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("|");
            System.out.println();
        }

    }
}
