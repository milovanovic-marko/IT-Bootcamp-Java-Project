package grupa4oop.zadatak1;

public class Osoba {

    private String ime, prezime;
    private int godinaRodjenja;
    private double visina;

    public Osoba(String ime, String prezime, int godinaRodjenja, double visina) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja = godinaRodjenja;
        this.visina = visina;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    @Override
    public String toString() {
        return "Ime osobe je: " + ime +
                "\nPrezime osobje je: " + prezime +
                "\nGodina rodjenja osobe je: " + godinaRodjenja +
                "\bVisina osobe je: " + visina;
    }
}
