import seqint.SeqInt;
import seqint.SeqIntIterator;

public class ex_14 {
    public static SeqIntIterator it;

    public static void main(String[] args) {
        System.out.println("This program prints the negative number with the biggest absolute value");
        SeqInt s1 = new SeqInt(7,-3,5,-8,4);
        SeqInt s2 = new SeqInt(7,3,5,8,4);
        SeqInt s0 = new SeqInt();
        printMessage(s1);
        printMessage(s2);
        printMessage(s0);
    }

    public static void printMessage(SeqInt s) {
        System.out.println(biggestNeg(s) == 0 ? "There is no negative number in the sequence " + s
                                                : "The negative number with the biggest absolute value in the sequence " + s + " is: " + biggestNeg(s));
    }

    public static boolean negativeNumber(int n) {
        return n < 0;
    }

    public static int biggestNeg(SeqInt s) {
        int res = 0;
        it = s.iterator();
        if (it.hasNext()) {
            int current = it.next();
            if (current < 0) {
                res = current;
            }

            while (it.hasNext()) {
                int prec = current;
                current = it.next();
                if (negativeNumber(current) && (current *= -1) > res) {
                    res = current;
                }
            }
        }
        return res;
    }
}
