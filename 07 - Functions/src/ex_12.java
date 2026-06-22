import java.util.Scanner;

public class ex_12 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program determines how many prime numbers there are before n");
        System.out.print("Enter a positive number : ");
        int n = scan.nextInt();
        System.out.println("Prime numbers before " + n + ": " + primeNumbersBefore(n));
    }

    public static int primeNumbersBefore(int n) {
        int cpt = 0;
        for (int p = 2; p < n; ++p) {
            if (isPrimeNumber(p)) {
                ++cpt;
            }
        }
        return cpt;
    }

    public static boolean isPrimeNumber(int n) {
        // Negative numbers, 0 and 1
        if (n < 2) {
            return false;
        }

        // Even numbers
        if (n % 2 == 0) {
            return n == 2;
        }

        // Odd numbers
        /*
            No need to go further if n is greater than square i (in other words , if i is greater than the square root of n)

            Explanation: Assume that n is not prime. Then there exist two divisors a and b: n = a × b

            if a and b were both greater than square root of n they're product is greater than n
            if a > √n && b > √n --> a * b > √n * √n --> a * b > n

            HOWEVER! We already know a * b is equal to n, which would lead to the following contradiction: n > n

            Conclusion: if n has any divisor at all, one of its divisors must be ≤ √n.
        */
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isMultiple(int n1, int n2) {
        return n1 % n2 == 0;
    }

    //    // Renvoie true ssi n est premier
//    public static boolean estPremier(int n) {
//        int candidatDiviseur = 2;
//        while (candidatDiviseur < n && !estMultipleDe(n, candidatDiviseur)) {
//            ++candidatDiviseur;
//        }
//        return candidatDiviseur == n;
//    }
    // Solution (légèrement) plus rapide
    // Renvoie true ssi n est premier

}
