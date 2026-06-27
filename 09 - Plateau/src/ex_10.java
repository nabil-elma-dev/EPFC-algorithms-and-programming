import seqint.SeqInt;
import seqint.SeqIntIterator;

/* ANALYSIS

current     4   1   1   4   4   4   8   6   8   8
previous    /   4   1   1   4   4   4   8   6   8

hMax        4   4   4   4   4   4   8   8   8   8
nbHMax      1   1   1   2   2   2   1   1   2   2


*/

public class ex_10 {
    public static SeqIntIterator it;

    public static void main() {
        SeqInt p = new SeqInt(4, 1, 1, 4, 4, 4, 8, 6, 8, 8);
        System.out.println("Sequence: " + p);
        System.out.println("Number of plateau of max height: " + maxHeight(p));
    }

    public static int maxHeight(SeqInt p) {
        it = p.iterator();
        if (!it.hasNext()) {
            throw new RuntimeException("Error: empty sequence");
        }

        int current = it.next();
        int currentMax = current;
        int nbMax = 1;
        while (it.hasNext()) {
            int previous = current;
            current = it.next();
            if (current != previous) {
                if (current == currentMax) {
                    ++ nbMax;
                }
                if (current > currentMax) {
                    currentMax = current;
                    nbMax = 1;
                }
            }
        }
        return nbMax;
    }
}
