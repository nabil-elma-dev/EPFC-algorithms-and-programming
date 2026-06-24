import seqint.SeqInt;
import seqint.SeqIntIterator;

public class ex_12 {
    public static SeqIntIterator it;

    public static void main(String[] args) {
        System.out.println("This program determines the first time the maximum appeared in a sequence" + " (counting positions from 0)");
        SeqInt s = new SeqInt(9,2,8,9,5,9,1);
        System.out.println(posFirstMax(s));
    }

    public static int posFirstMax(SeqInt s) {
        it = s.iterator();
        int posFirst = -1;
        if (it.hasNext()) {
            int current = it.next();
            int max = current;
            int currentPos = 0;
            posFirst = currentPos;
            while (it.hasNext()) {
                int prec = currentPos;
                current = it.next();
                ++ currentPos;
                if (max < current) {
                    max = current;
                    posFirst = currentPos;
                }
            }
        }
        return posFirst;
    }
}
