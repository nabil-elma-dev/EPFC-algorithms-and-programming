import seqint.SeqInt;
import seqint.SeqIntIterator;

import java.util.Scanner;

public class ex_8 {
    public static SeqIntIterator it;
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This program determines the first time a number n appeared in a sequence (if there are any)");
        SeqInt s = new SeqInt(2,8,2,9,5,2,1);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        System.out.println();
        printMessage(s, n, firstTimeAppeared(s, n));
    }

    private static void printMessage(SeqInt s, int n, int first) {
        System.out.println(first == -1 ? n + " does not appear in the sequence " + s
                : "The first time " + n + " appeared in the sequence " + s + " was on position number " + first + " (counting positions from 0)");
    }


    public static int firstTimeAppeared(SeqInt s, int n) {
        it = s.iterator();
        int currentPos = -1;
        int firstTime = -1;
        boolean found = false;
        if (it.hasNext()) {
            while (it.hasNext()) {
                ++ currentPos;
                int currentValue = it.next();
                if (n == currentValue && !found) {
                    found = true;
                    firstTime = currentPos;
                }
            }
        }
        return firstTime;
    }
}
