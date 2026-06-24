import seqint.SeqInt;
import seqint.SeqIntIterator;

public class ex_6 {
    public static SeqIntIterator it;

    public static void main(String[] args) {
        System.out.println("The following program determines the max value of a sequence");
        SeqInt s = new SeqInt(2,8,9,5,4,7,3);
        SeqInt s0 = new SeqInt();

        System.out.println("Max value of " + s + (hasElements(s) ? ": " + maxVal(s)
                                                                 : ": none, empty sequence")
        );

        System.out.println("Max value of " + s0 + (hasElements(s0) ? ": " + maxVal(s0)
                                                                   : ": none, empty sequence")
        );
    }

    public static int maxVal(SeqInt s) {
        int max = 0;
        it = s.iterator();
        if (it.hasNext()) {
            max = it.next();
            while (it.hasNext()) {
                int currentElem = it.next();
                if (currentElem > max) {
                    max = currentElem;
                }
            }
        }
        return max;
    }

    public static boolean hasElements(SeqInt s) {
        it = s.iterator();
        return it.hasNext();
    }

}
