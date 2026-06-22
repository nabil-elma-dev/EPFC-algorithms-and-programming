/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prm2_08_sequences;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Sequences_affichage {

    public static void affiche(SeqInt s) {
        SeqIntIterator it = s.iterator();
        System.out.print("[");
        while (it.hasNext()) {
            System.out.print(it.next());
            if (it.hasNext()) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        SeqInt s1 = new SeqInt(5, 2, 1, 1, 1, 2, 2, 7, 7, 7, 7, 1, 2);
        affiche(s1);
        SeqInt s2 = new SeqInt();
        affiche(s2);
        SeqInt s3 = SeqInt.randomInstance();
    }
}
