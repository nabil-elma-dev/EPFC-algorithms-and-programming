/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prm2_08_sequences;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Sequences_ex04 {

    public static int nbApparitions(int val, SeqInt s) {
        SeqIntIterator it = s.iterator();
        int result = 0;                     // Nombre initial d'appartions de val = zéro
        while (it.hasNext()) {
            if (it.next() == val) {         // Si l'élément suivant == val
                ++result;                   // On incrémente result
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SeqInt s1 = new SeqInt(5, 2, 1, 1, 1, 2, 2, 7, 7, 7, 7, 1, 2);
        System.out.println(s1);
        System.out.println("Nombre d'apparition de '1' dans la séquence : " + nbApparitions(1,s1));
        System.out.println("Nombre d'apparition de '9' dans la séquence : " + nbApparitions(9,s1));
        SeqInt s2 = new SeqInt();
        System.out.println(s2);
        System.out.println("Nombre d'apparition de '1' dans la séquence : " + nbApparitions(1,s2));
    }
}
