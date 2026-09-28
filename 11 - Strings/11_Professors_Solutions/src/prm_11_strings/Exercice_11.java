package prm_11_strings;

public class Exercice_11 {

    public static boolean inclus(String ssch, String ch) {
        int issch = 0;
        for (int ich = 0; ich < ch.length() && issch < ssch.length(); ++ich) {
            if (ssch.charAt(issch) == ch.charAt(ich)) {
                ++issch;
            }
        }
        return issch == ssch.length();
    }

    public static void main(String[] args) {
        String s1 = "mai";
        String s2 = "machin";
        if (inclus(s1, s2)) {
            System.out.println("Toutes les lettres de " + s1 + " sont incluses (dans l'ordre) dans " + s2);
        } else {
            System.out.println("Toutes les lettres de " + s1 + " ne sont pas incluses (dans l'ordre) dans " + s2);
        }

        s1 = "mai";
        s2 = "miserable";
        if (inclus(s1, s2)) {
            System.out.println("Toutes les lettres de " + s1 + " sont incluses (dans l'ordre) dans " + s2);
        } else {
            System.out.println("Toutes les lettres de " + s1 + " ne sont pas incluses (dans l'ordre) dans " + s2);
        }
    }
}
