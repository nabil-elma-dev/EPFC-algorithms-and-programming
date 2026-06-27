import seqint.SeqInt;
import seqint.SeqIntIterator;

public class ex_1 {
    public static SeqIntIterator it;

    public static void main() {
        System.out.println("This program prints the number of plateau in a sequence");
        SeqInt p = new SeqInt(1,1,5,5,5,5,8,8);
        System.out.println("Numbers of plateau inside the sequence " + p + ": " + nbPlat(p));

    }

    public static int nbPlat(SeqInt p) {
        it = p.iterator();
        int nbPlat = 0;
        if (it.hasNext()) {
            int current = it.next();
            ++ nbPlat;
            while (it.hasNext()) {
                int previous = current;
                current = it.next();
                if (current != previous) {
                    ++ nbPlat;
                }
            }
        }
        return nbPlat;
    }
}
