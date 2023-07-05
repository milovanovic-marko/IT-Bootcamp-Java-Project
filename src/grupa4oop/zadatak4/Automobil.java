package grupa4oop.zadatak4;

public class Automobil {

    private String marka, zemljaPorekla;
    private int godinapProizvodnje;
    private double kilometraza;

    public Automobil(String marka, String zemljaPorekla, int godinapProizvodnje, double kilometraza) {
        this.marka = marka;
        this.zemljaPorekla = zemljaPorekla;
        this.godinapProizvodnje = godinapProizvodnje;
        this.kilometraza = kilometraza;
    }

    public Automobil(String marka, String zemljaPorekla, String godinapProizvodnje, double kilometraza) {
        this.marka = marka;
        this.zemljaPorekla = zemljaPorekla;
        this.godinapProizvodnje = Integer.parseInt(godinapProizvodnje);
        this.kilometraza = kilometraza;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getZemljaPorekla() {
        return zemljaPorekla;
    }

    public void setZemljaPorekla(String zemljaPorekla) {
        this.zemljaPorekla = zemljaPorekla;
    }

    public int getGodinapProizvodnje() {
        return godinapProizvodnje;
    }

    public void setGodinapProizvodnje(int godinapProizvodnje) {
        this.godinapProizvodnje = godinapProizvodnje;
    }

    public double getKilometraza() {
        return kilometraza;
    }

    public void setKilometraza(double kilometraza) {
        this.kilometraza = kilometraza;
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "marka='" + marka + '\'' +
                ", zemljaPorekla='" + zemljaPorekla + '\'' +
                ", godinapProizvodnje=" + godinapProizvodnje +
                ", kilometraza=" + kilometraza +
                '}';
    }
}
