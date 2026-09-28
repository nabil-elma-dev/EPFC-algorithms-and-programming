package prm_11_strings;

public class Exercice_04 {

    public static boolean estMin(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static char toMaj(char c) {
        if (estMin(c)) {
            return (char) ((int)c + (int) 'A' - (int) 'a');
        }
        return c;
    }

    public static String copieEnMaj(String s) {
        String res = "";
        for (int k = 0; k < s.length(); ++k) {
            res += toMaj(s.charAt(k));
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "Hello!!";
        System.out.print("Copie de " + s + "en majuscule : ");
        String enMaj = copieEnMaj(s);
        System.out.println(enMaj);

        //ou System.out.println("Copie de " + s + "en majuscule : " + copieEnMaj(s));
    }
}
