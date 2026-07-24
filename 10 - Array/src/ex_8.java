import eu.epfc.prm3.Array;

public class ex_8 {
    public static void main() {
        Array<Integer> tab = new Array<>(2,7,6,8,8,5,3,8);
        System.out.println("Array: " + tab);
        leftPermutation(tab);
        System.out.println("Array after left permutation: " + tab);
    }

    public static void leftPermutation(Array<Integer> tab) {
        for (int i = 0; i < tab.size() - 1; ++i) {
            int current = tab.get(i);
            tab.set(i, tab.get(i + 1));
            tab.set(i + 1, current);
        }
    }
}
