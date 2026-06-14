import java.util.Scanner;

public class ex_7 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 7;

        System.out.println("n1 and n2 values before manipulation: " + n1 + " " + n2);

        n1 = n1 + n2; // n1 == 12 && n2 == 7
        n2 = n1 - n2; // n1 == 12 && n2 == 5
        n1 = n1 - n2; // n1 == 7 && n2 == 5

        System.out.println("n1 and n2 values after manipulation: " + n1 + " " + n2);
    }
    }
