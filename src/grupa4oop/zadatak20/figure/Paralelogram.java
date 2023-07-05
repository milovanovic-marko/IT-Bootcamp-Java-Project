package grupa4oop.zadatak20.figure;

import grupa4oop.zadatak20.baza.Figura;

public abstract class Paralelogram extends Figura {
    private double a, b;

    public Paralelogram(double a, double b) {
        this.a = a;
        this.b = b;
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
}
