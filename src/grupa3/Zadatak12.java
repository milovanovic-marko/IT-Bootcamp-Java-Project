/*
* 12. Napisati funkciju koja vraca najduzi String iz ArrayListe Stringova.
* */
package grupa3;

public class Zadatak12 {
    
    static String najduziString(String[][] array) {
        int duzinaStringa = Integer.MIN_VALUE;
        String najduziSring = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j].length() > duzinaStringa) {
                    duzinaStringa = array[i][j].length();
                    najduziSring = array[i][j];
                }
            }
        }
        return najduziSring;
    }
    
    public static void main(String[] args) {
        String[][] niz = {{"Marko", "Jana", "Predrag"}, {"Nenad", "O", "Omg"}, {"Dugacak string", "Zdravo", "Pozdrav"}};
        System.out.println(najduziString(niz));
    }
}
