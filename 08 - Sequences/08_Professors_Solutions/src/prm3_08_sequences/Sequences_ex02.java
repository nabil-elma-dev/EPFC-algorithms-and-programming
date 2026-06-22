/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prm2_08_sequences;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Sequences_ex02 {

    public static int longueur(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int somme = 0;                 // initialement, la longueur de la séquence est zéro
        while (it.hasNext()) {
            somme += it.next();              // Pour chaque nouvel élément
                               // On incrémente la longueur
        }
        return somme;
    }

    public static void main(String[] args) {
        SeqInt s1 = new SeqInt(5, 2, 1, 1, 1, 2, 2, 7, 7, 7, 7, 1, 2);
        System.out.println(s1);
        System.out.println("Longueur de la séquence : " + longueur(s1));
        SeqInt s2 = new SeqInt();
        System.out.println(s2);
        System.out.println("Longueur de la séquence : " + longueur(s2));
    }
}
