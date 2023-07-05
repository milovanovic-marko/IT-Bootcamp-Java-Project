package grupa4oop.zadatak11;

public class Kvadrat extends Pravougaonik {
    public Kvadrat(double a) {
        super(a, a);
    }

    public Kvadrat() {
    }

    @Override
    public String toString() {
        return "Kvadrat stranice " + super.getA() +
                "\nObim: " + obim() +
                "\nPovrsina: " + povrsina();
    }
}
