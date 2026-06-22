/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prm2_08_sequences;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Sequences_ex06 {

    // Lance une Exception si s est vide
    public static int max(SeqInt s) {
        SeqIntIterator it = s.iterator();
        if (!it.hasNext()) { // Pas d'élément, pas de max
            throw new RuntimeException("Erreur: Maximum d'une sequence vide");
        }
        int result = it.next(); // Le premier élément est provisoirement le max
        while (it.hasNext()) {
            int x = it.next();
            if (x > result) {   // Le nouvel élément est plus grand que le max ?
                result = x;     // Il devient alors le nouveau max
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SeqInt s1 = new SeqInt(5, 2, 1, 1, 1, 2, 2, 7, 7, 7, 7, 1, 2);
        System.out.println(s1);
        System.out.println("Max des éléments de la séquence : " + max(s1));
        SeqInt s2 = new SeqInt();
        System.out.println(s2);
        System.out.println("Max des éléments de la séquence : " + max(s2));
    }
}
