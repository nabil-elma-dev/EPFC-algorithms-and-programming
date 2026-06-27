import seqint.SeqInt;
import seqint.SeqIntIterator;
/* ANALYSIS

current         2   2   2   1   9   4   5   5   8
previous        /   2   2   2   1   9   4   5   5

lgPlat          1   2   3   1   1   1   1   2   1
nbPlat1         1   0   0   1   2   3   4   3   4
*/

public class ex_7 {

    public static SeqIntIterator it;
    public static void main() {
        System.out.println("This program prints the number of plateau whose length is = 1 (chosen by the user)");
        SeqInt p = new SeqInt(2,2,2,1,9,4,5,5,8);
        System.out.println("Sequence: " + p);
        System.out.println("Number of plateau = 1: " + equalsOne(p));
    }

    public static int equalsOne(SeqInt p) {
        it = p.iterator();
        int equals1 = 0;
        int lgPlat = 0;
        if (it.hasNext()) {
            int current = it.next();
            ++ lgPlat;
            while (it.hasNext()) {
                int previous = current;
                current = it.next();
                if (current != previous) {
                    if (lgPlat == 1) {
                        ++ equals1;
                    }
                    lgPlat = 1;
                } else {
                    ++lgPlat;
                }
            }

            if (lgPlat == 1) { // double check on the last value
                ++equals1;
            }
        }
        return equals1;
    }
}
