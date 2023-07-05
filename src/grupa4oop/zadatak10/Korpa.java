package grupa4oop.zadatak10;

import java.util.ArrayList;

public class Korpa {

    private VideoKlub vk;
    private ArrayList<FilmNaStanju> korpa;
    private double ukupnaCena;

    public Korpa(VideoKlub vk, ArrayList<FilmNaStanju> korpa) {
        this.vk = vk;
        this.korpa = new ArrayList<>();
        this.korpa.addAll(korpa);
        this.ukupnaCena = ukupnaCena();
    }

    public VideoKlub getVk() {
        return vk;
    }

    public void setVk(VideoKlub vk) {
        this.vk = vk;
    }

    public ArrayList<FilmNaStanju> getKorpa() {
        return korpa;
    }

    public void setKorpa(ArrayList<FilmNaStanju> korpa) {
        this.korpa = new ArrayList<>();
        this.korpa.addAll(korpa);
    }

    public double getUkupnaCena() {
        return ukupnaCena();
    }

    public void setUkupnaCena() {
        this.ukupnaCena = ukupnaCena();
    }

    private double ukupnaCena() {
        double sum = 0;
        for (FilmNaStanju f : korpa) {
            for (FilmNaStanju fns : vk.getKatalog()) {
                if (f.getFilm().equals(fns.getFilm())) {
                    sum += f.getCena() * f.getKolicina();
                }
            }
        }
        return sum;
    }

    public void dodajFilmUKorpu(Film f) {
        boolean naStanju = false;
        boolean uKorpi;
        for (FilmNaStanju i : vk.getKatalog()) {
            if (f.equals(i.getFilm())) {
                uKorpi = false;
                for (FilmNaStanju fns : korpa) {
                    if (fns.getFilm().equals(f)) {
                        fns.setKolicina(fns.getKolicina()+1);
                        i.setKolicina(i.getKolicina()-1);
                        uKorpi = true;
                    }
                }
                if (!uKorpi) {
                    korpa.add(new FilmNaStanju(f, 1, i.getCena()));
                    i.setKolicina(i.getKolicina()-1);
                    naStanju = true;
                    break;
                }
            }
        }
        if (!naStanju) {
            System.out.println("Film " + f.getIme() + " nema na stanju.");
        }
    }

    public void dodajFilmUKorpu(Film f, int n) {
        boolean uKorpi;
        for (FilmNaStanju i : vk.getKatalog()) {
            if (f.equals(i.getFilm())) {
                uKorpi = false;
                for (FilmNaStanju fns : korpa) {
                    if (fns.getFilm().equals(f)) {
                        if (i.getKolicina() >= n + fns.getKolicina()) {
                            fns.setKolicina(n + fns.getKolicina());
                            i.setKolicina(0);
                            uKorpi = true;
                            break;
                        } else {
                            fns.setKolicina(i.getKolicina());
                            System.out.println("Nije moguce kupiti " + (n + fns.getKolicina() - i.getKolicina()) + " filmova " + f.getIme() + "." +
                                    "\nU korpu je dodato " + (n - fns.getKolicina()) + " kopja filma " + f.getIme() + ".");
                            i.setKolicina(0);
                            uKorpi = true;
                            break;
                        }
                    }
                }
                if (!uKorpi) {
                    if (i.getKolicina() >= n) {
                        korpa.add(new FilmNaStanju(f, n, i.getCena()));
                        i.setKolicina(0);
                        break;
                    } else {
                        korpa.add(new FilmNaStanju(f, i.getKolicina(), i.getCena()));
                        System.out.println("Nije moguce kupiti " + (n - i.getKolicina()) + " filmova " + f.getIme() + "." +
                                "\nU korpu je dodato " + i.getKolicina() + " kopja filma " + f.getIme() + ".");
                        i.setKolicina(0);
                        break;
                    }
                }
            }
        }
    }

    public void izbaciIzKorpe(Film f) {

    }

}
