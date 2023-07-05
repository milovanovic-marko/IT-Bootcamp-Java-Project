package grupa4oop.zadatak8;

import java.util.ArrayList;

public class Putovanje {
    private Grad destinacija;
    private Osoba vodjaPuta;
    private Automobil vozilo;
    private double udaljenostUKm;
    private ArrayList<Osoba> prijavljeneOsobe;

    public Putovanje(Grad destinacija, Osoba vodjaPuta, Automobil vozilo, double udaljenostUKm) {
        this.destinacija = destinacija;
        this.vodjaPuta = vodjaPuta;
        this.vozilo = vozilo;
        postaviUdaljenost(udaljenostUKm);
        this.prijavljeneOsobe = new ArrayList<>();
    }

    public Putovanje(Grad destinacija, Automobil vozilo, double udaljenostUKm) {
        this.destinacija = destinacija;
        this.vozilo = vozilo;
        postaviUdaljenost(udaljenostUKm);
        this.prijavljeneOsobe = new ArrayList<>();
    }

    public Grad getDestinacija() {
        return destinacija;
    }

    public void setDestinacija(Grad destinacija) {
        this.destinacija = destinacija;
    }

    public Osoba getVodjaPuta() {
        return vodjaPuta;
    }

    public void setVodjaPuta(Osoba vodjaPuta) {
        this.vodjaPuta = vodjaPuta;
    }

    public Automobil getVozilo() {
        return vozilo;
    }

    public void setVozilo(Automobil vozilo) {
        this.vozilo = vozilo;
    }

    public double getUdaljenostUKm() {
        return udaljenostUKm;
    }

    public void setUdaljenostUKm(double udaljenostUKm) {
        postaviUdaljenost(udaljenostUKm);
    }

    public ArrayList<Osoba> getPrijavljeneOsobe() {
        return prijavljeneOsobe;
    }

    public void setPrijavljeneOsobe(ArrayList<Osoba> prijavljeneOsobe) {
        this.prijavljeneOsobe = prijavljeneOsobe;
    }

    private void postaviUdaljenost(double udaljenostUKm) {
        if (udaljenostUKm < 0) {
            System.out.println("Udaljenost ne sme biti negativna!");
        } else {
            this.udaljenostUKm = udaljenostUKm;
        }
    }

    public double vremePuta(double prosecnaBrzina) {
        return udaljenostUKm / prosecnaBrzina;
    }

    public void prijava(Osoba putnik) {
        prijavljeneOsobe.add(putnik);
    }

    public void odjava(Osoba putnik) {
        for (int i = 0; i < prijavljeneOsobe.size(); i++) {
            if (putnik == prijavljeneOsobe.get(i)) {
                prijavljeneOsobe.remove(i);
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Destinacija: ").append(destinacija.getIme()).append(", ").append(destinacija.getDrzava());
        sb.append("\nVodja puta je: ");

        if (vodjaPuta == null) {
            sb.append("putovanje nema vodju puta");
        } else {
            sb.append(vodjaPuta.getIme()).append(" ").append(vodjaPuta.getPrezime());
        }

        sb.append("\nPutuje se automobilom: ").append(vozilo);
        sb.append("\nUdaljenost do destinacije u kilometrima je: ").append(udaljenostUKm);
        sb.append("\nPrijavljene osobe: ");

        for (Osoba i : prijavljeneOsobe) {
            sb.append("\n").append(i);
        }

        return sb.toString();
    }
}
