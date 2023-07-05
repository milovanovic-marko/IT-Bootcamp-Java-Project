package grupa4oop.zadatak10;

public class FilmNaStanju {

    private Film film;
    private int kolicina;
    private double cena;

    public FilmNaStanju(Film film, int kolicina, double cena) {
        this.film = film;
        this.kolicina = kolicina;
        this.cena = cena;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return film.getIme() + " - " + cena + " | " + "Na stanju: " + kolicina;
    }
}
