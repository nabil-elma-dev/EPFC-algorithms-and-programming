import seqint.SeqInt;
import seqint.SeqIntIterator;

public class ex_5 {
    public static SeqIntIterator it;

    public static void main(String[] args) {
        System.out.println("This program calculates the average of a given sequence");

        SeqInt s = new SeqInt(2,4,6,8);
        SeqInt s0 = new SeqInt();

        System.out.println(average(s) == 0  ? "The sequence " + s + " is empty. Therefore, no average"
                                            : "The average of the sequence " + s + " is " + average(s));

        System.out.println(average(s0) == 0 ? "The sequence " + s0 + " is empty. Therefore, no average"
                                            : "The average of the sequence " + s0 + " is " + average(s0));
    }

    public static double average(SeqInt s) {
        double sum = 0;
        double cpt = 0;
        it = s.iterator();
        if (it.hasNext()) {
            while (it.hasNext()) {
                sum += it.next();
                ++cpt;
            }
        }
        return cpt != 0 ?
                sum / cpt
                : 0;
    }
}
