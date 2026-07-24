import eu.epfc.prm3.Array;

import java.util.Scanner;

public class ex_10 {
    public static Scanner scan = new Scanner(System.in);

    public static void main() {
        Array<Integer> tab = new Array<>(2,7,6,8,8,5,3,8);
        System.out.println("Array: " + tab);
        System.out.print("Which number will be inserted? ");
        int n = scan.nextInt();
        tab.add(n);
        System.out.print("Chosen position: ");
        int pos = insertValideNumber(tab, scan.nextInt());
        insertValue(tab, n, pos);
        System.out.println("Array after insertion: " + tab);
    }

    public static int insertValideNumber(Array<Integer> tab, int n) {
        while (n < 0 || n >= tab.size()) {
            System.out.println("Error: the number must be between 0 and tab.size() - 1");
            System.out.print("Chosen position: ");
            n = scan.nextInt();
        }
        return n;
    }

    public static void insertValue(Array<Integer> tab, int n, int pos) {
        for (int i = tab.size() - 1; i > pos; --i) {
            tab.set(i, tab.get(i-1));
        }
        tab.set(pos, n);
    }
}
