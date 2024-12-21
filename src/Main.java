import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        recursive(n);
    }

    private static void recursive(int n) {
        int a = 0;
        if (a == n)
            return;
        recursive2(a, 0);
        System.out.println();
        recursive(a+1);
    }

    private static void recursive2(int n, int a) {
        if (n == a) return;

        System.out.print("*");

        recursive2(n, a+1);
    }
}