import eu.epfc.prm3.Array;

public class ex_1 {
    public static void main() {
        Array<Integer> tab = new Array<>(2,7,6,6,5);
        System.out.println("Array: " + tab);
        System.out.println("Sum of elements: " + sumTab(tab));
    }

    public static int sumTab(Array<Integer> tab) {
        int tot = 0;
        for (int i = 0; i < tab.size(); ++i) {
            tot += tab.get(i);
        }
        return tot;
    }
}
