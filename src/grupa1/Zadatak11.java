/*
* 11. Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
	"Dobrodosao u {x}. razred, {ime} {prezime}",
	pod pretpostavkom da je trenutna godina 2023.
	* Pretpostavimo da ima 12 razreda. A ako korisnik nije djak ispisati jednu odgovarajucu poruku od:
	"{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"
* */
package grupa1;

import java.time.Year;
import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ime, prezime;
        int godinaRodjenja;
        int trenutnaGodina = Year.now().getValue();;
        int brojRazreda = 12;
        
        System.out.print("Unesite ime: ");
        ime = sc.nextLine();

        System.out.print("Unesie prezime: ");
        prezime = sc.nextLine();

        System.out.print("Unesite godinu rodjenja: ");
        godinaRodjenja = sc.nextInt();
        
        if ((trenutnaGodina - godinaRodjenja) > (brojRazreda + 7)) {
            System.out.println(ime + " " + prezime + " je zavrsio/la skolu!");
        } else if ((trenutnaGodina - godinaRodjenja) < 7) {
            System.out.println(ime + " " + prezime + " tek treba da zapocne obrazovanje!");
        } else {
            int razred = trenutnaGodina - godinaRodjenja - 7;
            System.out.println("Dobrodosao/la u " + razred + ". razred, " + ime + " " + prezime + ".");
        }
    }
}
