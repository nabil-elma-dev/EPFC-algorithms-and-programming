public class ex_12 {
    public static void main() {
        String s1 = "Rock";
        String s2 = "Rock";
        String s3 = "Paper";
        String s4 = "Scissors";
        printMessage(s1, s2);
        printMessage(s1, s3);
        printMessage(s1, s4);
    }

    public static void printMessage(String s1, String s2) {
        if (compare(s1, s2) < 0) {
            System.out.println("\"" + s1 + "\" comes (alphabetically) before \"" + s2 + "\"");
        } else if (compare(s1, s2) > 0) {
            System.out.println("\"" + s1 + "\" comes (alphabetically) after \"" + s2 + "\"");
        } else {
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are equals");
        }
    }

    public static int compare (String s1, String s2) {
        int pos = 0;
        int shortestString = Math.min(s1.length(), s2.length());
        while (pos < shortestString && s1.charAt(pos) == s2.charAt(pos)) {
            ++pos;
        }
        return pos == shortestString ?
                    s1.length() - s2.length()
                    : s1.charAt(pos) - s2.charAt(pos);

    }
}
