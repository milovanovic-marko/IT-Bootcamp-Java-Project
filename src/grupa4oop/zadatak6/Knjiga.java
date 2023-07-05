package grupa4oop.zadatak6;

public class Knjiga {

    private Osoba autor, vlasnik;
    private String nazivKnjige;
    private int brojStrana, godinaIzdanja;

    public Knjiga(Osoba autor, Osoba vlasnik, String nazivKnjige, int brojStrana, int godinaIzdanja) {
        this.autor = autor;
        this.vlasnik = vlasnik;
        this.nazivKnjige = nazivKnjige;
        postaviBrojStrana(brojStrana);
        postaviGodinuIzdanja(godinaIzdanja);
    }

    public Knjiga(Osoba autor, String nazivKnjige, int brojStrana, int godinaIzdanja) {
        this.autor = autor;
        this.nazivKnjige = nazivKnjige;
        postaviBrojStrana(brojStrana);
        postaviGodinuIzdanja(godinaIzdanja);
    }

    public Osoba getAutor() {
        return autor;
    }

    public void setAutor(Osoba autor) {
        this.autor = autor;
    }

    public Osoba getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }

    public String getNazivKnjige() {
        return nazivKnjige;
    }

    public void setNazivKnjige(String nazivKnjige) {
        this.nazivKnjige = nazivKnjige;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public void setBrojStrana(int brojStrana) {
        postaviBrojStrana(brojStrana);
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        postaviGodinuIzdanja(godinaIzdanja);
    }

    private void postaviBrojStrana(int brojStrana) {
        if (brojStrana < 0) {
            System.out.println("Broj strana ne moze biti negativan broj!");
        } else {
            this.brojStrana = brojStrana;
        }
    }

    private void postaviGodinuIzdanja(int godinaIzdanja) {
        if (godinaIzdanja < 0) {
            System.out.println("Godina izdanja ne moze biti negativan broj!");
        } else {
            this.godinaIzdanja = godinaIzdanja;
        }
    }

    public String velicinaKnjige() {
        if (brojStrana > 0 && brojStrana <= 100) {
            return "mala knjiga";
        }
        if (brojStrana >= 101 && brojStrana <= 300) {
            return "srednje velika knjiga";
        }
        if (brojStrana >= 301 && brojStrana <= 600) {
            return "velika knjiga";
        }
        if (brojStrana >= 601) {
            return "bas velika knjiga";
        }
        return "";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv knjige je: ").append(nazivKnjige).append("\nVlasnik knjige je: ");
        if (vlasnik == null) {
            sb.append("knjiga nema vlasnika");
        } else {
            sb.append(vlasnik.getIme()).append(" ").append(vlasnik.getPrezime());
        }
        sb.append("\nBroj srana: ").append(brojStrana).append("\nGodina izdanja: ").append(godinaIzdanja).append("\n").append(velicinaKnjige());
        return sb.toString();
    }
}
