import java.util.Scanner;

public class ex_11 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert 3 integers: ");
        System.out.print("First integer: ");
        int n1 = scan.nextInt();
        System.out.print("Second integer: ");
        int n2 = scan.nextInt();
        System.out.print("Third integer: ");
        int n3 = scan.nextInt();

        System.out.print("The two biggest numbers are: ");
        if(n1 < n2 && n1 < n3)
            System.out.println(n2 + " " + n3);
        else if(n2 < n3)
            System.out.println(n1 + " " + n3);
        else
            System.out.println(n1 + " " + n2);
    }
}
