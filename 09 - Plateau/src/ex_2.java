import seqint.SeqInt;
import seqint.SeqIntIterator;
/* ANALYSIS

current             2   3   3   1   1   1   8   6   6
previous            /   2   3   3   1   1   1   8   6
nbPlat              1   2   2   3   3   3   4   5   5
nbPlatBeforeMax     0   1   1   1   1   1   3   3   3

*/
public class ex_2 {
    public static SeqIntIterator it;
    public static void main() {
        SeqInt p = new SeqInt(2,3,3,1,1,1,8,6,6); // max height == 8
        System.out.println("Sequence: " + p);
        System.out.println("Numbers of plateau before the one with max height: " + beforeMaxValue(p));
    }

    public static int beforeMaxValue(SeqInt p) {
        it = p.iterator();
        int nbPlat = 0;
        int nbPlatBeforeMax = 0;
        if (it.hasNext()) {
            int current = it.next();
            int maxValue = current;
            ++ nbPlat;
            while (it.hasNext()) {
                int previous = current;
                current = it.next();
                if (current != previous) {
                    if (current > maxValue) {
                        maxValue = current;
                        nbPlatBeforeMax = nbPlat;
                    }
                    ++nbPlat;
                }

            }
        }
        return nbPlatBeforeMax;
    }
}
