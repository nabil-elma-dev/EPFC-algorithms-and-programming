import seqint.SeqInt;
import seqint.SeqIntIterator;

import java.util.Scanner;

public class ex_10 {
    public static SeqIntIterator it;

    public static void main(String[] args) {
        System.out.println("This program determines whether a sequence contains a pair");
        SeqInt s1 = new SeqInt(2, 5, 5, 4, 3, 9, 11);
        SeqInt s2 = new SeqInt(2, 5, 7, 8, 9, 11);
        SeqInt s0 = new SeqInt();

        System.out.println("Sequence " + s1 + " Contains a pair: " + isPair(s1));
        System.out.println("Sequence " + s2 + " Contains a pair: " + isPair(s2));
        System.out.println("Sequence " + s0 + " Contains a pair: " + isPair(s0));
    }

    public static boolean isPair(SeqInt s) {
        it = s.iterator();
        boolean pairFound = false;
        if (it.hasNext()) {
            int current = it.next();
            while (it.hasNext() && !pairFound) {
                int prec = current;
                current = it.next();
                if (current == prec) {
                    pairFound = true;
                }
            }
        }
        return pairFound;
    }
}
