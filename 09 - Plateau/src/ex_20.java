import seqint.SeqInt;
import seqint.SeqIntIterator;

import java.util.Scanner;

public class ex_20 {
    /* ANALYSIS

    current         2   2   3   4   4   2   2   2   6   2
    previous        /   2   3   4   4   2   2   2   6   2

    target == 2 in this example
    currentPos      1   2   3   4   5   6   7   8   9   x
    currentLg       1   2   1   1   2   1   2   3   1   1
    posTargetLgMax  1   1   1   1   1   1   6   6   6   6
    posPlat         1   1   3   4   4   6   6   6   9   x
    maxLgTarget     1   2   2   2   2   2   2   3   3   3
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
        SeqInt res = maxLgPos(p,h);
        it = res.iterator();
        if (!it.hasNext()) {
            System.out.println("Unable to perform calculus, empty sequence");
        }
        int lgMax = it.next();
        int pos = it.next();

        System.out.println(
                (lgMax == 0 ?
                        h + " has not been found"
                        : "Longest plateau of height " + h + " is on pos " + pos + " and has length of " + lgMax)
        );
    }

    public static SeqInt maxLgPos(SeqInt p, int h) {
        it = p.iterator();
        int hLgMax = 0;
        int posLastMaxH = 0;
        if (it.hasNext()) {
            int current = it.next();
            int currentLg = 1;
            int currentPos = 1;
            int posCurrentPlat = currentPos;
            if (current == h) {
                hLgMax = currentLg;
                posLastMaxH = posCurrentPlat;
            }
            while (it.hasNext()) {
                int previous = current;
                current = it.next();
                ++ currentPos;
                if (current != previous) {
                    posCurrentPlat = currentPos;
                    currentLg = 1;
                    if (current == h && hLgMax < currentLg) {
                        hLgMax = currentLg;
                        posLastMaxH = currentPos;
                    }
                } else {
                    ++ currentLg;
                    if (current == h && currentLg == hLgMax + 1) {
                        hLgMax = currentLg;
                        posLastMaxH = posCurrentPlat;
                    }
                }
            }
        }
        return new SeqInt(hLgMax, posLastMaxH);
    }
}
