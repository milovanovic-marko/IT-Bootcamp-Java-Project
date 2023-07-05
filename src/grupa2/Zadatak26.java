/*
* 26. Napisati funkciju koji za zadat ugao u radijanima racuna zbir sinusa, kosinusa, tangensa i kotangensa tog ugla.
* */
package grupa2;

public class Zadatak26 {

    static double sumSinCosTanCotn(double radijani) {
        return Math.sin(radijani) + Math.cos(radijani) + Math.tan(radijani) + 1.0 / Math.tan(radijani);
    }

    public static void main(String[] args) {
        double rad = Math.PI / 2;

        System.out.println(sumSinCosTanCotn(rad));
    }
}
