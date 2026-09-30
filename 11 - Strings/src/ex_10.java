public class ex_10 {
    public static void main() {
        String s1 = "Paper";
        String s2 = "Paper";
        String s3 = "Scissors";
        String s4 = "pApeR";
        System.out.println(sontEgaux(s1,s2)); // True
        System.out.println(sontEgaux(s1,s3)); // False
        System.out.println(sontEgaux(s1,s4)); // False
    }

    public static boolean sontEgaux (String s1, String s2) {
        int pos = 0;
        if (s1.length() == s2.length()) {
            while (pos < s1.length() && s1.charAt(pos) == s2.charAt(pos)) {
                ++pos;
            }
        }
        return pos == s1.length() && s1.length() == s2.length();
    }
}
