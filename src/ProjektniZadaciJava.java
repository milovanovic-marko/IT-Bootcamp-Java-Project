/*
* Marko Milovanović - PROJEKAT JAVA
* */
public class ProjektniZadaciJava {

    /*
    * 1) Napraviti funkciju koja kao argument prima niz Stringova, i String koji zelimo da lociramo
    * u tom nizu. Kao rezultat vratiti true/false ukoliko se nalazi/ne nalazi u nizu.
    * public static boolean find(String rec, String[] niz)
    * */

    public static boolean find(String rec, String[] niz) {
        boolean uNizu = false;
        for (String i : niz) {
            if (rec.trim().equalsIgnoreCase(i)) {
                uNizu = true;
                break;
            }
        }
        return uNizu;
    }

    /*
    * 2) Napraviti funkciju koja prima niz celih brojeva i kao rezultat vraca nov niz gde je svaki
    * element pomnozen sa Pi.
    * public static double[] pomnozenoSaPI(int[] brojevi)
    * */

    public static double[] pomnozenoSaPI(int[] brojevi) {
        double[] resenje = new double[brojevi.length];
        for (int i = 0; i < resenje.length; i++) {
            resenje[i] = brojevi[i] * Math.PI;
        }
        return resenje;
    }

    /*
    * 3) Napraviti funkciju koja ce za prosledjeni String obrnuti redosled karaktera.
    * public static String reverse(String rec)
    * */

    public static String reverse(String rec) {
        String resenje = "";
        for (int i = rec.length() - 1; i >= 0 ; i--) {
            resenje += rec.charAt(i);
        }
        return resenje;
    }

    /*
    * 4) Napraviti funkciju koja ce primati niz Stringova, String koji zelimo da zamenimo, i String
    * sa kojim zelimo da ga zamenimo u tom nizu.
    * public static void replaceWith(String[] niz, String oldString, String newString)
    * */

    public static void replaceWith(String[] niz, String oldString, String newString) {
        for (int i = 0; i < niz.length ; i++) {
            if (niz[i].equalsIgnoreCase(oldString)) {
                niz[i] = newString;
            }
        }
    }

    /*
    * 5) Napraviti funkciju koja prima String, String zapis ce biti u vidu nekog broja(npr "123",
    * "741",..), funkcija treba ovaj String da pretvori u ceo broj i da ispise svaki broj koji je deljiv
    * sa tim brojem.
    * public static void deljivSa(String broj)
    * */

    public static void deljivSa(String broj) {
        int num = Integer.parseInt(broj);
        System.out.print(broj + " je deljiv sa: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    /*
    * * 6) Napraviti funkciju koja prima dva niza celih brojeva(ne moraju da budu iste velicine),
    * porediti svaki broj na istoj poziciji i u zavisnosti od toga koji je veci dodati ga u rezultujuci
    * niz, ako jednom nizu ponestane elemenata za poredjenje sa drugim nizom, samo ispisati
    * preostale elemente.
    * public static int[] najveci(int[] niz1, int[] niz2)
    * */

    public static int[] najveci(int[] niz1, int[] niz2) {
        int[] resenje;
        if (niz1.length > niz2.length) {
            resenje = copyArray(niz1);
            for (int i = 0; i < niz2.length; i++) {
                if (niz1[i] > niz2[i]) {
                    resenje[i] = niz1[i];
                } else {
                    resenje[i] = niz2[i];
                }
            }
        } else {
            resenje = copyArray(niz2);
            for (int i = 0; i < niz1.length; i++) {
                if (niz1[i] > niz2[i]) {
                    resenje[i] = niz1[i];
                } else {
                    resenje[i] = niz2[i];
                }
            }
        }
        return resenje;
    }

    public static int[] copyArray(int[] niz) {
        int[] resenje = new int[niz.length];
        for (int i = 0; i < niz.length; i++) {
            resenje[i] = niz[i];
        }
        return resenje;
    }

    static void printArray(int[] niz) {
        System.out.print("\n[");
        for (int i = 0; i < niz.length; i++) {
            if (i != niz.length - 1) {
                System.out.print(niz[i] + ", ");
            } else {
                System.out.print(niz[i] + "]");
            }
        }
    }

    static void printArray(double[] niz) {
        System.out.print("\n[");
        for (int i = 0; i < niz.length; i++) {
            if (i != niz.length - 1) {
                System.out.print(niz[i] + ", ");
            } else {
                System.out.print(niz[i] + "]");
            }
        }
    }

    static void printArray(String[] niz) {
        System.out.print("\n[");
        for (int i = 0; i < niz.length; i++) {
            if (i != niz.length - 1) {
                System.out.print(niz[i] + ", ");
            } else {
                System.out.print(niz[i] + "]");
            }
        }
    }

    public static void main(String[] args) {
        // Test 1. zadataka
        System.out.println("1. zadatak");
        String[] nizTest = {"Marko", "Nemanja", "Jana", "Foo Bar", "Top 5"};
        String rec = "Bar";

        if (find(rec, nizTest)) {
            System.out.println("U nizu je");
        } else {
            System.out.println("Nije u nizu");
        }

        // Test 2. zadataka
        System.out.println();
        System.out.print("2. zadatak");
        int[] brojevi = {1, 2, 3, 4, 5, 60};

        printArray(pomnozenoSaPI(brojevi));

        // Test 3. zadataka
        System.out.println();
        System.out.println();
        System.out.println("3. zadatak");
        String obrni = "Obrni me";
        String obrnuto = reverse(obrni);
        System.out.println(obrnuto);

        // Test 4. zadataka
        System.out.println();
        System.out.print("4. zadatak");
        String staraRec = "Foo Bar";
        String novaRec = "Nova rec";
        replaceWith(nizTest, staraRec, novaRec);
        printArray(nizTest);

        // Test 5. zadataka
        System.out.println();
        System.out.println();
        System.out.println("5. zadatak");
        String broj = "105";
        deljivSa(broj);

        // Test 6. zadataka
        System.out.println();
        System.out.println();
        System.out.print("6. zadatak");
        int[] n1 = {1, 5, 9};
        int[] n2 = {7, 4, 8, 15};

        int [] novi = najveci(n1, n2);
        printArray(novi);
    }
}
