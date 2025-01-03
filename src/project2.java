import java.util.Scanner;

public class project2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        String[] bumpers = scanner.next().split("");

        if(size != bumpers.length)
            return;

        int leftC = left(bumpers, 0, size - 1);
        int rightC = right(bumpers, 0, 0);

        System.out.println(leftC + rightC);

    }

    public static int left(String[] bumpers, int count, int n) {
        if (n < 0) {
            return count;
        }

        if (bumpers[n].equals("<")) {
            return count;
        }

        return left(bumpers, count + 1, n - 1);
    }

    public static int right(String[] bumpers, int count, int n) {
        if (n > bumpers.length-1) {
            return count;
        }

        if (bumpers[n].equals(">")) {
            return count;
        }

        return right(bumpers, count + 1, n + 1);
    }
}