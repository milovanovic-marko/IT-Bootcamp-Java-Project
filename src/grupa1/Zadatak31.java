/*
* 31.* Korisnik unosi vrednost za dva booleana p i q. Ispisati vrednost ("True" ili "False") narednog izrazraza :
	 "Ako je p tacno, onda je i q tacno."
* */
package grupa1;

import java.util.Scanner;

public class Zadatak31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean p, q;
        System.out.print("Unesite \"true\" ili \"false\": ");
        p = sc.nextBoolean();

        System.out.print("Unesite \"true\" ili \"false\": ");
        q = sc.nextBoolean();

        boolean rezultat = p && q;

        System.out.println(rezultat);
    }
}
