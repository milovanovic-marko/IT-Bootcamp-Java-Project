/*
* 17. Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".
* */
package grupa2;
public class Zadatak17 {

    static boolean postojiIme(String[] niz) {
        boolean postoji = false;
        for (String i : niz) {
            if ("Petar".equalsIgnoreCase(i) || "Marija".equalsIgnoreCase(i)) {
                postoji = true;
            }
        }
        return postoji;
    }

    public static void main(String[] args) {
        String[] imena = {"Rodrigo", "Marko", "Jana", "Petar", "Marija"};
        if (postojiIme(imena)) {
            System.out.println("Postoji");
        } else {
            System.out.println("Ne postoji");
        }
    }
}
