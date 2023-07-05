/*
* 29.Napisati fuknciju koja vraca double duzinu poluprecnika kruga za prosledjenu double povrsinu kruga.
* */
package grupa2;

public class Zadatak29 {

    static double poluprecnikKruga(double povrsinaKruga) {
        return Math.sqrt(povrsinaKruga / Math.PI);
    }

    public static void main(String[] args) {
        double povrsina = 100;
        System.out.println(poluprecnikKruga(povrsina));
    }
}
