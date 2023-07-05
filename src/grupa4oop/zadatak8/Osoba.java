package grupa4oop.zadatak8;

import java.util.Objects;

public class Osoba {
    private String ime, prezime;

    public Osoba(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
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

    @Override
    public boolean equals(Object o) {
        if (this.hashCode() == o.hashCode()) {
            if (this == o) return true;
            if (!(o instanceof Osoba osoba)) return false;
            return Objects.equals(ime, osoba.ime) && Objects.equals(prezime, osoba.prezime);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ime, prezime);
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }
}
