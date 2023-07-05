/*
* 30.Napisati funkciju koja vraca broj pokusaja koji su bili potrebni da javin nasumicni generator
* brojeva pogodi zadati celi broj iz intervala [1, 100].
* */
package grupa2;

public class Zadatak30 {

    static int pogodiBroj(int broj) {
        double randomBroj;
        int brojac = 0;
        while (true) {
            brojac++;
            randomBroj = Math.random() * 100 + 1;
            if (broj == (int) randomBroj) {
                return brojac;
            }
        }
    }

    public static void main(String[] args) {
        int broj = 53;
        System.out.println(pogodiBroj(broj));
    }
}
