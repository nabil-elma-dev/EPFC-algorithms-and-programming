import java.util.Scanner;

public class ex_2 {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("This program calculates the average of 2 numbers");
        System.out.print("First number: ");
        int n1 = scan.nextInt();
        System.out.print("Second number: ");
        int n2 = scan.nextInt();
        System.out.println("Average: " + Average(n1, n2));
    }

    public static double Average(int n1, int n2){
        return (double) (n1+n2) / 2;
    }
}
