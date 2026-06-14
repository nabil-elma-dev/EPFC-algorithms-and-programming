import java.util.Scanner;

public class ex_12 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert 3 numbers: ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        if(n1 == n2 || n1 == n3)
            System.out.println("Repeated number: " + n1);
        else if(n2 == n3)
            System.out.println("Repeated number: " + n2);
    }
}
