package prm_11_strings;

public class Exercice_12 {

    public static int compare(String ch1, String ch2) {
        int k = 0, lg = Math.min(ch1.length(), ch2.length());
        while (k < lg && ch1.charAt(k) == ch2.charAt(k)) {
            ++k;
        }
        if (k == lg) {
            return ch1.length() - ch2.length();
        } else {
            return (int)ch1.charAt(k) - (int)ch2.charAt(k);
        }
    }

    public static void main(String[] args) {
        String s1 = "bonjour", s2 = "bonsoir", s3 = "bonjour";

        int cmp = compare(s1, s2);
        if (cmp == 0) {
            System.out.println("Les deux chaînes " + s1 + " et " + s2 + " sont identiques.");
        } else if (cmp < 0) {
            System.out.println(s1 + " est avant " + s2);
        } else {
            System.out.println(s1 + " est après " + s2);
        }

        cmp = compare(s2, s1);
        if (cmp == 0) {
            System.out.println("Les deux chaînes " + s2 + " et " + s1 + " sont identiques.");
        } else if (cmp < 0) {
            System.out.println(s2 + " est avant " + s1);
        } else {
            System.out.println(s2 + " est après " + s1);
        }

        cmp = compare(s1, s3);
        if (cmp == 0) {
            System.out.println("Les deux chaînes " + s1 + " et " + s3 + " sont identiques.");
        } else if (cmp < 0) {
            System.out.println(s1 + " est avant " + s3);
        } else {
            System.out.println(s1 + " est après " + s3);
        }
        
    }

}
