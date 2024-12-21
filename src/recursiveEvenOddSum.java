import java.util.Scanner;

public class recursiveEvenOddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        recursive(n, 0,0);
    }

    public static void recursive(int n, int oddSum, int evenSum) {
        if (n == 0) {
            System.out.println(oddSum);
            System.out.println(evenSum);
            return;
        }
        if(isOdd(n)) {
            oddSum = oddSum + n;
        }
        if(isEven(n)) {
            evenSum = evenSum + n;
        }
        n = n - 1;
        recursive(n, oddSum, evenSum);
    }

    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}