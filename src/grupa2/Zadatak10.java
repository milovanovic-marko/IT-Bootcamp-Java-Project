/*
* 10. Napisati funkciju koja vraca najmanji element niza.
* */

package grupa2;

public class Zadatak10 {

    static double minNumInArray(double[] niz) {
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < niz.length; i++) {
            min = Math.min(niz[i], min);
        }
        return min;
    }

    public static void main(String[] args) {
        double[] niz = {-50, -40, -20, -4, -1, 0};
        System.out.println(minNumInArray(niz));
    }
}
