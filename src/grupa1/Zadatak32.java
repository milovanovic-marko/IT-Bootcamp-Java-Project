/*
* 32.* Korisnik unosi novac na racunu kojim raspolaze kao i cenu nekog artikla. Na standardni izlaz ispisati koliko kopija tog
	artika korisnik moze da kupi.
* */
package grupa1;

import java.util.Scanner;

public class Zadatak32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double novac, cena, brojKopija;
        System.out.print("Unesite koliko imate novca na racunu: ");
        novac = sc.nextDouble();

        System.out.print("Unesite cenu artikla: ");
        cena = sc.nextDouble();

        brojKopija = (novac / cena) - ((novac / cena) % 1) ;

        System.out.println("Mozete kupiti " + brojKopija + " kopija proizvoda");
    }
}
