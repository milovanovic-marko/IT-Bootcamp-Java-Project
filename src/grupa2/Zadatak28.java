/*
* 28.Napisati fuknciju koja vraca double duzinu stranice kvadrata za prosledjenu double povrsinu kvadrata.
* */
package grupa2;

public class Zadatak28 {

    static double stranicaKvadrata(double povrsinaKvadrata) {
        return Math.sqrt(povrsinaKvadrata);
    }

    public static void main(String[] args) {
        double povrsina = 100;
        System.out.println(stranicaKvadrata(povrsina));
    }
}
