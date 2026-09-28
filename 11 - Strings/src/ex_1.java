import eu.epfc.prm3.Array;

import java.util.Scanner;

public class ex_1 {
    public static void main() {
        Array<Character> tab = new Array<>('c', 'C', '2');
        for (Character c : tab) {
            System.out.println(
                    c + (isLowerCase(c) ?
                            " est une lettre minuscule"
                            : " n'est pas une lettre minuscule")
            );
        }
    }

    public static boolean isLowerCase(Character c) {
        return (int)c >= 97 && (int)c <= 122;
    }
}
