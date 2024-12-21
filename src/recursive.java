import java.util.Scanner;

public class recursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        recursive(n);
    }

    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void recursive(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        } else if(isOdd(n)) {
            n = (n * 3) + 1;
            System.out.print(n + " -> ");
            recursive(n);
        } else if(isEven(n)) {
            n = n / 2;
            System.out.print(n + " -> ");
            recursive(n);
        };
    }
}