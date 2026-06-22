/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prm2_08_sequences;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Sequences_ex14 {

    public static int maxNeg(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int result = 0;                            // Initialisation : si aucun négatif, on retourne zéro
        boolean trouveNegatif = false;
        while (it.hasNext() && !trouveNegatif) {   // Boucle pour trouver un premier négatif (s'il y en a)
            int x = it.next();
            trouveNegatif = x < 0;
            if (trouveNegatif) {                   // Si on a trouvé un négatif
                result = x;                        // C'est le maximum actuel
            }
        }
        while (it.hasNext()) {                     // Boucle sur les éléments restants 
            int x = it.next();
            if (x < 0 && x > result) {             // Si le nouvel élément est négatif et plus grand que result
                result = x;                        // On met à jour result   
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SeqInt s1 = new SeqInt(5, 2, -5, 1, 1, 2, 2, 7, -2, 7, 7, 1, 2);
        System.out.println(s1);
        System.out.println("Plus grand des négatifs : " + maxNeg(s1));
        SeqInt s2 = new SeqInt(1, 2, 7, 15, 122);
        System.out.println(s2);
        System.out.println("Plus grand des négatifs : " + maxNeg(s2));
        SeqInt s3 = new SeqInt();
        System.out.println(s3);
        System.out.println("Plus grand des négatifs : " + maxNeg(s3));
    }
}
