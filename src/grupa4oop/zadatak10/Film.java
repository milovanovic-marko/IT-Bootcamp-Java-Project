package grupa4oop.zadatak10;

import java.util.Objects;

public class Film {

    private String ime;
    private int godinaPremijere;
    private double ocena;
    private String sadrzaj;
    private int sati, minuti, sekunde;

    public Film(String ime, int godinaPremijere, double ocena, String sadrzaj, int sati, int minuti, int sekunde) {
        this.ime = ime;
        postaviGodinuPremijere(godinaPremijere);
        postaviOcenu(ocena);
        this.sadrzaj = sadrzaj;
        postaviSate(sati);
        postaviMinute(minuti);
        postaviSekunde(sekunde);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodinaPremijere() {
        return godinaPremijere;
    }

    public void setGodinaPremijere(int godinaPremijere) {
        postaviGodinuPremijere(godinaPremijere);
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        postaviOcenu(ocena);
    }

    public String getSadrzaj() {
        return sadrzaj;
    }

    public void setSadrzaj(String sadrzaj) {
        this.sadrzaj = sadrzaj;
    }

    public int getSati() {
        return sati;
    }

    public void setSati(int sati) {
        postaviSate(sati);
    }

    public int getMinuti() {
        return minuti;
    }

    public void setMinuti(int minuti) {
        postaviMinute(minuti);
    }

    public int getSekunde() {
        return sekunde;
    }

    public void setSekunde(int sekunde) {
        postaviSekunde(sekunde);
    }

    private void postaviGodinuPremijere(int godinaPremijere) {
        if (godinaPremijere >= 1888 && godinaPremijere <= 2021) {
            this.godinaPremijere = godinaPremijere;
        } else {
            this.godinaPremijere = 2021;
        }
    }

    private void postaviOcenu(double ocena) {
        if (ocena >= 1 && ocena <= 10) {
            this.ocena = ocena;
        } else {
            this.ocena = 1;
        }
    }

    private void postaviSate(int sati) {
        if (sati >= 0 && sati < 10) {
            this.sati = sati;
        } else {
            this.sati = 1;
        }
    }

    private void postaviMinute(int minuti) {
        if (minuti >= 0 && minuti <= 59) {
            this.minuti = minuti;
        } else {
            this.minuti = 30;
        }
    }

    private void postaviSekunde(int sekunde) {
        if (sekunde >= 0 && sekunde <= 59) {
            this.sekunde = sekunde;
        } else {
            this.sekunde = 0;
        }
    }

    @Override
    public String toString() {
        return ime + " " + godinaPremijere + " " + ocena +
                "\nDuzina trajanja: " + sati + " : " + minuti + " : " + sekunde +
                "\n" + sadrzaj;
    }

    @Override
    public boolean equals(Object o) {
        if (this.hashCode() == o.hashCode()) {
            if (this == o) return true;
            if (!(o instanceof Film film)) return false;
            return godinaPremijere == film.godinaPremijere && Double.compare(film.ocena, ocena) == 0 && sati == film.sati && minuti == film.minuti && sekunde == film.sekunde && Objects.equals(ime, film.ime) && Objects.equals(sadrzaj, film.sadrzaj);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ime, godinaPremijere, ocena, sadrzaj, sati, minuti, sekunde);
    }
}
