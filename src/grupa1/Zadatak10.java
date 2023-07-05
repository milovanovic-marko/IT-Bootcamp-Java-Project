/*
* 10. Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.
* */
package grupa1;

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mesec;
        int dan;
        String znak = "";

        System.out.print("Unesite mesec: ");
        mesec = sc.nextLine().trim().toLowerCase(); // normalizacija unosa za dalju obradu

        System.out.print("Unesite dan: ");
        dan = sc.nextInt();

        switch (mesec) {
            case "januar" -> {
                if (dan < 21) {
                    znak += "Jarac";
                    System.out.println("Vas horoskopski znak je: " + znak);
                } else {
                    znak += "Vodolija";
                    System.out.println("Vas horoskopski znak je: " + znak);
                }
            }
            case "februar" -> {
                if (dan < 20) {
                    znak += "Vodolija";
                    System.out.println("Vas horoskopski znak je: " + znak);
                } else {
                    znak += "Riba";
                    System.out.println("Vas horoskopski znak je: " + znak);
                }
            }
            case "mart" -> {
                if (dan < 21) {
                    znak += "Riba";
                    System.out.println("Vas horoskopski znak je: " + znak);
                } else {
                    znak += "Ovan";
                    System.out.println("Vas horoskopski znak je: " + znak);
                }
            }
            case "april" -> {
                if (dan < 21) {
                    znak += "Ovan";
                    System.out.println("Vas horoskopski znak je: " + znak);
                } else {
                    znak += "Bik";
                    System.out.println("Vas horoskopski znak je: " + znak);
                }
            }
            case "maj" -> {
                if (dan < 22) {
                    znak += "Bik";
                    System.out.println("Vas horoskopski znak je: " + znak);
                } else {
                    znak += "Blizanac";
                    System.out.println("Vas horoskopski znak je: " + znak);
                }
            }
            case "jun" -> {
                if (dan < 22) {
                    znak += "Blizanac";
                    System.out.println("Vas horoskopski znak je: " + znak);
                } else {
                    znak += "Rak";
                    System.out.println("Vas horoskopski znak je: " + znak);
                }
            }
            case "jul" -> {
                if (dan < 23) {
                    znak += "Rak";
                    System.out.println("Vas horoskopski znak je: " + znak);
                } else {
                    znak += "Lav";
                    System.out.println("Vas horoskopski znak je: " + znak);
                }
            }
            case "avgust" -> {
                if (dan < 23) {
                    znak += "Lav";
                    System.out.println("Vas horoskopski znak je: " + znak);
                } else {
                    znak += "Devica";
                    System.out.println("Vas horoskopski znak je: " + znak);
                }
            }
            case "septembar" -> {
                if (dan < 23) {
                    znak += "Devica";
                    System.out.println("Vas horoskopski znak je: " + znak);
                } else {
                    znak += "Vaga";
                    System.out.println("Vas horoskopski znak je: " + znak);
                }
            }
            case "oktobar" -> {
                if (dan < 24) {
                    znak += "Vaga";
                    System.out.println("Vas horoskopski znak je: " + znak);
                } else {
                    znak += "Skorpija";
                    System.out.println("Vas horoskopski znak je: " + znak);
                }
            }
            case "novembar" -> {
                if (dan < 23) {
                    znak += "Skorpija";
                    System.out.println("Vas horoskopski znak je: " + znak);
                } else {
                    znak += "Srelac";
                    System.out.println("Vas horoskopski znak je: " + znak);
                }
            }
            case "decembar" -> {
                if (dan < 22) {
                    znak += "Strelac";
                    System.out.println("Vas horoskopski znak je: " + znak);
                } else {
                    znak += "Jarac";
                    System.out.println("Vas horoskopski znak je: " + znak);
                }
            }
        }
    }
}
