import seqint.SeqInt;
import seqint.SeqIntIterator;


public class ex_14 {
    /* ANALYSIS

    current         8   6   5   8   8   9   1   9   9
    previous        /   8   6   5   8   8   9   1   9
    currentMax      8   8   8   8   8   9   9   9   9
    currentLg       1   1   1   1   2   1   1   1   2
    lengthLastMax   1   1   1   1   2   1   1   1   2
     */
    public static SeqIntIterator it;
    public static void main() {
        System.out.println("This program prints the position where starts the last plateau of max height");
        SeqInt p = new SeqInt(8,6,5,8,8,9,1,9,9);
        System.out.println("Sequence: " + p);
        System.out.println("Length of last plateau of max height: " +
                (lgLastMaxHeight(p) == 0 ?
                        "not detected, empty sequence"
                        : lgLastMaxHeight(p))
        );
    }

    public static int lgLastMaxHeight(SeqInt p) {
        it = p.iterator();
        int lgLastMaxHeight = 0;
        if (it.hasNext()) {
            int current = it.next();
            int currentMax = current;
            int currentLg = 1;
            lgLastMaxHeight = currentLg;
            while (it.hasNext()) {
                int previous = current;
                current = it.next();
                if (current == previous) {
                    ++ currentLg;
                    if (current == currentMax) {
                        lgLastMaxHeight = currentLg;
                    }
                } else {
                    currentLg = 1;
                    if (current >= currentMax) {
                        lgLastMaxHeight = 1;
                        currentMax = current;
                    }
                }
            }
        }
        return lgLastMaxHeight;
    }
}
