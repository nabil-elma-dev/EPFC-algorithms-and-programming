/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prm2_08_sequences;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Sequences_exemples {
    
    public static void main(String[] args) {
        SeqInt s = new SeqInt(5, 2, 1, 7, 7, 1, 2);
        SeqIntIterator it = s.iterator();
        while (it.hasNext()) {
            int x = it.next();
            // Faire quelque chose avec l'élément
        }
        // Suite éventuelle
    }
}
