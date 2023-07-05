/*
* 20.** Napisati funkciju koja kreira niz od brojeva koji korisnik unosi sa konzole sve dok ne unese 0.
Npr: 1 2 3 3 4 5 0 -> [1, 2, 3, 4, 4, 5]
* */
package grupa2;

import java.util.Scanner;

public class Zadatak20 {

    static int[] kreirajNiz(Scanner sc) {
        int[] resenje = new int[1];
        int temp;
        int brojac = 0;
        while (true) {
            System.out.print("Unesite broj u niz ili \"0\" za izlaz: ");
            temp = sc.nextInt();

            if (temp == 0) {
                break;
            } else {
                if (brojac == 0) {
                    resenje[0] = temp;
                } else {
                    resenje = concateArray(resenje, temp);
                }
            }
            brojac++;
        }
        return resenje;
    }

    static int[] concateArray(int[] niz1, int broj) {
        int[] concArray = new int[niz1.length + 1];
        for (int i = 0; i < niz1.length; i++) {
            concArray[i] = niz1[i];
        }
        concArray[niz1.length] = broj;
        return concArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] resenje = kreirajNiz(sc);

        for (int i = 0; i < resenje.length; i++) {
            System.out.print(resenje[i] + " ");
        }
    }
}
