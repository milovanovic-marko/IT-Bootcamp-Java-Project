/*
* 24.* Napisati funkciju koja vraca konvertovani zadati iznos zadate valute u neku drugu zadatu valutu,
* ako su moguce valute i njihovi kursevi zadati kao:
EUR = 117.26 RSD
USD = 107.79 RSD
JPY = 0.81 RSD
pod uslovom da su prodajni i kupovni kursevi isti.
Npr:
"EUR", "RSD", 10 -> 1172.6
"EUR", "JPY", 100 -> 14476.54
"USD", "USD", 0.26 -> 0.26
* */
package grupa2;

import java.util.Scanner;

public class Zadatak24 {

    static double konvertujValute(Scanner sc) {

        double eur2RSD = 117.26;
        double usd2RSD = 107.79;
        double jpy2RSD = 0.81;

        System.out.print("Iz koje valute zelite da kovertujete (rsd, eur, usd, jpy): ");
        String izValute = sc.next().trim().toLowerCase();

        System.out.print("Koliko novca zelite da konvertujete: ");
        double zaKonverziju = sc.nextDouble();

        System.out.print("U koju valutu zelite da kovertujete (rsd, eur, usd, jpy): ");
        String uValutu = sc.next().trim().toLowerCase();

        switch (izValute) {
            case "eur" -> {
                switch (uValutu) {
                    case "eur" -> {
                        return zaKonverziju;
                    }
                    case "usd" -> {
                        return zaKonverziju * (eur2RSD / usd2RSD);
                    }
                    case "jpy" -> {
                        return zaKonverziju * (eur2RSD / jpy2RSD);
                    }
                    case "rsd" -> {
                        return zaKonverziju * eur2RSD;
                    }
                    default -> {
                        System.out.println("Valuta nije podrzana!");
                    }
                }
            }
            case "usd" -> {
                switch (uValutu) {
                    case "usd" -> {
                        return zaKonverziju;
                    }
                    case "eur" -> {
                        return zaKonverziju * (usd2RSD / eur2RSD);
                    }
                    case "jpy" -> {
                        return zaKonverziju * (usd2RSD / jpy2RSD);
                    }
                    case "rsd" -> {
                        return zaKonverziju * usd2RSD;
                    }
                    default -> {
                        System.out.println("Valuta nije podrzana!");
                    }
                }
            }
            case "jpy" -> {
                switch (uValutu) {
                    case "jpy" -> {
                        return zaKonverziju;
                    }
                    case "eur" -> {
                        return zaKonverziju * (jpy2RSD / eur2RSD);
                    }
                    case "usd" -> {
                        return zaKonverziju * (jpy2RSD / usd2RSD);
                    }
                    case "rsd" -> {
                        return zaKonverziju * jpy2RSD;
                    }
                    default -> {
                        System.out.println("Valuta nije podrzana!");
                    }
                }
            }
            case "rsd" -> {
                switch (uValutu) {
                    case "rsd" -> {
                        return zaKonverziju;
                    }
                    case "eur" -> {
                        return zaKonverziju / eur2RSD;
                    }
                    case "usd" -> {
                        return zaKonverziju / usd2RSD;
                    }
                    case "jpy" -> {
                        return zaKonverziju / jpy2RSD;
                    }
                    default -> {
                        System.out.println("Valuta nije podrzana!");
                    }
                }
            }
            default -> {
                System.out.println("Valuta nije podrzana!");
            }
        }
        return zaKonverziju;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(konvertujValute(sc));
    }
}
