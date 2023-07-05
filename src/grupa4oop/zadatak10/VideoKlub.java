package grupa4oop.zadatak10;

import java.util.ArrayList;

public class VideoKlub {

    private String naziv;
    private ArrayList<FilmNaStanju> katalog;

    public VideoKlub(String naziv, ArrayList<FilmNaStanju> katalog) {
        this.naziv = naziv;
        this.katalog = new ArrayList<>();
        this.katalog.addAll(katalog);
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public ArrayList<FilmNaStanju> getKatalog() {
        return katalog;
    }

    public void setKatalog(ArrayList<FilmNaStanju> katalog) {
        this.katalog = new ArrayList<>();
        this.katalog.addAll(katalog);
    }

    public void iznajmiFilm(Film f) {
        for (FilmNaStanju i : katalog) {
            if (f == i.getFilm()) {
                if (i.getKolicina() >= 1) {
                    i.setKolicina(i.getKolicina() - 1);
                } else {
                    System.out.print("Film " + f.getIme() + " trenutno nema na stanju");
                }
            } else {
                System.out.print("Film " + f.getIme() + " trenutno nema na stanju");
            }
        }
    }

    public void iznajmiFilm(Film f, int n) {
        for (FilmNaStanju i : katalog) {
            if (f == i.getFilm()) {
                if (i.getKolicina() >= n) {
                    i.setKolicina(i.getKolicina() - n);
                } else {
                    for (int j = 0; j < i.getKolicina(); j++) {
                        i.setKolicina(i.getKolicina() - 1);
                        n--;
                    }
                    System.out.println("Jos " + n + " kupaca zeli da iznajmi film " + f.getIme());
                }
            } else {
                System.out.print("Film " + f.getIme() + " trenutno nema na stanju");
            }
        }
    }

    public void dodajFilm(Film f, double c) {
        katalog.add(new FilmNaStanju(f, 1, c));
    }

    public void dodajFilm(Film f, double c, int n) {
        katalog.add(new FilmNaStanju(f, n, c));
    }

    public void pregledajFilm(Film f) {
        boolean nePostoji = false;
        for (FilmNaStanju i : katalog) {
            if (i.getFilm() == f) {
                System.out.println(i);
                nePostoji = true;
                break;
            }
        }
        if (nePostoji) {
            System.out.print(f.getIme() + " | Nema na stanju");
        }
    }

    public void pogledajKatalog() {
        for (FilmNaStanju i : katalog) {
            System.out.println(i);
        }
    }

    public boolean pronadjiFilm(Film f) {
        for (FilmNaStanju i : katalog) {
            if (f.equals(i.getFilm())) {return true;}
        }
        return false;
    }

}
