/*
* 16. Napisati funkciju koja racuna prosecnu vrednost double[] niza.
* */
package grupa2;

public class Zadatak16 {

    static double avgArray(double[] niz) {
        double sum = 0;
        for (double i : niz) {
            sum += i;
        }
        return sum / niz.length;
    }

    public static void main(String[] args) {
        double[] niz = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(avgArray(niz));
    }
}
