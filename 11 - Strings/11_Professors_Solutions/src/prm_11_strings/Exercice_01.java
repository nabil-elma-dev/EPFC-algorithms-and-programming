package prm_11_strings;

public class Exercice_01 {

    public static boolean estMin(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static void main(String[] args) {
        char c = 'b';
        if (estMin(c)) {
            System.out.println("Le caractère '" + c + "' est une minuscule");
        } else {
            System.out.println("Le caractère '" + c + "' n'est pas une minuscule");
        }

        c = 'Z';
        if (estMin(c)) {
            System.out.println("Le caractère '" + c + "' est une minuscule");
        } else {
            System.out.println("Le caractère '" + c + "' n'est pas une minuscule");
        }
    }

}
