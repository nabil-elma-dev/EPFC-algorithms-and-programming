import seqint.SeqInt;
import seqint.SeqIntIterator;

import java.util.Scanner;

public class ex_11 {
    public static SeqIntIterator it;

    public static void main(String[] args) {
        System.out.println("This program determines the last time the maximum appeared in a sequence" + " (counting positions from 0)");
        SeqInt s = new SeqInt(9,2,8,9,5,9,1);
        System.out.println(posLastMax(s));
    }

    public static int posLastMax(SeqInt s) {
        it = s.iterator();
        int posLast = -1;
        if (it.hasNext()) {
            int current = it.next();
            int max = current;
            int currentPos = 0;
            posLast = currentPos;
            while (it.hasNext()) {
                int prec = currentPos;
                current = it.next();
                ++ currentPos;
                if (max <= current) {
                    max = current;
                    posLast = currentPos;
                }
            }
        }
        return posLast;
    }
}
