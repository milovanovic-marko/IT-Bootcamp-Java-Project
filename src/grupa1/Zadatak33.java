/*
* 33.* Za unet trocifren broj n izracunati sumu n1 - n2 + n3, gde je n1 vodeca cifra, n2 sredisnja cifra, a n3 polsednja cifra broja n.
	(Dakle, n = n1n2n3)
	Npr:
	n = 876 -> 7 (jer imamo 8 - 7 + 6 | n1 = 8, n2 = 7, n3 = 6)
* */
package grupa1;

import java.util.Scanner;

public class Zadatak33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, stotine, desetice, jedinice;
        System.out.print("Unesite neki trocifreni broj: ");
        n = sc.nextInt();

        // 1. nacin
        System.out.println();
        System.out.println("1. nacin:");
        stotine = n / 100;
        desetice = (n - stotine * 100) / 10;
        jedinice = n - (stotine * 100 + desetice * 10);

        System.out.println("Resenje izraza: n1 - n2 + n3 = " + (stotine - desetice + jedinice));

        // 2. nacin
        System.out.println("2. nacin:");
        String brojToString = Integer.toString(n);
        int prvaCifra = Character.getNumericValue(brojToString.charAt(0));
        int drugaCifra = Character.getNumericValue(brojToString.charAt(1));
        int trecaCifra = Character.getNumericValue(brojToString.charAt(2));

        System.out.println("Resenje izraza: n1 - n2 + n3 = " + (prvaCifra - drugaCifra + trecaCifra));
    }
}
