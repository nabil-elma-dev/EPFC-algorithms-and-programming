package prm2_08_sequences;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Sequences_ex10 {

    public static boolean contientPalier(SeqInt s) {
        SeqIntIterator it = s.iterator();
        boolean result = false;                 // Initialisation à false : pour le moment pas de palier
        if (it.hasNext()) {
            int x = it.next();                  // Premier élément
            while (it.hasNext() && !result) {
                int y = it.next();              // élément suivant
                result = y == x;                // result == true si x == y
                x = y;                          // On avance x
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SeqInt s1 = new SeqInt(5, 2, 1, 1, 1, 2, 2, 7, 7, 7, 7, 1, 2);
        System.out.println(s1);
        System.out.println("Séquence contient un palier : " + contientPalier(s1));
        SeqInt s2 = new SeqInt(1, 2, 7, 15, 122);
        System.out.println(s2);
        System.out.println("Séquence contient un palier : " + contientPalier(s2));
        SeqInt s3 = new SeqInt();
        System.out.println(s3);
        System.out.println("Séquence contient un palier : " + contientPalier(s3));
    }
}
