/*
* 25.
a)Napisati funkciju koja konvertuje stepene u radijane.
b)Napisati funkciju koja konvertuje radijane u stepene.
(360 stepeni = 2*PI radijana)
* */
package grupa2;

public class Zadatak25 {

    // a)

    static double deg2Rad(double deg) {
        return deg / 180 * Math.PI;
    }

    // b)

    static double rad2Deg(double rad) {
        return rad / Math.PI * 180;
    }

    public static void main(String[] args) {
        double stepeni = 180;
        double radijani = Math.PI / 2;

        System.out.println(deg2Rad(stepeni));
        System.out.println(rad2Deg(radijani));
    }
}
