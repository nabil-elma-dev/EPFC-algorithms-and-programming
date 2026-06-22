/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prm2_08_sequences;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Sequences_ex09 {

    // Renvoie true si s est strictement croissante
    // Si s est vide ou singleton, renvoie true
    public static boolean croissante(SeqInt s) {
        SeqIntIterator it = s.iterator();
        boolean result = true;              // Initialisé à true car si la séquence est vide, on retourne true
        if (it.hasNext()) {
            int e = it.next();              // Si un seul élément, doit retourner true
			while (it.hasNext() && result) {
				int prec = e;                  
				e = it.next();
				result = prec < e;
			}
        }
        return result;
    }

    public static void main(String[] args) {
        SeqInt s1 = new SeqInt(5, 2, 1, 1, 1, 2, 2, 7, 7, 7, 7, 1, 2);
        System.out.println(s1);
        System.out.println("Séquence croissante : " + croissante(s1));
        SeqInt s2 = new SeqInt(1, 2, 7, 15, 122);
        System.out.println(s2);
        System.out.println("Séquence croissante : " + croissante(s2));
        SeqInt s3 = new SeqInt();
        System.out.println(s3);
        System.out.println("Séquence croissante : " + croissante(s3));
    }
}
