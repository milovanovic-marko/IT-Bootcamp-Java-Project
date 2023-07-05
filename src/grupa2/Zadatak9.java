/*
* 9. Napisati funkciju koja vraca najveci element niza.
* */

package grupa2;

public class Zadatak9 {

    static double maxNumInArray(double[] niz) {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < niz.length; i++) {
            max = Math.max(niz[i], max);
        }
        return max;
    }

    public static void main(String[] args) {
        double[] niz = {-10, -3, -4, -1, -5, -50, 0};

        System.out.println(maxNumInArray(niz));
    }
}
