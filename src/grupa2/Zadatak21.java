/*
* 21.** Napisati funkciju koja vraca maximum od dva broja bez koriscenja if-ova, switch-ova ili ? operatora.
* */
package grupa2;

public class Zadatak21 {

    static int maximumNacin1(int x, int z) {
        return Math.max(x, z);
    }

    static int maximumNacin2(int x, int z) {
        int max = 0;
        while (x > 0 || z > 0) {
            x--;
            z--;
            max++;
        }
        return max;
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 50;

        System.out.println(maximumNacin1(a, b));
        System.out.println(maximumNacin2(a, b));
    }
}
