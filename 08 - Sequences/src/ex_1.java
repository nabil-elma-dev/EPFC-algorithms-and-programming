import seqint.SeqInt;
import seqint.SeqIntIterator;

public class ex_1 {

    public static SeqIntIterator it;
    public static void main(String[] args) {
        SeqInt s = new SeqInt(2,4,6,8);
        SeqInt s0 = new SeqInt();
        System.out.println(notEmpty(s) ?
                "Sequence " + s +" is not empty" :
                "Sequence " + s + " is empty");
        System.out.println(notEmpty(s0) ?
                "Sequence " + s +" is not empty" :
                "Sequence " + s0 + " is empty");
    }

    public static boolean notEmpty(SeqInt s) {
        it = s.iterator();
        return it.hasNext();
    }
}
