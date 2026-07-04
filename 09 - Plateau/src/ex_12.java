import seqint.SeqInt;
import seqint.SeqIntIterator;

import java.util.Scanner;

public class ex_12 {
    /* ANALYSIS

    current     8   8   3   3   9   9   5   9   9   2   9   9   9   8
    previous        8   9   3   3   9   9   5   9   9   2   9   9   9
    currentMax  8   8   8   9   9   9   9   9   9   9   9   9   9   9
    currentLg   1   2   1   2   1   2   1   1   2   1   1   2   3   1
    target      0   1   1   1   0   1   1   1   2   2   2   3   2   2
     */

    public static SeqIntIterator it;
    public static Scanner scan = new Scanner(System.in);

    public static void main() {
        System.out.println("This program prints the number of plateau of max height and length = n (chosen by user)");
        SeqInt p = new SeqInt(9,3,3,9,9,5,9,9,2,9,9,9,8);
        System.out.println("Sequence: " + p);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        System.out.println("Number of plateau of max height and length = " + n + ": " + maxHeightAndChosenLg(p,n));
    }

    public static int maxHeightAndChosenLg(SeqInt p, int chosenLg){
        int target = 0;
        it = p.iterator();
        if (it.hasNext()) {
            int current = it.next();
            int currentMax = current;
            int currentLg = 1;
            if (currentLg == chosenLg) {
                ++ target;
            }
            while (it.hasNext()) {
                int previous = current;
                current = it.next();
                if (current != previous) {
                    if (current > currentMax) {
                        currentMax = current;
                    }
                    currentLg = 1;

                } else {
                    ++ currentLg;
                }

                if (current == currentMax) {
                    if (currentLg == chosenLg)
                        ++target;
                    else if (currentLg == chosenLg + 1) {
                        --target;
                    }
                }
            }
        }
        return target;
    }
}
