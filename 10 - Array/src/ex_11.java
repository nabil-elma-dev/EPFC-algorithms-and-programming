import eu.epfc.prm3.Array;

import java.util.Scanner;

public class ex_11 {
    public static Scanner scan = new Scanner(System.in);

    public static void main() {
        Array<Integer> tab = new Array<>(2,7,6,8,8,5,3,8);
        System.out.println("Array: " + tab);
        System.out.print("Chosen position for deletion: ");
        int pos = insertValidNumber(tab, scan.nextInt());
        eraseValue(tab, pos);
        System.out.println("Array after deletion: " + tab);
    }

    public static int insertValidNumber(Array<Integer> tab, int n) {
        while (n < 0 || n >= tab.size()) {
            System.out.println("Error: the number must be between 0 and tab.size() - 1");
            System.out.print("Chosen position: ");
            n = scan.nextInt();
        }
        return n;
    }

    public static void eraseValue(Array<Integer> tab, int pos) {
        for (int i = pos; i < tab.size() - 1; ++i) {
            int next = tab.get(i + 1);
            tab.set(i, next);
        }
        tab.reduceTo(tab.size() - 1);
    }
}
