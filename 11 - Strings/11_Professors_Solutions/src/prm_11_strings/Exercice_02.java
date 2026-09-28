package prm_11_strings;

public class Exercice_02 {

    public static boolean estMin(char c) {
        return c >= 'a' && c <= 'z';
    }

    // Renvoie le caractère c inchangé si c n'est pas une minuscule
    public static char toMaj(char c) {
        if (estMin(c)) {
            return (char) ((int)c + (int) 'A' - (int) 'a');
        }
        return c;
    }

    public static void main(String[] args) {
        char c = 'b';
        System.out.println("La majuscule (si c'est une minuscule) de " + c + " est " + toMaj(c));

        c = 'Z';
        System.out.println("La majuscule (si c'est une minuscule) de " + c + " est " + toMaj(c));
    }
}
