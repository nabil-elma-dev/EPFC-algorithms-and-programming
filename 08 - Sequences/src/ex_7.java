import seqint.SeqInt;
import seqint.SeqIntIterator;

import java.util.Scanner;

public class ex_7 {

    public static SeqIntIterator it;
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This program determines the last time a number n appeared in a sequence (if there are any)");
        SeqInt s = new SeqInt(2,8,2,9,5,2,1);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        System.out.println();
        printMessage(s, n, lastTimeAppeared(s, n));
    }

    private static void printMessage(SeqInt s, int n, int last) {
        System.out.println(last == -1 ? n + " does not appear in the sequence " + s
                                      : "The last time " + n + " appeared in the sequence " + s + " was on position number " + last + " (counting positions from 0)");
    }


    public static int lastTimeAppeared(SeqInt s, int n) {
        it = s.iterator();
        int currentPos = -1;
        int lastTime = -1;
        if (it.hasNext()) {
            while (it.hasNext()) {
                ++ currentPos;
                int currentValue = it.next();
                if (n == currentValue) {
                    lastTime = currentPos;
                }
            }
        }
        return lastTime;
    }
}
