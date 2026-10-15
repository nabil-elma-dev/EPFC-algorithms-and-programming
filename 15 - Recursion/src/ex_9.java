import eu.epfc.prm3.Array;

public class ex_9 {
    public static void main(String[] args) {
        Array<Integer> tab = new Array<>(2, 4, 5, 7, 8, 9, 10, 11);
        int chasedValue = 7;
        int wontBeFound = 12;
        System.out.println(findElemWithRecursion(tab, chasedValue)); // true
        System.out.println(findElemWithRecursion(tab, wontBeFound)); // false
    }

    public static boolean findElement(Array<Integer> tab, int chasedValue) {
        int inf = 0;
        int sup = tab.size();
        int middle = (inf + sup) / 2;

        while (inf < sup && tab.get(middle) != chasedValue) {
            if (chasedValue < tab.get(middle)) {
                sup = middle;
            } else {
                inf = middle + 1;
            }
            middle = (inf + sup) / 2;
        }
        return inf < sup;
    }

    public static boolean findElemWithRecursion(Array<Integer> tab, int chasedValue) {
        int inf = 0;
        int sup = tab.size();
        int middle = (inf + sup) / 2;
        return recursiveElemSearch(tab, chasedValue, inf, sup, middle);
    }

    private static boolean recursiveElemSearch(Array<Integer> tab, int chasedValue, int inf, int sup, int middle) {

        if (inf == sup) {
            return false;
        }

        if (chasedValue < tab.get(middle)) {
            sup = middle;
            middle = (inf + sup) / 2;
            return recursiveElemSearch(tab, chasedValue, inf, sup, middle);
        } else if (chasedValue > tab.get(middle)) {
            inf = middle + 1;
            middle = (inf + sup) / 2;
            return recursiveElemSearch(tab, chasedValue, inf, sup, middle);
        } else {
            return true;
        }
    }
}
