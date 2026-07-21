import seqint.SeqInt;
import seqint.SeqIntIterator;

import java.util.Scanner;

/* ANALYSIS

current     2   2   4   4   5   7   7   3   1   1   1   7
previous    /   2   2   4   4   5   7   7   3   1   1   1

lgCurrent   1   2   1   2   1   1   2   1   1   2   3   1
lgMax       1   2   1   2   1   1   2   2   2   2   2   2
hMax        2   2   4   4   5   7   7   7   7   7   7   7

*/
public class ex_21 {
    public static SeqIntIterator it;

    public static void main() {
        System.out.println("This program prints the length of longest plateau of max height");
        SeqInt p = new SeqInt(2,2,4,4,5,7,7,3,1,1,1,7);
        System.out.println(p);
        System.out.println("the length of the longest plateau of max height is " + lgMaxOfMaxHeight(p));
    }

    public static int lgMaxOfMaxHeight(SeqInt p) {
        it = p.iterator();
        int lgMax = 0;
        if (it.hasNext()) {
            int current = it.next();
            int currentMax = current;
            int lgCurrent = 1;
            lgMax = 1;
            while (it.hasNext()) {
                int previous = current;
                current = it.next();
                if (current != previous) {
                    lgCurrent = 1;
                    if (current > currentMax) {
                        currentMax = current;
                        lgMax = 1;
                    }
                } else {
                    ++lgCurrent;
                    if (current == currentMax && lgCurrent == lgMax + 1) {
                        ++ lgMax;
                    }
                }
            }
        }
        return lgMax;
    }
}
