/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prm2_08_sequences;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Sequences_ex03 {

    public static int somme(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int result = 0;                 // Somme initiale à zéro (neutre de l'addition)
        while (it.hasNext()) {
            result += it.next();        // On ajoute à result la valeur du nouvel élément
        }
        return result;
    }

    public static void main(String[] args) {
        SeqInt s1 = new SeqInt(5, 2, 1, 1, 1, 2, 2, 7, 7, 7, 7, 1, 2);
        System.out.println(s1);
        System.out.println("Somme des éléments de la séquence : " + somme(s1));
        SeqInt s2 = new SeqInt();
        System.out.println(s2);
        System.out.println("Somme des éléments de la séquence : " + somme(s2));
    }
}
