import java.util.Scanner;

public class ex_3 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int fib0 = 1;
        int fib1 = 1;

        System.out.println("This program determines the greatest number of a given Fibonacci sequence. For this sequence, both first and second number are 1");
        System.out.print("Insert a number: ");
        int n = scan.nextInt();



        while (fib1 < n) {
            int tmp = fib0;
            fib0 = fib1;
            fib1 = tmp + fib1;
        }

        System.out.println("The number on the Fibonacci Sequence just before " + n + " is " + fib0);
    }
}
