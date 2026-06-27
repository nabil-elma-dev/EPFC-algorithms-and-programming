import seqint.SeqInt;
import seqint.SeqIntIterator;

import java.awt.*;
import java.util.Scanner;

/* ANALYSIS
current         2   2   2   4   4   1   9   9   9   9   8   8   8   8   8   1   1
pevious         /   2   2   2   4   4   1   9   9   9   9   8   8   8   8   8   1

lgPlat          1   2   3   1   2   1   1   2   3   4   1   2   3   4   5   1   2
lgInRange       0   1   1   1   2   2   2   3   3   2   2   3   3   2   2   2   3

*/
public class ex_9 {
    public static SeqIntIterator it;
    public static Scanner scan = new Scanner(System.in);

    public static void main() {
        System.out.println("This program calculates the number of plateau between two numbers");
        SeqInt p = new SeqInt(2,2,2,4,4,1,9,9,9,9,8,8,8,8,8,1,1);
        System.out.println("Sequence: " + p);
        System.out.print("Inf: ");
        int inf = scan.nextInt();
        while (inf <= 0) {
            System.out.println("Positive number required!");
            System.out.print("Inf: ");
            inf = scan.nextInt();
        }
        System.out.print("Sup: ");
        int sup = scan.nextInt();
        while (sup < inf) {
            System.out.println("Number >= " + inf + " Required");
            System.out.print("Sup: ");
            sup = scan.nextInt();
        }

        System.out.println("Number of plateau between " + inf + " and " + sup + "(included): " + nbInRange(p, inf, sup));
    }

    public static int nbInRange(SeqInt p, int inf, int sup) {
        it = p.iterator();
        int lgInRange = 0;
        if (it.hasNext()) {
            int current = it.next();
            int lgPlat = 1;
            if (inf == 1) {
                ++ lgInRange;
            }
            while (it.hasNext()) {
                int previous = current;
                current = it.next();
                if (current == previous) {
                    ++lgPlat;
                } else {
                    lgPlat = 1;
                }

                if (lgPlat == inf) {
                    ++ lgInRange;
                } else if (lgPlat == sup + 1) {
                    -- lgInRange;
                }
            }
        }
        return lgInRange;
    }
}
