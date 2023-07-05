/*
* 6. Napisati funkciju koja racuna proizvod 3 broja.
* */
package grupa2;

public class Zadatak6 {

    static double proizvodTriBroja(double x, double y, double z) {
        return x * y * z;
    }

    public static void main(String[] args) {
        double x = 1, y = 2, z = 3;
        System.out.println(proizvodTriBroja(x, y, z));
    }
}
