import eu.epfc.prm3.Array;

import java.util.Scanner;

public class ex_12a {
    public static Scanner scan = new Scanner(System.in);

    public static void main() {
        Array<Integer> tab = new Array<>(4,3,7,2,5,4,4,4,4,3,5,4);
        System.out.println("Array: " + tab);
        System.out.print("Insert a value: ");
        int n = scan.nextInt();
        deleteAll(tab, n);
        System.out.println("Array post deletion of all " + n + ": " + tab);
    }

    public static void deleteAll(Array<Integer> tab, int target) {
        int write = 0;
        int nbTarget = 0;
        for (int read = 0; read < tab.size(); ++read) {
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
