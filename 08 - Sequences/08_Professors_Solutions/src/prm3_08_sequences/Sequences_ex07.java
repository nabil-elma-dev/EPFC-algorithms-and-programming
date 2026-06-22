/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prm2_08_sequences;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Sequences_ex07 {

    // Commence en 1.
    // Renvoie 0 si val n'apparait pas dans s
    public static int posDer(int val, SeqInt s) {
        SeqIntIterator it = s.iterator();
        int posCourante = 0, result = 0;    // initialisation : pas trouvé donc zéro
        while (it.hasNext()) {
            int x = it.next();
            ++posCourante;                  // Position de l'élément
            if (x == val) {                 // Nouvel élément égal à val
                result = posCourante;       // On retient sa position
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SeqInt s1 = new SeqInt(5, 2, 1, 1, 1, 2, 2, 7, 7, 7, 7, 1, 2);
        System.out.println(s1);
        System.out.println("Dernière position de '1' dans la séquence : " + posDer(1,s1));
        System.out.println("Dernière position de '9' dans la séquence : " + posDer(9,s1));
        SeqInt s2 = new SeqInt();
        System.out.println(s2);
        System.out.println("Dernière position de '1' dans la séquence : " + posDer(1,s2));
    }
}
