public class ex_5 {
    public static void main() {
        String s = "September";
        char c = 'e';
        System.out.println("String = " + s);
        System.out.println("Target = " + c);
        System.out.println("Number of appearances: " + nbTimesAppeared(s, c));
    }

    public static int nbTimesAppeared(String s, char target) {
        int cpt = 0;
        for (char c : s.toCharArray()) {
            if (c == target)
                ++ cpt;
        }
        return cpt;
    }
}
