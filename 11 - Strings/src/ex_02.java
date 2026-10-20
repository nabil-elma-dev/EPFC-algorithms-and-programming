import eu.epfc.prm3.Array;

public class ex_02 {
    public static void main() {
        Array<Character> tab = new Array<>('c', 'C', '2');
        for (Character c : tab) {
            if (ex_01.isLowerCase(c)) {
                System.out.println(c + " to uppercase: " + lowerToUpper(c));
            } else {
                System.out.println(c + " is not a lowercase");
            }
        }
    }

    public static Character lowerToUpper(Character c) {
        if (ex_01.isLowerCase(c)) {
            return (char)((int)c - 32) ;
        } else {
            return c;
        }

    }
}
