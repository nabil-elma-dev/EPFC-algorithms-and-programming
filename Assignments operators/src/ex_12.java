import java.util.Scanner;

public class ex_12 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter an interval");
        System.out.print("Start time (hour): ");
        int startTimeH = scan.nextInt();
        System.out.print("Start time (minutes): ");
        int startTimeM = scan.nextInt();
        System.out.print("End time (hour): ");
        int endTimeH = scan.nextInt();
        System.out.print("End time (minutes): ");
        int endTimeM = scan.nextInt();

        int start = startTimeM + startTimeH * 60;
        int end = endTimeM + endTimeH * 60;

        int duration = end - start;

        /*
        - duration / 60 calculate the (integer) number of hour(s).
        - duration % 60 calculates number of minutes.
        */
        System.out.println("Duration: " + duration / 60 + " hour(s) and " + duration % 60 + " minute(s)");
    }
}
