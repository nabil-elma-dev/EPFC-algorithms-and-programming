import seqint.SeqInt;
import seqint.SeqIntIterator;

public class ex_16 {
    public static SeqIntIterator it;

    public static void main(String[] args) {
        System.out.println("This program prints the first and the second biggest number");
        SeqInt s1 = new SeqInt(1,5,4,2,9,6,2,3);
        SeqInt s2 = new SeqInt(9);
        SeqInt s0 = new SeqInt();
        printMessage(s1);
        System.out.println();
        printMessage(s2);
        System.out.println();
        printMessage(s0);
    }

    public static void printMessage(SeqInt s) {
        SeqInt sMaxFirstAndSecond = firstAndSecond(s);
        it = sMaxFirstAndSecond.iterator();
        int first;
        int second;

        if (!it.hasNext()) {
            System.out.println("The sequence " + s + " is empty...");
        } else {
            first = it.next();
            if (!it.hasNext()) {
                System.out.println("The sequence " + s + " has only one element: " + first);
            } else {
                second = it.next();
                System.out.println("Sequence: " + s);
                System.out.println("First max: " + first);
                System.out.println("Second max: " + second);
            }
        }
    }

    public static SeqInt firstAndSecond(SeqInt s) {
        it = s.iterator();
        SeqInt res = new SeqInt();

        if (it.hasNext()) {
            int current = it.next();
            int maxFirst = current;
            int maxSecond = current;
            while (it.hasNext()) {
                current = it.next();
                if (current > maxFirst) {
                    maxSecond = maxFirst;
                    maxFirst = current;
                } else if (current < maxFirst && current > maxSecond) {
                    maxSecond = current;
                }
            }
            if (maxFirst == maxSecond) {
                res = new SeqInt(maxFirst);
            } else {
                res = new SeqInt(maxFirst, maxSecond);
            }
        }

        return res;
    }
}
