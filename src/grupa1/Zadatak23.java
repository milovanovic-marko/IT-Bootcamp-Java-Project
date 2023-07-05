/*
* 23.* Korisnik unosi pozitivan ceo broj n, n >= 2 sa konzole. Zatim se unose imena korisnika. Ispisati "da" ako
	su uneta dva korisnika sa istim imenom za redom (jedan za drugim), a "ne" inace.
	Npr:
	"Ana", "Marija", "Milica", "Milica", "Jelena", "Zorica" -> "da" (zbog "Milica", "Milica")
	"Branko", "Aleksandar", "Marko" -> "ne"
	"Tara", "Jana", "Tara", "Jana" -> "ne" (iako imamo duplikate nisu uneti za redom)
* */
package grupa1;

import java.util.Scanner;

public class Zadatak23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Unesite neki pozitivan ceo broj koji je >= 2: ");
        n = sc.nextInt();

        String[] imena = new String[n];

        sc.nextLine(); // sa ovim delom koda nema greske, a bez njega preskace jednom u for petlji unos stringa
        for (int i = 0; i < imena.length; i++) {
            System.out.print("Unesi neko ime: ");
            imena[i] = sc.nextLine();
        }

        String rezultat = "";
        for (int i = 1; i < imena.length; i++) {
            if (imena[i].equalsIgnoreCase(imena[i-1])) {
                rezultat = "Da";
                break;
            } else {
                rezultat = "Ne";
            }
        }
        System.out.println(rezultat);
    }
}
