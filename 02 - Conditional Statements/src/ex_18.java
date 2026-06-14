import java.util.Scanner;

public class ex_18 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insert 2 numbers");
        System.out.print("Integer 1: ");
        int n1 = scan.nextInt();
        System.out.print("Integer 2: ");
        int n2 = scan.nextInt();

        /*
             8      5       +
             8      0       +
             8     -5       +
            -8      5       -
            -8      0       -
            -8     -5       -
   8          0      0       0
        */

        if (n1 == 0 && n2 == 0 || n1 == -n2) {
            System.out.println("Their sum is 0");
        } else if (n1 > 0 && n2 > 0
                   || n1 > 0 && n1 > -n2
                   || n2 > 0 && n2 > -n1)
        {
            System.out.println("Their sum is positive");
        } else {
            System.out.println("Their sum is negative");
        }
    }
}
