import seqint.SeqInt;
import seqint.SeqIntIterator;

import java.util.Scanner;

public class ex_19 {
    /* ANALYSIS

    current             2   2   3   4   4   2   2   2   6   2
    previous            /   2   3   4   4   2   2   2   6   2

    target == 2 in this example
    currentLg           1   2   1   1   2   1   2   3   1   1
    maxLgTarget         1   2   2   2   2   2   2   3   3   3
    */
    public static SeqIntIterator it;
    public static Scanner scan = new Scanner(System.in);

    public static void main() {
        System.out.println("This program prints the length and the position of the last plateau of height H (chosen by user)");
        SeqInt p = new SeqInt(2,2,3,4,4,2,2,2,6,2);
        System.out.println("Sequence: " + p);
        System.out.print("Enter an height: ");
        int h = scan.nextInt();
        print(p, h);
    }

    public static void print (SeqInt p, int h) {
        it = p.iterator();
        if (!it.hasNext()) {
            System.out.println("Unable to perform calculus, empty sequence");
        }

        System.out.println(
                (longestMax(p,h) == 0 ?
                        h + " has not been found"
                        : "Longest plateau of height " + h + " has length of " + longestMax(p,h))
        );
    }

    public static int longestMax(SeqInt p, int h) {
        it = p.iterator();
        int lgMax = 0;
        if (it.hasNext()) {
            int current = it.next();
            int currentLg = 1;
            if (current == h) {
                lgMax = currentLg;
            }
            while (it.hasNext()) {
                int previous = current;
                current = it.next();
                if (current != previous) {
                    currentLg = 1;
                    if (current == h && lgMax < currentLg) {
                        lgMax = currentLg;
                    }
                } else {
                    ++ currentLg;
                    if (current == h && lgMax < currentLg) {
                        lgMax = currentLg;
                    }
                }
            }
        }
        return lgMax;
    }
}
