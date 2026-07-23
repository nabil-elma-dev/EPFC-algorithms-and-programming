import eu.epfc.prm3.Array;

public class ex_2 {
    public static void main() {
        Array<Integer> tab = new Array<>(2,7,7,8,3,4,4,1);
        System.out.println("Array: " + tab);
        System.out.println("Average: " + avgTab(tab));
    }

    public static double avgTab(Array<Integer> tab) {
        int sum = 0;
        int cpt = 0;
        for (int i = 0; i < tab.size(); ++i) {
            sum += tab.get(i);
            ++cpt;
        }
        return (double) sum/cpt;
    }
}
