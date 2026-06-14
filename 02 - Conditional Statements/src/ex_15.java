import java.util.Scanner;

public class ex_15 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scan.nextInt();
        if(a > 0) {
            if(a == 1)
                System.out.println("a vaut 1");
        }
        else
            System.out.println("a est inferieur ou egal à 0");
    }
}
