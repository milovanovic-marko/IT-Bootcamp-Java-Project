package grupa4oop.zadatak11;

import java.util.Objects;

public class Pravougaonik {
    private double a, b;

    public Pravougaonik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Pravougaonik() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double obim() {
        return (a + b) * 2;
    }

    public double povrsina() {
        return a * b;
    }

    @Override
    public boolean equals(Object o) {
        if (this.hashCode() == o.hashCode()) {
            if (this == o) return true;
            if (!(o instanceof Pravougaonik that)) return false;
            return (Double.compare(that.a, a) == 0 && Double.compare(that.b, b) == 0) || (Double.compare(that.a, b) == 0 && Double.compare(that.b, a) == 0);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "Pravougaonik stranica " + a + " i " + b +
                "\nObim: " + obim() +
                "\nPovrsina: " + povrsina();
    }
}
