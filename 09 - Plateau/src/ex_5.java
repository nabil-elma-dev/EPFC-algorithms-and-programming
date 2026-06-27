import seqint.SeqInt;
import seqint.SeqIntIterator;

import java.util.Scanner;

public class ex_5 {
    public static SeqIntIterator it;
    public static Scanner scan = new Scanner(System.in);

    public static void main() {
        System.out.println("This program prints the number of plateau whose length is >= n (chosen by the user)");
        SeqInt p = new SeqInt(2,2,2,1,1,9,4,4,4,4,5,5,8,8,8);
        System.out.println("Sequence: " + p);
        System.out.print("Insert a number: ");
        int n = scan.nextInt();
        System.out.println("Number of plateau >= " + n + ": " + nOrMore(p,n));
    }

    public static int nOrMore(SeqInt p, int n) {
        it = p.iterator();
        int nOrMore = 0;
        if (it.hasNext()) {
            int current = it.next();
            int lgPlat = 1;
            while (it.hasNext()) {
                int previous = current;
                current = it.next();
                if (current != previous) {
                    lgPlat = 1;
                } else {
                    ++ lgPlat;
                    if (lgPlat == n) {
                        ++ nOrMore;
                    }
                }
            }
        }
        return nOrMore;
    }
}
