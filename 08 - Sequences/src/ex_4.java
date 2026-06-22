import seqint.SeqInt;
import seqint.SeqIntIterator;

import java.util.Scanner;

public class ex_4 {
    public static SeqIntIterator it;
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This program determines how many times a number n appears in a given sequence");
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        SeqInt s = new SeqInt(1,2,5,8,4,3,8,9,7,8);
        System.out.println(nbTimesAppeared(s, n) == 0 ?
                n + " does not appear in the sequence " + s
                : n + " appears in the sequence " + s + " " + nbTimesAppeared(s, n) + " time(s)");
    }

    public static int nbTimesAppeared(SeqInt s, int n) {
        it = s.iterator();
        int cpt = 0;
        if (it.hasNext()) {
            while (it.hasNext()) {
                if (it.next() == n)
                    ++ cpt;
            }
        }
        return cpt;
    }
}
