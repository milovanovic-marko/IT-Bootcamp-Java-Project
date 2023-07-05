package grupa4oop.zadatak7;

public class Sportista {
    private String imePrezime, sport, klub;
    private int brojNaDresu;

    public Sportista(String imePrezime, String sport, String klub, int brojNaDresu) {
        this.imePrezime = imePrezime;
        this.sport = sport;
        this.klub = klub;
        this.brojNaDresu = brojNaDresu;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public String getSport() {
        return sport;
    }

    public String getKlub() {
        return klub;
    }

    public int getBrojNaDresu() {
        return brojNaDresu;
    }

    public void setKlub(String klub) {
        this.klub = klub;
    }

    public void setBrojNaDresu(int brojNaDresu) {
        this.brojNaDresu = brojNaDresu;
    }
}
