package grupa4oop.zadatak8;

public class Automobil {
    private String marka;
    private int godinaProizvodnje;
    private double kilometraza;

    public Automobil(String marka, int godinaProizvodnje, double kilometraza) {
        this.marka = marka;
        this.godinaProizvodnje = godinaProizvodnje;
        this.kilometraza = kilometraza;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public double getKilometraza() {
        return kilometraza;
    }

    public void setKilometraza(double kilometraza) {
        this.kilometraza = kilometraza;
    }

    @Override
    public String toString() {
        return marka + ", " + godinaProizvodnje + ", " + kilometraza;
    }
}
