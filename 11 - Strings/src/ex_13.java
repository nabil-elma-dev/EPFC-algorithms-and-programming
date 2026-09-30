public class ex_13 {
    public static void main() {
        String s = "the internet is becoming the town square for the global village of tomorrow";
        System.out.println("Text with lowercases: " + s);
        System.out.println("Text with a capital letter for each first letter: " + copyWithFirstCapital(s));
    }

    public static String copyWithFirstCapital(String s) {
        String copy = "";
        for (int i = 0; i < s.length(); ++i) {
            if (i == 0 || s.charAt(i - 1) == ' ') {
                copy += ex_2.lowerToUpper(s.charAt(i));
            } else {
                copy += s.charAt(i);
            }
        }
        return copy;
    }
}