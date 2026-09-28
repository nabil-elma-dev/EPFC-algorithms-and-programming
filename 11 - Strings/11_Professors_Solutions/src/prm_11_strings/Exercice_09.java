package prm_11_strings;

public class Exercice_09 {
    // Ecrivez une fonction qui renvoie l'indice de la première apparition
    // d'un caractère dans un String.
    // Que renvoyez-vous si le caractère n'apparaît pas dans le String ?

    // Il convient de trouver une valeur spéciale qui ne peut pas être renvoyée
    // si le caractère apparaît.
    // Un choix possible est de renvoyer -1 (solution 1)
    // Un choix plus élégant et simple est de renvoyer la longueur du String.
//    // Version 1
//    // Renvoie -1 si c n'apparaît pas dans s
//    public static int pos(char c, String s) {
//        int k = 0;
//        while (k < s.length() && s.charAt(k) != c) {
//            ++k;
//        }
//        // On sait ici que (k == s.length() || s.charAt(k) == c)
//        if (k < s.length()) {
//            return k;
//        } else {
//            return -1;
//        }
//    }
//
//    public static void main(String[] args) {
//        String s = "bonjour";
//        System.out.println("La 1ere apparition de o dans " + s
//                + " est en position " + pos('o', s));
//
//        char c = 'x';
//        int p = pos(c, s);
//        if (p == -1) {
//            System.out.println("La lettre " + c + " n'apparait pas dans " + s);
//        } else {
//            System.out.println("La 1ere apparition de " + c + " dans " + s
//                    + " est en position " + pos('o', s));
//        }
//
//        c = 'n';
//        p = pos(c, s);
//        if (p == -1) {
//            System.out.println("La lettre " + c + "n'apparait pas dans " + s);
//        } else {
//            System.out.println("La 1ere apparition de " + c + " dans " + s
//                    + " est en position " + pos('o', s));
//        }
//    }
    // Renvoie la longueur de s si c n'y apparaît pas
    public static int pos(char c, String s) {
        int k = 0;
        while (k < s.length() && s.charAt(k) != c) {
            ++k;
        }
        return k;
    }

    public static void main(String[] args) {
        String s = "bonjour";
        System.out.println("La 1ere apparition de o dans " + s
                + " est en position " + pos('o', s));

        char c = 'x';
        int p = pos(c, s);
        if (p == s.length()) {
            System.out.println("La lettre " + c + " n'apparait pas dans " + s);
        } else {
            System.out.println("La 1ere apparition de " + c + " dans " + s
                    + " est en position " + pos(c, s));
        }

        c = 'n';
        p = pos(c, s);
        if (p == s.length()) {
            System.out.println("La lettre " + c + "n'apparait pas dans " + s);
        } else {
            System.out.println("La 1ere apparition de " + c + " dans " + s
                    + " est en position " + pos(c, s));
        }
    }

}
