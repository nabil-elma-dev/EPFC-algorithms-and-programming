import seqint.SeqInt;
import seqint.SeqIntIterator;
/* ANALYSIS

current         2   2   2   1   1   9   4   4   4   4   5   5   8   8   8
previous        /   2   2   2   1   1   9   4   4   4   4   5   5   8   8

lgPlat          1   2   3   1   2   1   1   2   3   4   1   2   1   2   3
equals3         0   0   1   1   1   1   1   1   2   1   1   1   1   1   2
*/

public class ex_4 {
    public static SeqIntIterator it;
    public static void main() {
        System.out.println("This program prints the number of plateau whose length is >= 3");
        SeqInt p = new SeqInt(2,2,2,1,1,9,4,4,4,4,5,5,8,8,8);
        System.out.println("Sequence: " + p);
        System.out.println("Plateau with length >= 3: " + lgEqualOrHigherThan3(p));
    }

    public static int lgEqualOrHigherThan3(SeqInt p) {
        it = p.iterator();
        int lg3OrMore = 0;
        if (it.hasNext()) {
            int current = it.next();
            int lgPlat = 1;
            while (it.hasNext()) {
                int previous = current;
                current = it.next();
                if (current != previous) {
                    lgPlat = 1;
                } else {
                    ++ lgPlat;
                    if (lgPlat == 3) {
                        ++ lg3OrMore;
                    }
                }
            }
        }
        return lg3OrMore;
    }
}
