import eu.epfc.prm3.Array;

public class ex_16 {

    public static final int ASCII_MAJ_START = 65;

    public static void main() {
        String s = "La vie est Belle";
        Array<Character> alphabet = new Array<>('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
        Array<Integer> frequency = lettersFrequency(s);
        System.out.println(s);
        int pos = 0;
        for (Character c : alphabet) {
            if (frequency.get(pos) > 0) {
                System.out.print(alphabet.get(pos) + ": " + frequency.get(pos) +
                        (pos != maxCharValue(s) - ASCII_MAJ_START ?
                                ", "
                                : ".")
                );
            }
            ++pos;
        }
    }

    public static int maxCharValue(String s) {
        int pos = 0;
        int maxValue = 0;
        for (char c : s.toCharArray()) {
            if (pos == 0) {
                maxValue = (int) ex_2.lowerToUpper(s.charAt(pos));
            } else {
                if ((int) ex_2.lowerToUpper(s.charAt(pos)) > maxValue) {
                    maxValue = (int) ex_2.lowerToUpper(s.charAt(pos));
                }
            }
            ++ pos;
        }
        return maxValue;
    }

    public static Array<Integer> lettersFrequency(String s) {
        Array<Integer> res = new Array<>();
        res.extend(26, 0);
        for (int i = 0; i < s.length(); ++i) {
            if ((s.charAt(i) >= 65 && s.charAt(i) <= 90)
                    || (s.charAt(i) >= 97 && s.charAt(i) <= 122))
            {
                char currentChar = ex_2.lowerToUpper(s.charAt(i));
                res.set((int)(currentChar) - 65, res.get((int)(currentChar) - 65) + 1);
            }
        }
        return res;
    }
}
