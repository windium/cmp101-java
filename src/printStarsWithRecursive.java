import java.util.Scanner;

public class printStarsWithRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        recursive(n);
    }

    public static void recursive(int n) {
        if(n == 0) return;

        recursive(n - 1);
        System.out.print("*");
        recursive2(n - 1);
        System.out.println();
    }

    public static void recursive2(int n) {
        if(n == 0) return;

        recursive2(n - 1);
        System.out.print("*");
    }
}