/*
* 26.* Za unete dve godine g1 i g2 ispisati koliko ima prestupnih godina u intervalu [g1, g2]. Godina je prestupna akko:
- Deljiva je sa 4
- Nije deljiva sa 100 ili je deljiva sa 400
* */
package grupa1;

import java.util.Scanner;

public class Zadatak26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g1, g2;

        System.out.print("Unesite prvu godinu: ");
        g1 = sc.nextInt();

        if (g1 < 0) {
            System.out.println("Greska! Uneli ste negativnu godinu");
            System.exit(1);
        }

        System.out.print("Unesite drugu godinu: ");
        g2 = sc.nextInt();
        if (g2 < 0) {
            System.out.println("Greska! Uneli ste negativnu godinu");
            System.exit(1);
        }

        int brojac = 0;
        if (g1 > g2) {
            for (int i = g2; i <= g1; i++) {
                if ((i % 4 == 0) && (i % 100 !=0 || i % 400 ==0)) {
                    brojac++;
                }
            }
        } else {
            for (int i = g1; i <= g2; i++) {
                if (i % 4 == 0 && (i % 100 !=0 || i % 400 ==0)) {
                    brojac++;
                }
            }
        }
        System.out.println("Izmedju zadatih godina postoji " + brojac + " prestupnih godina.");
    }
}
