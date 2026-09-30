public class ex_9 {
    public static void main() {
        String s = "Computer Science";
        char target = 'c';
        char outsideScope = 'Z';
        printMessage(s, target);
        printMessage(s, outsideScope);
    }

    public static void printMessage(String s, char c) {
        if (charAppeared(s, posChar(s, c))) {
            System.out.println("Positional place of char \""+ c + "\" on its first appearance in \"" + s + "\": " + posChar(s, c));
        } else {
            System.out.println("\"" + c + "\" char did not appear in \"" + s + "\"");
        }
    }

    public static boolean charAppeared (String s, int pos) {
        return pos < s.length();
    }

    public static int posChar(String s, char c) {
        int pos = 0;
        while (pos < s.length() && s.charAt(pos) != c) {
            ++pos;
        }
        return pos;
    }
}
