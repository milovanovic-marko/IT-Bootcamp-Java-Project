package grupa4oop.zadatak12;

public class Krug extends Elipsa {
    public Krug(double r) {
        super(r, r);
    }

    public Krug() {
    }

    @Override
    public void setA(double r) {
        super.setA(r);
        super.setB(r);
    }

    @Override
    public void setB(double r) {
        super.setA(r);
        super.setB(r);;
    }

    public double obim() {
        return 2 * getA() * Math.PI;
    }

    @Override
    public String toString() {
        return "Elipsa poluprecnika " + getA() + " ima" +
                "\nObim: " + obim() +
                "\nPovrsinu: " + povrsina() +
                "\nEkscentritet: " + ekscentricitet();
    }
}
