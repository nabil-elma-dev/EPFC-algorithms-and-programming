/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prm2_08_sequences;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Sequences_ex08 {

    // Commence en 1.
    // Renvoie 0 si val n'apparait pas dans s
    public static int posPrem(int val, SeqInt s) {
        SeqIntIterator it = s.iterator();
        int posCourante = 0;
        boolean trouve = false;             // val pas trouvé pour le moment
        while (it.hasNext() && !trouve) {   // Si on a trouvé, on s'arrête immmédiatement
            trouve = it.next() == val;      // Si élément courant == val, trouvé devient vrai
            ++posCourante;                  // On retient la position courante de l'élément
        }
        if (trouve) {                       // Si trouvé
            return posCourante;             // On retourne la position de l'élément courant
        } else {
            return 0;                       // Sinon on retourne zéro
        }
    }

    public static void main(String[] args) {
        SeqInt s1 = new SeqInt(5, 2, 1, 1, 1, 2, 2, 7, 7, 7, 7, 1, 2);
        System.out.println(s1);
        System.out.println("Première position de '1' dans la séquence : " + posPrem(1,s1));
        System.out.println("Première position de '9' dans la séquence : " + posPrem(9,s1));
        SeqInt s2 = new SeqInt();
        System.out.println(s2);
        System.out.println("Première position de '1' dans la séquence : " + posPrem(1,s2));
    }
}
