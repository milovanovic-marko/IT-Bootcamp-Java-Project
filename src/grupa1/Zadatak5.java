/*
* 5.* Za unet cetvorocifren broj ispisati razliku proizvoda njegovih prvih dveju cifara od zbira njegovih drugih dveju cifara.
* */
package grupa1;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int broj, hiljade, stotine, desetice, jedinice, rezultat;

        System.out.print("Unesite neki cevorocifren broj: ");
        broj = sc.nextInt();

        // 1. nacin
        System.out.println("1. nacin:");
        String brojToString = Integer.toString(broj);
        int prvaCifra = Character.getNumericValue(brojToString.charAt(0));
        int drugaCifra = Character.getNumericValue(brojToString.charAt(1));
        int trecaCifra = Character.getNumericValue(brojToString.charAt(2));
        int cetvrtaCifra = Character.getNumericValue(brojToString.charAt(3));

        rezultat = (prvaCifra * drugaCifra) - (trecaCifra + cetvrtaCifra);
        System.out.println("Rezultat: " + rezultat);
        System.out.println();

        // 2. nacin
        System.out.println("2. nacin:");
        hiljade = broj / 1000;
        broj -= hiljade * 1000;

        stotine = broj / 100;
        broj -= stotine * 100;

        desetice = broj / 10;
        jedinice =  broj - desetice * 10;

        rezultat = (hiljade * stotine) - (desetice + jedinice);
        System.out.println("Rezultat: " + rezultat);
    }
}
