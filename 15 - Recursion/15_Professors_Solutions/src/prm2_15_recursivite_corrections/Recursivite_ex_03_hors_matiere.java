package prm2_15_recursivite_corrections;

import eu.epfc.prm3.Array;

public class Recursivite_ex_03_hors_matiere {
    // Complément hors matière.
    //
    // On garde ici chaque nombre calculé en mémoire (dans un tableau).
    //
    // Remarque : les "long" en Java sont des entiers sur 64 bits plutôt que
    // sur 32 bits pour les "int", ce qui permet de stocker des nombres plus
    // grands.
    //
    // Un cours à option d'algorithmique vous est proposé (et conseillé) à
    // partir de la deuxième année.

    public static long fibo(int n) {
        return fiboMemory(n, new Array<>(1L, 1L));
    }
    public static long fiboMemory(int n, Array<Long> memory) {
        if(memory.size() < n)
            memory.extend(n - memory.size(), 0L);
        if(memory.get(n - 1) != 0)
            return memory.get(n - 1);
        else {
            long res = fiboMemory(n - 1, memory) + fiboMemory(n - 2, memory);
            memory.set(n - 1, res);
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(fibo(10));
        System.out.println(fibo(5));
        System.out.println(fibo(1));
        System.out.println(fibo(50));
    }
}
