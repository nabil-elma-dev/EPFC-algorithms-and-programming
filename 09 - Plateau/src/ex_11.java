import seqint.SeqInt;
import seqint.SeqIntIterator;
/* Analysis
current             7   7   6   8   3   3   5   6   8   8
previous            /   7   7   6   8   3   3   5   6   8


maxHeight           7   7   7   8   8   8   8   8   8   8
currentLength       1   2   1   1   1   2   1   1   1   2
maxAndLengthHigherThan1   0   1   1   0   0   0   0   0   0   1
*/

public class ex_11 {
    public static SeqIntIterator it;

    public static void main() {
        System.out.println("This program prints the number of plateau of max height and length > 1");
        SeqInt p = new SeqInt(7, 7, 6, 8, 3, 3, 5, 6, 8, 8);
        System.out.println("number of plateau of max height and length > 1: " + maxHeightAndLengthMoreThan1(p));
    }

    public static int maxHeightAndLengthMoreThan1(SeqInt p) {
        int maxHeightAndLengthHigherThan1 = 0;
        it = p.iterator();
        if (it.hasNext()) {
            int current = it.next();
            int maxHeight = current;
            int lgPlat = 1;
            while (it.hasNext()) {
                int previous = current;
                current = it.next();
                if (current == previous) {
                    ++lgPlat;
                    if (lgPlat == 2 && current == maxHeight) {
                        ++maxHeightAndLengthHigherThan1;
                    }
                } else {
                    if (current > maxHeight) {
                        maxHeight = current;
                        maxHeightAndLengthHigherThan1 = 0;
                    }
                    lgPlat = 1;
                }
            }
        }
        return maxHeightAndLengthHigherThan1;
    }
}

