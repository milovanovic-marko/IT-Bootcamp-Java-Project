/*
* 23.**
a) Napisati program koji za unete cele brojeve m i n iscrtava mxn tablu tacaka ('.') i omogucava korisniku da pomera igraca
   predstavljenog simbolom 'o' i inicijalno postavljenog na prvo polje table zadavanjem instrukcija: 'w', 'a', 's', 'd', 'x' kao:
   'w' -> pomeri igraca na gore, ukoliko je to moguce
   'a' -> pomeri igraca u levo, ukoliko je to moguce
   's' -> pomeri igraca na dole, ukoliko je to moguce
   'd' -> pomeri igraca u desno, ukoliko je to moguce
   'x' -> zavrsi program
   Nakon svake zadate instrukcije ponovo iscrtati tablu sa novim polozajem igraca.
	Npr:
   |o . .|
   |. . .|
   |. . .|
   'd'
   |. o .|
   |. . .|
   |. . .|
   'x'
b) Napisati program koji za unete cele brojeve m i n iscrtava toroidnu mxn tablu tacaka ('.') i omogucava korisniku da pomera igraca
   predstavljenog simbolom 'x' i inicijalno postavljenog na prvo polje table zadvanjem instrukcija:
   'w', 'a', 's', 'd', 'q', 'e', 'z', 'c', 'x' kao:
   'w' -> pomeri igraca na gore,
   'a' -> pomeri igraca u levo,
   's' -> pomeri igraca na dole,
   'd' -> pomeri igraca u desno,
   'q' -> pomeri igraca dijagonalno gore-levo,
   'e' -> pomeri igraca dijagonalno gore-desno,
   'z' -> pomeri igraca dijagonalno dole-levo,
   'c' -> pomeri igraca dijagonalno dole-desno,
   'x' -> zavrsi program
   Nakon svake zadate instrukcije ponovo iscrtati tablu sa novim polozajem igraca.
   Npr:
   |o . .|
   |. . .|
   |. . .|
   'q'
   |. . .|
   |. . .|
   |. . o|
   'd'
   |. . .|
   |. . .|
   |o . .|
   'x'
* */
package grupa2;

import java.util.Scanner;

public class Zadatak23 {

    static void tablaA(int m, int n, Scanner sc) {
        String[][] tabla = new String[m][n+2];
        emptyTable(tabla);
        String igrac = "o";
        int[] pozicijaIgraca = {0, 1};
        tabla[pozicijaIgraca[0]][pozicijaIgraca[1]] = igrac;
        print2DArray(tabla);
        char komanda = ' ';
        boolean izlaz = false;
        while (!izlaz) {
            System.out.print("Unesite \"w, a, s, d\" da pomerite igraca ili \"x\" za izlaz: ");
            komanda = Character.toLowerCase(sc.next().charAt(0));
            switch (komanda) {
                case 'x' -> {
                    izlaz = true;
                }
                case 'w' -> {
                    if (pozicijaIgraca[0] > 0) {
                        pozicijaIgraca[0]--;
                    } else {
                        System.out.println("Igrac se ne moze pomeriti gore!");
                    }
                }
                case 'a' -> {
                    if (pozicijaIgraca[1] > 1) {
                        pozicijaIgraca[1]--;
                    } else {
                        System.out.println("Igrac se ne moze pomeriti levo!");
                    }
                }
                case 's' -> {
                    if (pozicijaIgraca[0] < tabla.length - 1) {
                        pozicijaIgraca[0]++;
                    } else {
                        System.out.println("Igrac se ne moze pomeriti dole!");
                    }
                }
                case 'd' -> {
                    if (pozicijaIgraca[1] < tabla[0].length - 2) {
                        pozicijaIgraca[1]++;
                    } else {
                        System.out.println("Igrac se ne moze pomeriti desno!");
                    }
                }
                default -> {
                    System.out.println("Unesite ispravne podatke!");
                }
            }
            emptyTable(tabla);
            tabla[pozicijaIgraca[0]][pozicijaIgraca[1]] = igrac;
            print2DArray(tabla);
        }
    }

    // b)
    static void tablaB(int m, int n, Scanner sc) {
        String[][] tabla = new String[m][n+2];
        emptyTable(tabla);
        String igrac = "o";
        int[] pozicijaIgraca = {0, 1};
        tabla[pozicijaIgraca[0]][pozicijaIgraca[1]] = igrac;
        print2DArray(tabla);
        char komanda = ' ';
        boolean izlaz = false;
        while (!izlaz) {
            System.out.print("Unesite \"w, a, s, d, q, e, z, c\" da pomerite igraca ili \"x\" za izlaz: ");
            komanda = Character.toLowerCase(sc.next().charAt(0));
            switch (komanda) {
                case 'x' -> {
                    izlaz = true;
                }
                case 'w' -> {
                    if (pozicijaIgraca[0] > 0) {
                        pozicijaIgraca[0]--;
                    } else {
                        System.out.println("Igrac se ne moze pomeriti gore!");
                    }
                }
                case 'a' -> {
                    if (pozicijaIgraca[1] > 1) {
                        pozicijaIgraca[1]--;
                    } else {
                        System.out.println("Igrac se ne moze pomeriti levo!");
                    }
                }
                case 's' -> {
                    if (pozicijaIgraca[0] < tabla.length - 1) {
                        pozicijaIgraca[0]++;
                    } else {
                        System.out.println("Igrac se ne moze pomeriti dole!");
                    }
                }
                case 'd' -> {
                    if (pozicijaIgraca[1] < tabla[0].length - 2) {
                        pozicijaIgraca[1]++;
                    } else {
                        System.out.println("Igrac se ne moze pomeriti desno!");
                    }
                }
                case 'q' -> {
                    if (pozicijaIgraca[0] > 0 && pozicijaIgraca[1] > 1) {
                        pozicijaIgraca[0]--;
                        pozicijaIgraca[1]--;
                    } else {
                        System.out.println("Igrac se ne moze pomeriti dijagonalno gore levo!");
                    }
                }
                case 'e' -> {
                    if (pozicijaIgraca[0] > 0 && pozicijaIgraca[1] < tabla[0].length - 2) {
                        pozicijaIgraca[0]--;
                        pozicijaIgraca[1]++;
                    } else {
                        System.out.println("Igrac se ne moze pomeriti dijagonalno gore desno!");
                    }
                }
                case 'z' -> {
                    if (pozicijaIgraca[0] < tabla.length && pozicijaIgraca[1] > 1) {
                        pozicijaIgraca[0]++;
                        pozicijaIgraca[1]--;
                    } else {
                        System.out.println("Igrac se ne moze pomeriti dijagonalno dole levo!");
                    }
                }
                case 'c' -> {
                    if (pozicijaIgraca[0] < tabla.length && pozicijaIgraca[1] < tabla[0].length - 2) {
                        pozicijaIgraca[0]++;
                        pozicijaIgraca[1]++;
                    } else {
                        System.out.println("Igrac se ne moze pomeriti dijagonalno dole desno!");
                    }
                }
                default -> {
                    System.out.println("Unesite ispravne podatke!");
                }
            }
            emptyTable(tabla);
            tabla[pozicijaIgraca[0]][pozicijaIgraca[1]] = igrac;
            print2DArray(tabla);
        }
    }

    static void emptyTable(String[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                if (j == 0 || j == tabla[0].length-1) {
                    tabla[i][j] = "|";
                } else {
                    if (i % 2 != 0) {
                        if (j % 2 != 0) {
                            tabla[i][j] = " ";
                        } else {
                            tabla[i][j] = ".";
                        }
                    } else {
                        if (j % 2 == 0) {
                            tabla[i][j] = " ";
                        } else {
                            tabla[i][j] = ".";
                        }
                    }
                }
            }
        }
    }

    static void print2DArray(String[][] niz) {
        for (int i = 0; i < niz.length; i++) {
            for (int j = 0; j < niz[0].length; j++) {
                System.out.print(niz[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tablaA(5, 5, sc);
        tablaB(5, 5, sc);
    }
}
