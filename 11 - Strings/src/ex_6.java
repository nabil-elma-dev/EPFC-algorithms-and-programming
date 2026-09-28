public class ex_6 {
    public static void main() {
        String s = "hello";
        System.out.println("String: " + s);
        System.out.println("Reversed: " + reversedString(s));
    }

    public static String reversedString(String s) {
        String reversedS = "";
        char[] tab = s.toCharArray();
        for (int i = tab.length - 1; i >= 0; --i) {
            reversedS += tab[i];
        }
        return reversedS;
    }
}
