import seqint.SeqInt;
import seqint.SeqIntIterator;

import java.util.Scanner;

public class ex_9 {
    public static SeqIntIterator it;

    public static void main(String[] args) {
        System.out.println("This program determines whether a sequence is increasing");
        SeqInt s1 = new SeqInt(2, 5, 4, 3, 9, 11);
        SeqInt s2 = new SeqInt(2, 5, 7, 8, 9, 11); // increasing: current > prec; strictly superior!
        SeqInt s0 = new SeqInt();

        System.out.println("Sequence " + s1 + " is " + (increasingSequence(s1)  ? "increasing"
                                                                                : "not increasing")
        );

        System.out.println("Sequence " + s2 + " is " + (increasingSequence(s2)  ? "increasing"
                : "not increasing")
        );

        System.out.println("Sequence " + s0 + " is " + (increasingSequence(s0)  ? "increasing"
                : "not increasing")
        );
    }

    public static boolean increasingSequence(SeqInt s) {
        it = s.iterator();
        boolean increasing = true; // an empty sequence is treated as an increasing one
        if (it.hasNext()) {
            int current = it.next();
            while (it.hasNext() && increasing) {
                int prec = current;
                current = it.next();
                if (prec >= current) {
                    increasing = false;
                }
            }
        }
        return increasing;
    }
}
