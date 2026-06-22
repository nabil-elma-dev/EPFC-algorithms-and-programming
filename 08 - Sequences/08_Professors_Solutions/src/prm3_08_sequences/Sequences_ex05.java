/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prm2_08_sequences;

import java.util.Scanner;
import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Sequences_ex05 {

    // Lance une Error si s est vide
    public static double moyenne(SeqInt s) {
        SeqIntIterator it = s.iterator();
        if (!it.hasNext()) { // Pas d'élément, pas de moyenne
            throw new RuntimeException("Erreur: Moyenne d'une sequence vide");
        }
        int somme = 0, cpt = 0;
        while (it.hasNext()) {
            somme += it.next(); // On ajoute la valeur du nouvel élément
            ++cpt;              // On compte un élément de plus
        }
        return (double) somme / cpt; // Calcul de la moyenne (attention au transtypage)
    }

    public static void main(String[] args) {
        SeqInt s1 = new SeqInt(5, 2, 1, 1, 1, 2, 2, 7, 7, 7, 7, 1, 2);
        System.out.println(s1);
        System.out.println("Moyenne des éléments de la séquence : " + moyenne(s1));
        SeqInt s2 = new SeqInt();
        System.out.println(s2);
        System.out.println("Cette séquence va déclencher une exception car"
                + " il n'y a pas de moyenne");
        System.out.println("Enfoncez la touche <Enter>...");
        new Scanner(System.in).nextLine();
        System.out.println("Moyenne des éléments de la séquence : " + moyenne(s2));
    }

}
