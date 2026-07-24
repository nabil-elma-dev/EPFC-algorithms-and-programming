import eu.epfc.prm3.Array;

import java.util.Scanner;

public class ex_12b {
    public static Scanner scan = new Scanner(System.in);

    public static void main() {
        Array<Integer> tab = new Array<>(4,3,7,2,5,4,4,4,4,3,5,4);
        System.out.println("Array: " + tab);
        System.out.print("Insert a value: ");
        int n = scan.nextInt();
        System.out.print("Insert a position between 0 and tab.size() - 1: ");
        int pos = insertValidNumber(tab, scan.nextInt());
        deleteAll(tab, n, pos);
        System.out.println("Array post deletion of all " + n + ": " + tab);
    }

    public static int insertValidNumber(Array<Integer> tab, int n) {
        while (n < 0 || n >= tab.size()) {
            System.out.println("Error: the number must be between 0 and tab.size() - 1");
            System.out.print("Chosen position: ");
            n = scan.nextInt();
        }
        return n;
    }

    public static void deleteAll(Array<Integer> tab, int target, int pos) {
        int nbTarget = 0;
        int write = pos;
        for (int read = pos; read < tab.size(); ++read) {
            if (target != tab.get(read)) {
                tab.set(write, tab.get(read));
                ++write;
            } else {
                ++ nbTarget;
            }
        }
        tab.reduceTo(tab.size() - nbTarget);
    }
}
