package grupa4oop.zadatak20.baza;

public abstract class Oblik {
    public Oblik() {
    }
    public abstract String getIme();
    public abstract String getOsobine();

    @Override
    public String toString() {
        return getIme() + "\n" + getOsobine();
    }
}
