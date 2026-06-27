import seqint.SeqInt;
import seqint.SeqIntIterator;
/* ANALYSIS

current         2   2   2   1   1   9   4   4   4   4   5   5   8   8   8
previous        /   2   2   2   1   1   9   4   4   4   4   5   5   8   8

lgPlat          1   2   3   1   2   1   1   2   3   4   1   2   1   2   3
nbPlat3         0   0   1   1   1   1   1   1   2   1   1   1   1   1   2
*/
public class ex_6_8 {
    public static SeqIntIterator it;
    public static void main() {
        System.out.println("This program prints the number of plateau whose length is = 3 (chosen by the user)");
        SeqInt p = new SeqInt(2,2,2,1,1,9,4,4,4,4,5,5,8,8,8);
        System.out.println("Sequence: " + p);
        System.out.println("Number of plateau = 3: " + equalsThree(p));
    }

    public static int equalsThree(SeqInt p) {
        it = p.iterator();
        int equals3 = 0;
        int lgPlat = 0;
        if (it.hasNext()) {
            int current = it.next();
            ++ lgPlat;
            while (it.hasNext()) {
                int previous = current;
                current = it.next();
                if (current == previous) {
                    ++ lgPlat;
                }
                if (current != previous || !it.hasNext()) {
                    if (lgPlat == 3) {
                        ++equals3;
                    }
                    lgPlat = 1;
                }
            }
        }
        return equals3;
    }
}
