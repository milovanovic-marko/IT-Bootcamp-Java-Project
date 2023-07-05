package grupa4oop.zadatak3;

public class Krug {

    private double poluprecnik;

    public Krug(double poluprecnik) {
        this.poluprecnik = poluprecnik;
    }

    public double getPoluprecnik() {
        return poluprecnik;
    }

    public void setPoluprecnik(double poluprecnik) {
        this.poluprecnik = poluprecnik;
    }

    public double obim() {
        return 2 * poluprecnik * Math.PI;
    }

    public double povrsina() {
        return Math.pow(poluprecnik, 2) * Math.PI;
    }
}
