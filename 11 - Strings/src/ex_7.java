public class ex_7 {
    public static void main() {
        String s = "girafarig";
        System.out.println("String: " + s);
        System.out.println(ditto(s));
    }

    public static boolean ditto(String s) {
        char[] tab = s.toCharArray();
        int cptToRight = 0;
        int cptToLeft = tab.length - 1;
        while (cptToRight < tab.length / 2 && tab[cptToLeft] == tab[cptToRight]) {
            ++cptToRight;
            -- cptToLeft;
        }
        return cptToRight == cptToLeft;
    }
}
