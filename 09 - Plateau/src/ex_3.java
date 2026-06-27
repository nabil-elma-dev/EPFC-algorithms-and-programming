import seqint.SeqInt;
import seqint.SeqIntIterator;
/* ANALYSIS

current             2   2   3   8   7   7   8   3   4   4
previous            /   2   2   3   8   7   7   8   3   4
nbPlatAfterMax      0   0   0   0   1   1   0   1   2   2

*/

public class ex_3 {
    public static SeqIntIterator it;

    public static void main() {
        System.out.println("This program prints the number of plateau after the last appearance of max");
        SeqInt p = new SeqInt(2,2,3,8,7,7,8,3,4,4);
        System.out.println("Sequence: " + p);
        System.out.println("Number of plateau after the last appearence of max: " + afterMax(p));
    }

    public static int afterMax(SeqInt p) {
        it = p.iterator();
        int nbPlatAfterMax = 0;
        if (!it.hasNext()) {
            throw new RuntimeException("Error: empty sequence");
        }

        int current = it.next();
        int max = current;

        while (it.hasNext()) {
            int previous = current;
            current = it.next();
            if (current != previous) {
                if (current < max) {
                    ++nbPlatAfterMax;
                } else {
                    max = current;
                    nbPlatAfterMax = 0;
                }
            }
        }

        return nbPlatAfterMax;
    }
}
