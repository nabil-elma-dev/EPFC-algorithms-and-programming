public class ex_16 {
    public static void main(String[] args) {
        String s = "Nabil El Mahfoudi";
        qtyOfUpperCases(s);
    }


    public static void qtyOfUpperCases(String s) {
        System.out.println(qtyOfUpperCases(s, 0));
    }

    public static boolean isUpperCase(char c) {
        return (int) c >= 65 && (int) c <= 90; // ASCII Table
    }

    public static int qtyOfUpperCases(String s, int pos) {
        if (pos == s.length()) {
            return 0;
        } else {
            return isUpperCase(s.charAt(pos))?
                    1 + qtyOfUpperCases(s, pos + 1)
                    : qtyOfUpperCases(s, pos + 1);
        }
    }
}
