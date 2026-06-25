import seqint.SeqInt;
import seqint.SeqIntIterator;

public class ex_15 {
    public static SeqIntIterator it;
    public static void main(String[] args) {
        System.out.println("This program determines the min value and the max value of a sequence");
        SeqInt s = new SeqInt(2,5,7,8,1,5,9,4);
        System.out.println("Min and max value of " + s + ": " + minAndMax(s));
    }

    public static SeqInt minAndMax(SeqInt s) {
        it = s.iterator();
        if (!it.hasNext()) {
            throw new RuntimeException("Error: no min and max in an empty sequence");
        }
        int max = it.next();
        int min = max;
        while (it.hasNext()) {
            int current = it.next();
            if (current > max) {
                max = current;
            } else if (current < min) {
                min = current;
            }
        }
        return new SeqInt(min, max);
    }
}
