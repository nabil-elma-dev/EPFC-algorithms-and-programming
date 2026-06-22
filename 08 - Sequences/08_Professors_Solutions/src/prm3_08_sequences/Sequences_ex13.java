/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prm2_08_sequences;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Sequences_ex13 {

    // Renvoie 0 si s est vide
    public static int nbMax(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int result = 0;                 // Initialisation : si la séquence est vide, on retourne zéro
        if (it.hasNext()) {
            int max = it.next();        // Premier élément, c'est le max actuel
            result = 1;                 // Nombre de max initialisé à 1 (car il y a un max) 
            while (it.hasNext()) {
                int x = it.next();      // Elément suivant
                if (x > max) {          // Si l'élément est plus grand au max actuel (nouveau max)
                    max = x;            // On met à jour max
                    result = 1;         // On a un seul max
                } else if (x == max) {  // Sinon si on retrouve le max actuel
                    ++result;           // On incrémente le nombre de max actuel
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SeqInt s1 = new SeqInt(5, 2, 1, 1, 1, 2, 2, 7, 7, 7, 7, 1, 2);
        System.out.println(s1);
        System.out.println("Nombre de d'apparition du maximum : " + nbMax(s1));
        SeqInt s2 = new SeqInt(1, 2, 7, 15, 122);
        System.out.println(s2);
        System.out.println("Nombre de d'apparition du maximum : " + nbMax(s2));
        SeqInt s3 = new SeqInt();
        System.out.println(s3);
        System.out.println("Nombre de d'apparition du maximum : " + nbMax(s3));
    }
}
