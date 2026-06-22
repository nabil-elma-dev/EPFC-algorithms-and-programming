/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prm2_08_sequences;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Sequences_ex15 {

    // Lance une Exception si s est vide
    public static SeqInt maxmin(SeqInt s) {
        SeqIntIterator it = s.iterator();
        if (!it.hasNext()) {                    // Pas d'élément, pas de min, pas de max
            throw new RuntimeException("Erreur: Min et Max d'une séquence vide");
        }
        int max = it.next(), min = max;         // Initialisation : min et max == premier élément
        while (it.hasNext()) {
            int x = it.next();                  // Elément suivant
            if (x > max) {                      // Si x est plus grand que le max actuel
                max = x;                        // On met à jour max
            } else if (x < min) {               // Sinon si x est plus petit que min
                min = x;                        // On met à jour min
            }
        }
        return new SeqInt(min,max);             // On retourne une séquence contenant min et max
    }
    
    public static void main(String[] args) {
        SeqInt s1 = new SeqInt(5, 2, -5, 1, 1, 2, 2, 7, -2, 7, 7, 1, 2);
        System.out.println(s1);
        System.out.print("min et max : ");
        System.out.println(maxmin(s1));
        SeqInt s2 = new SeqInt(1, 2, 7, 15, 122);
        System.out.println(s2);
        System.out.print("min et max : ");
        System.out.println(maxmin(s2));
        SeqInt s3 = new SeqInt();
        System.out.println(s3);
        System.out.print("min et max : ");
        System.out.println(maxmin(s3));
        
    }

}
