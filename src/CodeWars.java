public class CodeWars {

    public static String disemvowel(String str) {
        return str.replaceAll("(a, A, e, E, i, I, o, O, u, U)", "");
    }

    public static void main(String[] args) {
        String str = "Zameni sve samoglasnike";
        System.out.println(disemvowel(str));
    }
}
