package grupa4oop.zadatak6;

public class Testiranje {

    public static void main(String[] args) {
        Osoba vla = new Osoba("Imeee", "Prezimeee");
        Knjiga kn = new Knjiga(vla,"NazivKnjige", 501, 1999);
        System.out.println(kn);
    }
}
