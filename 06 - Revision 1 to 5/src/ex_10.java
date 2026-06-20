import java.util.Scanner;

public class ex_10 {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int lastTime = 0;
        int next;
        int currentPos = 0;

        System.out.println("This program displays the position where a certain positive number (chosen by the user) appeared for the last time" +
                " in a cluster of numbers (sentinel: -1)");
        System.out.print("Insert here the chased number: ");

        int target = scan.nextInt();

        while (target < 0) {
            System.out.println("Only positive numbers are allowed!");
            System.out.print("Insert here the chased number: ");
            target = scan.nextInt();
        }

        do {
            System.out.print("Next number: ");
            next = scan.nextInt();
            ++currentPos;
            if (next == target) {
                lastTime = currentPos;
            }
        } while (next != -1);

        if (lastTime != 0)
            System.out.println("Last apparition of " + target + " on position number " + lastTime);
        else
            System.out.println("Sentinel -1 has been inserted as the first number. Therefore, no cluster to work with");
    }
}
