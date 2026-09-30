public class ex_11 {
    public static void main() {
        String s1 = "mai";
        String s2 = "machin";
        String s3 = "misérable";
        System.out.println(inclus(s1, s2));
        System.out.println(inclus(s1, s3));
    }

    public static boolean inclus(String ssch, String ch) {
        int posCh = 0;
        int posSsch = 0;
        int nbCharMatched = 0;
        if (ssch.length() > ch.length()) {
            return false;
        } else {
            while (posCh < ch.length() && nbCharMatched < ssch.length()) {
                if (ssch.charAt(posSsch) == ch.charAt(posCh)) {
                    ++ nbCharMatched;
                    ++posSsch;
                }
                ++posCh;
            }
        }
        return nbCharMatched == ssch.length();
    }
}
