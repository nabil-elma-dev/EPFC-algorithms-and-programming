import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ex_9 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This program determines whether a sequence is increasing (before -1 insertion)");
        int count = 0;
        int prec = 0;
        boolean increasingSequence = true;

        System.out.print("Next number: ");
        int next = scan.nextInt();

        while (increasingSequence && next != -1) {
            prec = next;
            System.out.print("Next number: ");
            next = scan.nextInt();
            ++ count;
            if (prec > next && next != -1) {
                increasingSequence = false;
            }
        }

        System.out.println(
                increasingSequence ?
                    "The sequence is increasing"
                    : "The sequence is not increasing"
        );

    }
}
