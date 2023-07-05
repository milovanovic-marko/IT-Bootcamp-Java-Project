package grupa4oop.zadatak10;

import java.util.ArrayList;
import java.util.Arrays;

public class Testiranje {
    public static void main(String[] args) {
        Film f1 = new Film("f1", 1888, 5, "sadsadsad",1, 1, 1);
        Film f2 = new Film("f2", 1900, 5, "sadsadsad",1, 1, 1);
        Film f3 = new Film("f3", 2000, 5, "sadsadsad",1, 1, 1);
        Film f4 = new Film("f4", 2005, 5, "sadsadsad",1, 1, 1);
        Film f5 = new Film("f5", 2008, 5, "sadsadsad",1, 1, 1);

        FilmNaStanju fn1 = new FilmNaStanju(f1, 10, 100);
        FilmNaStanju fn2 = new FilmNaStanju(f2, 10, 200);
        FilmNaStanju fn3 = new FilmNaStanju(f3, 10, 300);
        FilmNaStanju fn4 = new FilmNaStanju(f4, 10, 400);
        FilmNaStanju fn5 = new FilmNaStanju(f5, 10, 500);

        VideoKlub vk1 = new VideoKlub("VK1", new ArrayList<>(Arrays.asList(fn1, fn2, fn3, fn4, fn5)));

        Korpa k1 = new Korpa(vk1,new ArrayList<>(Arrays.asList(fn1, fn5)));
        System.out.println(k1.getUkupnaCena());
        k1.dodajFilmUKorpu(f1, 5);
        System.out.println(k1.getKorpa());
        System.out.println(k1.getUkupnaCena());
    }
}
