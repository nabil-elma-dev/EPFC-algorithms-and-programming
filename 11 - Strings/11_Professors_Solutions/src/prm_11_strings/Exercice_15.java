package prm_11_strings;

public class Exercice_15 {

    public static boolean sousChaine(String ssch, String ch) {
        boolean result = false;
        if (ssch.length() <= ch.length()) {
            for (int ich = 0; !result && ich <= ch.length() - ssch.length(); ++ich) {
                int issch = 0;
                while (issch < ssch.length() && ssch.charAt(issch) == ch.charAt(ich + issch)) {
                    ++issch;
                }
                result = issch == ssch.length(); // Si au bout -> ssch trouvÈe
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "mai";
        String s2 = "barmaids";
        if (sousChaine(s1, s2)) {
            System.out.println(s1 + " est une sous-chaine de " + s2);
        } else {
            System.out.println(s1 + " n'est pas une sous-chaine de " + s2);
        }

        s1 = "mai";
        s2 = "machin";
        if (sousChaine(s1, s2)) {
            System.out.println(s1 + " est une sous-chaine de " + s2);
        } else {
            System.out.println(s1 + " n'est pas une sous-chaine de " + s2);
        }
    }

}
