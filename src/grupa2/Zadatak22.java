/*
* 22.*
a) Napisati funkciju koja ispituje da li je niz monoton ili nije.
* Niz je monoton ako je ili rastuci ili opadajuci ili konstantan, ali ne i rastuci i opadajuci.
b) Napisati funkciju koja ispituje da li je niz strogo monoton ili nije.
* Niz je strogo monoton ako je iskljucivo rastuci ili iskljucivo  opadajuci i u nikojem delu nije konstantan (nema ponavljajucih elemenata)
* */
package grupa2;

public class Zadatak22 {

    // a)
    static void nizJeMonoton(int[] niz) {
        int brojacOpadajuci = 1;
        int brojacRastuci = 1;
        for (int i = 1; i < niz.length; i++) {
            if (niz[i] <= niz[i-1]) {
                brojacOpadajuci++;
            }
            if (niz[i] >= niz[i-1]) {
                brojacRastuci++;
            }
        }
        if (brojacOpadajuci == niz.length || brojacRastuci == niz.length) {
            System.out.println("Niz je monoton");;
        } else {
            System.out.println("Niz nije monoton");
        }
    }

    // b)
    static void nizJeStrogoMonoton(int[] niz) {
        int brojacOpadajuci = 1;
        int brojacRastuci = 1;
        for (int i = 1; i < niz.length; i++) {
            if (niz[i] < niz[i-1]) {
                brojacOpadajuci++;
            }
            if (niz[i] > niz[i-1]) {
                brojacRastuci++;
            }
        }
        if (brojacOpadajuci == niz.length || brojacRastuci == niz.length) {
            System.out.println("Niz je strogo monoton");;
        } else {
            System.out.println("Niz nije strogo monoton");
        }
    }

    public static void main(String[] args) {
        int[] niz = {9, 8, 7, 6, 5, 4, 3, 3, 2, 1};
        nizJeMonoton(niz);
        nizJeStrogoMonoton(niz);
    }
}
