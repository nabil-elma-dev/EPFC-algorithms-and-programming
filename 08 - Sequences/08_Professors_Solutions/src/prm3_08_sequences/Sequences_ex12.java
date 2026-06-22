/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prm2_08_sequences;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Sequences_ex12 {

    // Commence en 1.
// Renvoie 0 si s est vide
    public static int posPremMax(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int result = 0;             // Initialisation : si la séquence est vide, on retourne zéro
        if (it.hasNext()) {
            int max = it.next();    // Premier élément, c'est le max actuel
            int posCourante = 1;    // Position courante initialisée à 1
            result = 1;             // Position du dernier max initialisé à 1 (car c'est le dernier max)
            while (it.hasNext()) {
                int x = it.next();  // Elément suivant
                ++posCourante;      // On incrémente la position
                if (x > max) {      // Si l'élément est plus grand au max actuel (nouveau max)
                    max = x;        // On met à jour max
                    result = posCourante; // On met à jour result
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SeqInt s1 = new SeqInt(5, 2, 1, 1, 1, 2, 2, 7, 7, 7, 7, 1, 2);
        System.out.println(s1);
        System.out.println("Position de le première apparition du maximum : " + posPremMax(s1));
        SeqInt s2 = new SeqInt(1, 2, 7, 15, 122);
        System.out.println(s2);
        System.out.println("Position de le première apparition du maximum : " + posPremMax(s2));
        SeqInt s3 = new SeqInt();
        System.out.println(s3);
        System.out.println("Position de le première apparition du maximum : " + posPremMax(s3));
    }
}
