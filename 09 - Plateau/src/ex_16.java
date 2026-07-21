import seqint.SeqInt;
import seqint.SeqIntIterator;

import java.util.Scanner;

public class ex_16 {
    /* ANALYSIS

    current     2   3   3   5   9   9   2   3   3   3   9
    previous    /   2   3   3   5   9   9   2   3   3   3

    currentPos  1   2   3   4   5   6   7   8   9   x  x-1
    posLastH    0   2   2   2   2   2   2   8   8   8   8       (h value for this example: 3)
    */

    public static SeqIntIterator it;
    public static Scanner scan = new Scanner(System.in);

    public static void main() {
        System.out.println("This program prints the position of the last plateau of height H (chosen by user)");
        SeqInt p = new SeqInt(2,3,3,5,9,9,2,3,3,3,9);
        System.out.println("Sequence: " + p);
        System.out.print("Enter an height: ");
        int h = scan.nextInt();
        print(p,h);
    }

    public static void print(SeqInt p, int h) {
        it = p.iterator();
        if (!it.hasNext()) {
            System.out.println("Unable to perform calculus, empty sequence");
        } else {
            System.out.println(
                    (posLastHeightH(p, h) == 0 ?
                            h + " has not been found"
                            : "Last plateau of height " + h + " is on position " + posLastHeightH(p, h))
            );
        }
    }

    public static int posLastHeightH(SeqInt p, int h) {
        it = p.iterator();
        int posLastH = 0;
        if (it.hasNext()) {
            int current = it.next();
            int currentPos = 1;
            if (current == h) {
                posLastH = currentPos;
            }
            while (it.hasNext()) {
                int previous = current;
                current = it.next();
                ++ currentPos;
                if (current != previous) {
                    if (current == h) {
                        posLastH = currentPos;
                    }
                }
            }
        }
        return posLastH;
    }
}
