package prm_11_strings;

public class Exercice_03 {

    public static boolean estMin(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean estMin(String s) {
        for (int k = 0; k < s.length(); ++k) {
            if (!estMin(s.charAt(k))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "Hello";
        if (estMin(s)) {
            System.out.println(s + " est formé exclusivement de minuscules");
        } else {
            System.out.println(s + " n'est pas formé exclusivement de minuscules");
        }

        s = "hello";
        if (estMin(s)) {
            System.out.println(s + " est formé exclusivement de minuscules");
        } else {
            System.out.println(s + " n'est pas formé exclusivement de minuscules");
        }
        s = "hello!!";
        if (estMin(s)) {
            System.out.println(s + " est formé exclusivement de minuscules");
        } else {
            System.out.println(s + " n'est pas formé exclusivement de minuscules");
        }
    }
}
