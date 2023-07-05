package grupa4oop.zadatak9;

import java.util.ArrayList;
import java.util.Arrays;

public class Testiranje {

    public static void main(String[] args) {
        Ucenik u1 = new Ucenik("A", "A");
        Ucenik u2 = new Ucenik("B", "B");
        Ucenik u3 = new Ucenik("C", "C");
        Ucenik u4 = new Ucenik("D", "D");
        Ucenik u5 = new Ucenik("E", "E");
        Ucenik u6 = new Ucenik("F", "F");
        ArrayList<Ucenik> i = new ArrayList<>(Arrays.asList(u1, u2, u3, u4, u5, u6, u1));
        i.remove(u1);
        System.out.println(i);
    }
}
