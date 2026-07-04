import seqint.SeqInt;
import seqint.SeqIntIterator;

public class ex_13 {
    /* ANALYSIS

    current         8   6   5   8   8   9   1   9   9
    previous        /   8   6   5   8   8   9   1   9
    currentMax      8   8   8   8   8   9   9   9   9
    currentPos      1   2   3   4   5   6   7   8   9
    lastAppearance  1   1   1   4   4   6   6   8   8
     */
    public static SeqIntIterator it;

    public static void main() {
        System.out.println("This program prints the position where starts the last plateau of max height");
        SeqInt p = new SeqInt(8,6,5,8,8,9,1,9,9);
        System.out.println("Sequence: " + p);
        System.out.println("Last apparition of plateau of max height: " +
                (lastMaxHeight(p) == 0 ?
                        "not detected, empty sequence"
                        : lastMaxHeight(p)
        ));
    }

    public static int lastMaxHeight(SeqInt p) {
        it = p.iterator();
        int lastAppearance = 0;
        if (it.hasNext()) {
            int current = it.next();
            int currentMax = current;
            int currentPos = 1;
            lastAppearance = currentPos;
            while (it.hasNext()) {
                int previous = current;
                current = it.next();
                ++ currentPos;
                if (current != previous) {
                    if (current >= currentMax) {
                        lastAppearance = currentPos;
                        if (current > currentMax) {
                            currentMax = current;
                        }
                    }
                }
            }
        }
        return lastAppearance;
    }


}
