package grupa4oop.zadatak12;

import java.util.Objects;

public class Elipsa {
    private double a, b;

    public Elipsa(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Elipsa() {
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

    public double povrsina() {
        return a * b * Math.PI;
    }

    public double ekscentricitet() {
        return Math.sqrt(1 - (a / b));
    }

    public double vecaPoluosa() {
        return Math.max(a, b);
    }

    public double manjaPoluosa() {
        return Math.min(a, b);
    }

    @Override
    public boolean equals(Object o) {
        if (this.hashCode() == o.hashCode()) {
            if (this == o) return true;
            if (!(o instanceof Elipsa elipsa)) return false;
            return Double.compare(elipsa.a, a) == 0 && Double.compare(elipsa.b, b) == 0;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "Elipsa vece poluose: " + vecaPoluosa() + " i manje poluose: " + manjaPoluosa() + " ima" +
                "\nPovrsinu: " + povrsina() +
                "\nEkscentritet: " + ekscentricitet();
    }
}
