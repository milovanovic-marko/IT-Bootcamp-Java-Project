/*
* 10. Napisati funkciju koja vraca sve neparne brojeve iz ArrayListe.
* */
package grupa3;

public class Zadatak10 {

    static void oddNumInArray(int[][] array) {
        System.out.print("\nNeparni brojevi u listi su: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] % 2 != 0) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }


    public static void main(String[] args) {
        int[][] niz1 = {{1, 2, 3, 70}, {4, 5, 6, 23}, {70, -3, 9, 78}, {10, 11, -2, 4}, {10, 11, -2, 4}};
        oddNumInArray(niz1);
    }
}
