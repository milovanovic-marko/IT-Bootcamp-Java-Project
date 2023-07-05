package grupa4oop.zadatak9;

import java.util.ArrayList;

public class Ucenik {

    private String ime, prezime;
    private ArrayList<Integer> ocene;

    public Ucenik(String ime, String prezime, ArrayList<Integer> ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = new ArrayList<>();
        this.ocene.addAll(ocene);
    }

    public Ucenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = new ArrayList<>();
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

    public ArrayList<Integer> getOcene() {
        return ocene;
    }

    public void setOcene(ArrayList<Integer> ocene) {
        this.ocene.addAll(ocene);
    }

    private boolean validnaOcena(int ocena) {
        if (ocena == 1 || ocena == 2 || ocena == 3 || ocena == 4 || ocena == 5) {
            return true;
        }
        return false;
    }

    public double prosek() {
        int sum = 0;
        for (int i : ocene) {
            if (i == 1) {
                return 1;
            }
            sum += i;
        }
        return (double) sum / ocene.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" i ").append(prezime).append(" ima ocene: \n").append(ocene);
        return sb.toString();
    }
}
