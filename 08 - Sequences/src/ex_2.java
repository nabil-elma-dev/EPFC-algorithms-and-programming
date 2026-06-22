import seqint.SeqInt;
import seqint.SeqIntIterator;

public class ex_2 {
    public static SeqIntIterator it;

    public static void main(String[] args) {
        System.out.println("This program determines the length of a sequence");
        SeqInt s = new SeqInt(1,2,5,8);
        System.out.println("length of sequence " + s + ": " + lengthSeq(s));
    }

    public static int lengthSeq(SeqInt s) {
        int lgSeq = 0;
        it = s.iterator();
        if (it.hasNext()) {
            while (it.hasNext()) {
                ++ lgSeq;
                it.next();
            }
        }
        return lgSeq;
    }
}
