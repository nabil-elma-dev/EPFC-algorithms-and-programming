import eu.epfc.prm3.Array;

import java.util.Scanner;

public class ex_8 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Array<Integer> tab = new Array<>(2,5,4,2,8);
        System.out.println("Array : " + tab);
        System.out.println("Sum of numbers: " + sumOfNumbers(tab, 0));
    }

    private static int sumOfNumbers(Array<Integer> tab, int idx) {
        if (idx == tab.size()) {
            return 0;
        }
        return tab.get(idx) + sumOfNumbers(tab, idx + 1);
    }
}
