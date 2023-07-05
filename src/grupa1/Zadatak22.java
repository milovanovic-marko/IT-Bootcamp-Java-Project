/*
* 22. Korisnik unosi ime i prezime (jedan String), ime predmeta (String) i prosecnu ocenu istog (double). Validni predmeti su:
    {Srpski, Engleski, Matematika, Fizika, Hemija, Fizicko, Biologija, Istorija, Geografija}
	Na standardni izlaz ispisati poruku:
	"{ime i prezime} je {atribut} iz {kategorija predmeta}, jer je imao/la prosecnu ocenu {prsoecnu ocenu} iz predmeta {ime predmeta}",
	gde je atribut:
	1.) "veoma dobar/ra", ako je prosecna ocena iznad 3.5
	2.) "dobar/ra", ako je prosecna ocena izmedju 2.5 i 3.5
	3.) "veoma los/a", ako je prsoecna ocena ispod 2.5
	kategorija predmeta:
	1.) "prirodnih nauka" - Matematika, Fizika, Hemija
	2.) "jezika" - Srpski, Engleski
	3.) "opstih predmeta" - Biologoija, Istorija, Geografija
	Dakle, za unos:
	- "Ana Brankovic", "Biologija", 4.2
	poruka bi izgledala:
	"Ana Brankovic je veoma dobar/ra iz opstih predmeta, jer je imao/la prosecnu ocenu 4.2 iz predmeta Biologija"
* */
package grupa1;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String imeIPrezime, predmet, atribut, kategorijaPredmeta;
        double prosecnaOcena;
        String[] validniPredmeti = {"srpski", "engleski", "matematika", "fizika", "hemija", "fizicko", "biologija", "istorija", "geografija"};

        System.out.print("Unesite ime i prezime: ");
        imeIPrezime = sc.nextLine().trim();

        System.out.print("Unesite naziv predmeta: ");
        predmet = sc.nextLine().trim().toLowerCase();

        // 1. nacin
        boolean postojiPredmet = true;
        for (int i = 0; i < validniPredmeti.length; i++) {
            if (predmet.equalsIgnoreCase(validniPredmeti[i])) {
                postojiPredmet = false;
            }
        }
        if (postojiPredmet) {
            System.out.println("Greska! Predmet nije validan!");
            System.exit(1);
        }

        /* 2. nacin
        if (Arrays.stream(validniPredmeti).noneMatch(predmet::equalsIgnoreCase)) {
            System.out.println("Greska! Predmet nije validan!");
            System.exit(1);
        }
        */

        System.out.print("Unesite prosecnu ocenu iz predmeta: ");
        prosecnaOcena = sc.nextDouble();
        if (prosecnaOcena > 5 || prosecnaOcena < 1) {
            System.out.println("Greska! Prosecna ocena mora biti u opsegu od 1 do 5!");
        }

        if (prosecnaOcena > 3.5) {
            atribut = "veoma dobar/a";
        } else if (prosecnaOcena < 2.5) {
            atribut = "veoma los/a";
        } else {
            atribut = "dobar/a";
        }

        switch (predmet) {
            case "matematika", "fizika", "hemija" -> {
                kategorijaPredmeta = "prirodnih nauka";
            }
            case "srpski", "engleski" -> {
                kategorijaPredmeta = "jezika";
            }
            case "biologija", "istorija", "geografija" -> {
                kategorijaPredmeta = "opstih predmeta";
            }
            default -> {
                kategorijaPredmeta = "";
            }
        }
        System.out.println(imeIPrezime + " je " + atribut + " iz " + kategorijaPredmeta + ", jer je imao/la prosecnu ocenu " + prosecnaOcena + " iz predmeta " + predmet.substring(0, 1).toUpperCase() + predmet.substring(1));
    }
}
