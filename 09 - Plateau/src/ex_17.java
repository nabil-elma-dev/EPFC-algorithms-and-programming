import seqint.SeqInt;
import seqint.SeqIntIterator;

import java.util.Scanner;

public class ex_17 {
    /* ANALYSIS

    current     2   3   3   5   9   9   2   3   3   3   9
    previous    /   2   3   3   5   9   9   2   3   3   3

    currentLg   1   1   2   1   1   2   1   1   2   3   1
    lgLastH     0   1   2   2   2   2   2   1   2   3   3   (h == 3)
    */

    public static SeqIntIterator it;
    public static Scanner scan = new Scanner(System.in);

    public static void main() {
        System.out.println("This program prints the length of the last plateau of height H (chosen by user)");
        SeqInt p = new SeqInt(2,3,3,5,9,9,2,3,3,3,9);
        System.out.println("Sequence: " + p);
        System.out.print("Enter an height: ");
        int h = scan.nextInt();
        print(p, h);
    }

    public static void print (SeqInt p, int h) {
        it = p.iterator();
        if (!it.hasNext()) {
            System.out.println("Unable to perform calculus, empty sequence");
        } else {
            System.out.println(
                    (lgLastMaxH(p,h) == 0 ?
                    h + " has not been found"
                    : "Last plateau of height " + h + " has the following length: " + lgLastMaxH(p, h))
            );
        }
    }

    public static int lgLastMaxH(SeqInt p, int h) {
        it = p.iterator();
        int lgLastH = 0;
        if (it.hasNext()) {
            int current = it.next();
            int currentLg = 1;
            if (current == h) {
                lgLastH = currentLg;
            }
            while (it.hasNext()) {
                int previous = current;
                current = it.next();
                if (current != previous) {
                    currentLg = 1;
                    if (current == h) {
                        lgLastH = currentLg;
                    }
                } else {
                    ++ currentLg;
                    if (current == h) {
                        lgLastH = currentLg;
                    }
                }
            }
        }
        return lgLastH;
    }
}
