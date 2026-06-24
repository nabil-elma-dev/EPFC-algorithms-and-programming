import seqint.SeqInt;
import seqint.SeqIntIterator;

public class ex_13 {
    public static SeqIntIterator it;

    public static void main(String[] args) {
        System.out.println("This program determines how many times the maximum appeared in a sequence");
        SeqInt s = new SeqInt(9,2,8,9,5,9,1);
        System.out.println("Number of apparitions of max: " + nbMax(s));
    }

    public static int nbMax(SeqInt s) {
        int nbMax = 0;
        it = s.iterator();
        if (it.hasNext()) {
            int current = it.next();
            int max = current;
            nbMax = 1;
            while (it.hasNext()) {
                current = it.next();
                if (current == max) {
                    ++nbMax;
                } else if (current > max) {
                    max = current;
                    nbMax = 1;
                }
            }
        }
        return nbMax;
    }
}
