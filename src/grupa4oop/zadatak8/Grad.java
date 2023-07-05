package grupa4oop.zadatak8;

public class Grad {

    private String ime, drzava;
    private int brojStanovnika;

    public Grad(String ime, String drzava, int brojStanovnika) {
        this.ime = ime;
        this.drzava = drzava;
        this.brojStanovnika = brojStanovnika;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public int getBrojStanovnika() {
        return brojStanovnika;
    }

    public void setBrojStanovnika(int brojStanovnika) {
        this.brojStanovnika = brojStanovnika;
    }

    @Override
    public String toString() {
        return "Ime grada: " + ime +
                "\nBroj stanovnika: " + brojStanovnika +
                "\nDrzava: " + drzava;
    }
}
