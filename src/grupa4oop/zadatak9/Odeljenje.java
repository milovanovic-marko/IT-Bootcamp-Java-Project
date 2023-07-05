package grupa4oop.zadatak9;

import java.util.ArrayList;

public class Odeljenje {

    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = new ArrayList<>();
        this.dnevnik.addAll(dnevnik);
    }

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
        this.dnevnik = new ArrayList<>();
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik.addAll(dnevnik);
    }

    public void upisiUcenika(Ucenik u) {
        this.dnevnik.add(u);
    }

    public void upisiUcenika(Ucenik u, int rednibroj) {
        this.dnevnik.add(rednibroj - 1, u);
    }

    public void ispisiUcenika(Ucenik u) {
        this.dnevnik.remove(u);
    }

    public void ispisiUcenika(int i) {
        this.dnevnik.remove(i);
    }

    public void pogledajOcene(Ucenik u) {
        System.out.println(u.getOcene());
    }

    public void pogledajOcene(int i) {
        System.out.println(this.dnevnik.get(i).getOcene());
    }

    public double prosecnaOcena(Ucenik u) {
        return u.prosek();
    }

    public double prosecnaOcena(int i) {
        return this.dnevnik.get(i).prosek();
    }

    public double prosecnaOcenaOdeljenja() {
        if (this.dnevnik.isEmpty()) {
            return 0;
        } else {
            double sum = 0;
            for (Ucenik i : this.dnevnik) {
                sum += i.prosek();
            }
            return sum / this.dnevnik.size();
        }
    }

    public void opisnaOcena(Ucenik u) {
        if (u.prosek() >= 4.5) {
            System.out.println("Odlican");
        } else if (u.prosek() >= 3.5 && u.prosek() < 4.5) {
            System.out.println("Vrlo dobar");
        } else if (u.prosek() >= 2.5 && u.prosek() < 3.5) {
            System.out.println("Dobar");
        } else if (u.prosek() >= 1.5 && u.prosek() < 2.5) {
            System.out.println("Dovoljan");
        } else {
            System.out.println("Nedovoljan");
        }
    }

    public String izlistajDnevnik() {
        StringBuilder sb = new StringBuilder();
        for (Ucenik i : dnevnik) {
            sb.append(i.getIme()).append(" ").append(i.getPrezime()).append(" ima ocene:\n").append(i.getOcene()).append("\n");
        }
        return sb.toString();
    }

    public String velicinaOdeljenja() {
        if (dnevnik.size() > 25) {
            return "Veliko odeljenje";
        }
        if (dnevnik.size() > 15) {
            return "Srednje odeljenje";
        }
        return "Malo odeljenje";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(oznaka).append(" odeljenja ima djake :");
        for (Ucenik i : dnevnik ) {
            sb.append("\n").append(i.getIme()).append(" ").append(i.getPrezime());
        }
        return sb.toString();
    }
}
