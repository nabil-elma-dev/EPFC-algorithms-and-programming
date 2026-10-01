public class ex_15 {
    public static void main() {
        String s1 = "mary";
        String s2 = "Primary";
        String s3 = "mandy";
        System.out.println(sousChaine(s1, s2));
        System.out.println(sousChaine(s1, s3));
    }

    public static boolean sousChaine(String subStr, String str) {
        boolean containsSubStr = true;
        int posSubStr = 0;
        int posStr = 0;
        if (subStr.length() > str.length()) {
            containsSubStr = false;
        } else {
            while (posStr < str.length() && posSubStr < subStr.length()) {
                if (str.charAt(posStr) == subStr.charAt(posSubStr)) {
                    ++posSubStr;
                } else {
                    posSubStr = 0;
                }
                ++posStr;
            }
        }
        return posSubStr == subStr.length();
    }
}
