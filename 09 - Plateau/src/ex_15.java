import seqint.SeqInt;
import seqint.SeqIntIterator;

public class ex_15 {
    /* ANALYSIS

    current         8   6   5   8   8   9   1   9   9
    previous        /   8   6   5   8   8   9   1   9

    currentMax      8   8   8   8   8   9   9   9   9

    currentLg       1   1   1   1   2   1   1   1   2
    lgLastMax       1   1   1   1   2   1   1   1   2

    currentPos      1   2   3   4   5   6   7   8   9
    lastAppearance  1   1   1   4   4   6   6   8   8
    */

    public static SeqIntIterator it;

    public static void main() {
        System.out.println("This program prints the lenght of the last plateau of max height and the position where it starts");
        SeqInt p = new SeqInt(8,6,5,8,8,9,1,9,9);
        System.out.println("Sequence: " + p);
        SeqInt res = lastMaxAppearanceAndLg(p);
        it = res.iterator();
        int lastAppearance = it.next();
        int lgLastMaxHeight = it.next();
        System.out.println(
                (lastAppearance == 0 ?
                        "Unable to perform calculus: empty sequence"
                        : "The last plateau starts at position number " + lastAppearance + " and its length is " + lgLastMaxHeight
                        )
        );
    }

    public static SeqInt lastMaxAppearanceAndLg(SeqInt p) {
        it = p.iterator();
        int lastAppearance = 0;
        int lgLastMax = 0;
        if (it.hasNext()) {
            int current = it.next();
            int currentMax = current;
            int currentPos = 1;
            int currentLg = 1;
            lastAppearance = currentPos;
            lgLastMax = currentLg;
            while (it.hasNext()) {
                int previous = current;
                current = it.next();
                ++ currentPos;
                if (current != previous) {
                    currentLg = 1;
                     if (current >= currentMax) {
                         currentMax = current;
                         lgLastMax = currentLg;
                         lastAppearance = currentPos;
                     }
                } else {
                    ++ currentLg;
                    if (current == currentMax) {
                        lgLastMax = currentLg;
                    }
                }
            }
        }
        SeqInt res = new SeqInt(lastAppearance, lgLastMax);
        return res;
    }
}
