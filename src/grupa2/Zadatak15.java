/*
* 15. Napisati funkciju koja ispituje da li je suma niza veca od njegovog proizvoda.
* */
package grupa2;

public class Zadatak15 {

    static void daLiJeSumaVecaOdProizvodaNiza(double[] niz) {
        String rezultat = sumaNiza(niz) > proizvodNiza(niz) ? "Suma niza je veca od proizvoda niza" : "Suma niza nije veca od proizvoda niza";
        System.out.println(rezultat);
    }

    static double sumaNiza(double[] niz) {
        double sum = 0;
        for (double i : niz) {
            sum += i;
        }
        return sum;
    }

    static double proizvodNiza(double[] niz) {
        double proizvod = 1;
        for (double i : niz) {
            proizvod *= i;
        }
        return proizvod;
    }

    public static void main(String[] args) {
        double[] niz1 = {1, 1, 1, 4, 1, 1, 1, 1, 1, 1};
        daLiJeSumaVecaOdProizvodaNiza(niz1);
    }
}
