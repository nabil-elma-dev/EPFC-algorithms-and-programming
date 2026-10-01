public class ex_14 {
    public static void main() {
        int n = 123;
        System.out.println(intPositifToString(n));
    }

    public static String intPositifToString(int n) {
        String intToString = "";
        if (n < 0) {
            throw new RuntimeException("Error: negative number");
        } else {
            do {
                int current = (n % 10);
                intToString = current + intToString;
                n /= 10;
            } while (n != 0);
        }
        return intToString;
    }
}
