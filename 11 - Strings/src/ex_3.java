import java.util.Scanner;

public class ex_3 {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = scan.next();
        System.out.println(s + (allLower(s) ?
                            " has only lowercases."
                            : " has not only lowercases"));

    }

    public static boolean allLower(String s) {
        int cpt = 0;
        while (cpt < s.length() && ex_1.isLowerCase(s.charAt(cpt))) {
            ++ cpt;
        }
        return cpt == s.length();
    }
}
