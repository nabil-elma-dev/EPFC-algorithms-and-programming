package prm_11_strings;

public class Exercice_13 {

    public static boolean estMin(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static char toMaj(char c) {
        if (estMin(c)) {
            return (char) ((int)c + (int) 'A' - (int) 'a');
        }
        return c;
    }

    public static String copieMotsMaj(String s) {
        String res = "";
        boolean nouveauMot = true;
        for (int k = 0; k < s.length(); ++k) {
            char c = s.charAt(k);
            if (c != ' ' && nouveauMot) {
                c = toMaj(c);
                nouveauMot = false;
            } else if (c == ' ') {
                nouveauMot = true;
            }
            res += c;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "   la    vie est   belle  ";
        System.out.println("Original : " + s);
        System.out.println("Avec des majuscules : " + copieMotsMaj(s));
    }
}
