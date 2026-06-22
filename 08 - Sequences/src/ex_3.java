import seqint.SeqInt;
import seqint.SeqIntIterator;

public class ex_3 {
    public static SeqIntIterator it;

    public static void main(String[] args) {
        System.out.println("This program calculates the sum of each number inside a given sequence");
        SeqInt s = new SeqInt(1,2,5,8);
        System.out.println(sumSeq(s) == 0 ?
                "empty sequence, 0"
                : "Sum: " + sumSeq(s));
    }

    public static int sumSeq(SeqInt s) {
        int tot = 0;
        it = s.iterator();
        if (it.hasNext()) {
            while (it.hasNext()) {
                tot += it.next();
            }
        }
        return tot;
    }
}
