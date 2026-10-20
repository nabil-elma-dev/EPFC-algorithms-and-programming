import seqint.SeqInt;
import seqint.SeqIntIterator;

import java.util.Scanner;

/* ANALYSIS

current                         2   2   2   1   9   4   5   5   8
previous                        /   2   2   2   1   9   4   5   5

lgPlat                          1   2   3   1   1   1   1   2   1
nbPlatN (example: n == 2)       0   1   0   0   0   0   0   1   1
                                       (!)
*/
public class ex_08 {
    public  static Scanner s = new Scanner(System.in);
    public static SeqIntIterator it;
    
    public static void main() {
        System.out.println("This program prints the number of plateau whose length is equals a number chosen by the user");
        SeqInt p = new SeqInt(2,2,2,1,9,4,5,5,8);
        System.out.print("Insert a number: ");
        int n = s.nextInt();
        System.out.println("Sequence: " + p);
        System.out.println("Number of plateau = " + n + ": " + equalsLgt(p, n));
    }

    public static int equalsLgt(SeqInt p, int lgt) {
        it = p.iterator();
        int nbTargets = 0;
        if (it.hasNext()) {
            int current = it.next();
            int currentLgt = 1;
            if (lgt == 1)
                ++ nbTargets;
            while (it.hasNext()) {
                int previous = current;
                current = it.next();
                if (current == previous)
                    ++currentLgt;
                else
                    currentLgt = 1;

                if (currentLgt == lgt)
                    ++nbTargets;
                else if (currentLgt == lgt + 1)
                    --nbTargets;
            }
        }
        return nbTargets;
    }
}
