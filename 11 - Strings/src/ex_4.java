import java.util.Scanner;

public class ex_4 {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = scan.next();
        System.out.println(s + " to uppercase: " + allToUpper(s));
    }

    public static String allToUpper(String s) {
        String sToUpper = "";
        for (char c : s.toCharArray()) {
            sToUpper += ex_1.isLowerCase(c) ?
                ex_2.lowerToUpper(c)
                : c;
        }
        return sToUpper;
    }
}
