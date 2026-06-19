import java.util.Scanner;

public class ex_2 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int fib0 = 1;
        int fib1 = 1;

        System.out.println("This program prints the n first numbers of Fibonacci sequence. For this sequence, both first and second number are 1");
        System.out.print("Insert a number (indicating nb numbers of the sequence shown) : ");
        int n = scan.nextInt();

        while (n <= 0) {
            System.out.println("Insert a positive number!");
            System.out.print("Insert a number (indicating nb numbers of the sequence shown) : ");
            n = scan.nextInt();
        }

        if (n == 1)
            System.out.print(fib0);
        else
            System.out.print(fib0 + ", " + fib1);

        for (int i = 2; i < n; ++i) {
            int tmp = fib0;
            fib0 = fib1;
            fib1 = tmp + fib1;
            System.out.print(", " + fib1);
        }
    }
}
