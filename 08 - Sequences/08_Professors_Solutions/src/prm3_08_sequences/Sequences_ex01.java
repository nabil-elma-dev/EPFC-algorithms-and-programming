/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prm3_08_sequences;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Sequences_ex01 {

    public static boolean estVide(SeqInt s) {
        SeqIntIterator it = s.iterator();
        return !it.hasNext();   // si il y a au moins un suivant, la séquence n'est pas vide
    }

    public static void main(String[] args) {
        SeqInt s1 = new SeqInt(5, 2, 1, 1, 1, 2, 2, 7, 7, 7, 7, 1, 2);
        System.out.println(s1);
        System.out.println("Séquence vide : " + estVide(s1));
        SeqInt s2 = new SeqInt();
        System.out.println(s2);
        System.out.println("Séquence vide : " + estVide(s2));
    }
}
