import java.util.Scanner;

public class ex_14 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a binary number: ");
        int n = s.nextInt();
        while (!isItBinary(n)) {
            System.out.println(n + " is not a binary number!");
            System.out.print("Enter a binary number: ");
            n = s.nextInt();
        }
        binaryToDecimal(n);
    }



    public static boolean isItBinary(int n) {
        return (n == 0 || n == 1) ||
                (n % 10 == 0 || n % 10 == 1) && isItBinary(n / 10);
    }

    public static void binaryToDecimal(int n) {
        System.out.print(conversionDigitsBinToDec(n, 0));
    }

    public static int conversionDigitsBinToDec(int n, int exp) {
        if (n == 0 || n == 1) {
            return n * ex_5.profPowerOfFaster(2, exp);
        } else {
            return n % 10 * ex_5.profPowerOfFaster(2, exp) + conversionDigitsBinToDec(n / 10, exp + 1);
        }
    }
}
