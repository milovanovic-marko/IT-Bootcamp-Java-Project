package grupa4oop.zadatak2;

public class Pravougaonik {

    private double sirina, visina;

    public Pravougaonik(double sirina, double visina) {
        this.sirina = sirina;
        this.visina = visina;
    }

    public double getSirina() {
        return sirina;
    }

    public void setSirina(double sirina) {
        this.sirina = sirina;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    public double obim() {
        return (sirina + visina) * 2;
    }

    public double povrsina() {
        return sirina * visina;
    }

    @Override
    public String toString() {
        return "Pravougaonik sirine " + sirina + " i visine " + visina + " ima:" +
                "\nObim: " + obim() +
                "\nPovrsinu: " + povrsina();
    }
}
