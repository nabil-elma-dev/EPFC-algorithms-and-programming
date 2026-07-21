import seqint.SeqInt;
import seqint.SeqIntIterator;

import java.util.Scanner;

public class ex_18 {
    /* ANALYSIS

    current             2   2   3   4   4   2   2   2   6   2
    previous            /   2   3   4   4   2   2   2   6   2

    target == 2 in this example
    currentPos          1   2   3   4   5   6   7   8   9   x
    posTarget           1   1   1   1   1   6   6   6   6   x
    lengthLastOfTarget  1   2   2   2   2   1   2   3   3   1
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
        SeqInt res = lgLastMaxHAndPos(p,h);
        it = res.iterator();
        if (!it.hasNext()) {
            System.out.println("Unable to perform calculus, empty sequence");
        }
        int lgLast = it.next();
        int posLast = it.next();

        System.out.println(
                (lgLast == 0 ?
                        h + " has not been found"
                        : "Last plateau of height " + h + " is on pos " + posLast + " and has length of " + lgLast)
        );
    }

    public static SeqInt lgLastMaxHAndPos(SeqInt p, int h) {
        it = p.iterator();
        int lgLastH = 0;
        int posLastH = 0;
        if (it.hasNext()) {
            int current = it.next();
            int currentLg = 1;
            int currentPos = 1;
            if (current == h) {
                lgLastH = currentLg;
                posLastH = currentPos;
            }
            while (it.hasNext()) {
                int previous = current;
                current = it.next();
                ++ currentPos;
                if (current != previous) {
                    currentLg = 1;
                    if (current == h) {
                        lgLastH = currentLg;
                        posLastH = currentPos;
                    }
                } else {
                    ++ currentLg;
                    if (current == h) {
                        lgLastH = currentLg;
                    }
                }
            }
        }
        return new SeqInt(lgLastH, posLastH);
    }
}
