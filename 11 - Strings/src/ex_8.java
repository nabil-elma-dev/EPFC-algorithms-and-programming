public class ex_8 {
        public static void main() {
            String s = "girA f a ri G";
            System.out.println("String: " + s);
            System.out.println(ditto(s));
        }

        public static boolean ditto(String s) {
            char[] tab = s.toCharArray();
            int cptToRight = 0;
            int cptToLeft = tab.length - 1;
            boolean is_ok = true;
            while (cptToRight < cptToLeft && is_ok) {
                if (tab[cptToRight] == ' ') {
                    ++ cptToRight;
                } else if (tab[cptToLeft] == ' ') {
                    -- cptToLeft;
                } else {
                    is_ok = ex_2.lowerToUpper(tab[cptToLeft]) == ex_2.lowerToUpper(tab[cptToRight]);
                    ++cptToRight;
                    -- cptToLeft;
                }
            }
            return cptToRight == cptToLeft;
        }

        public static void dittoConditions(String s) {

        }
}
