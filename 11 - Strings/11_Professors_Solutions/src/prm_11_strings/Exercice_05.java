package prm_11_strings;

public class Exercice_05 {

    public static int nbApparitions(char c, String s) {
        int result = 0;
        for (int k = 0; k < s.length(); ++k) {
            if (s.charAt(k) == c) {
                ++result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "Onomatopée";
        System.out.println("Le caractère 'o' apparait " + nbApparitions('o', s)
                + " fois dans \"" + s + "\"");
    }
}
