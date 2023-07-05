/*
* 25.* Korisnik unosi cene artikala sve dok ne unese 0. Ispisati prosecnu vrednost artikala.
* */
package grupa1;

import java.util.Scanner;

public class Zadatak25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double suma, prosek, cena;
        int brojac = 0;
        suma = 0;

        System.out.print("Unesite cenu artikla ili 0 za izlaz: ");
        cena = sc.nextDouble();
        boolean unetaIspravnaVrednost = false;
        while (cena != 0) {
            if (cena < 0) {

                while (!unetaIspravnaVrednost) {
                    System.out.println("Greska! Cena ne moze biti negativna!");

                    System.out.print("Unesite cenu artikla ili 0 za izlaz: ");
                    cena = sc.nextDouble();

                    if (cena > 0) {
                        unetaIspravnaVrednost = true;
                        suma += cena;
                        brojac++;
                    }
                }
                // System.exit(1);
            } else {
                suma += cena;
                brojac++;
            }
            System.out.print("Unesite cenu artikla ili 0 za izlaz: ");
            cena = sc.nextDouble();
        }
        prosek = suma / brojac;
        System.out.println("Prosecna vrednost cene je: " + prosek);
    }
}
