import java.util.Scanner;

public class project2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int size = keyboard.nextInt();

        String[] bumpers = keyboard.next().split("");

        int leftCount = fromLeft(bumpers, 0, size - 1);
        int rightCount = fromRight(bumpers, 0, 0);

        int total = leftCount + rightCount;

        if (leftCount + rightCount > size) {
            total = size;
        }

        System.out.println(total);
    }

    public static int fromLeft(String[] bumpers, int count, int n) {
        if(n == 0) {
            return count;
        }
        if (bumpers[n].equals("<")) {
            count++;
        } else {
            return count;
        }
        return fromLeft(bumpers, count, n - 1);
    }

    public static int fromRight(String[] bumpers, int count, int n) {
        if (n == bumpers.length - 1) {
            return count;
        }
        if (bumpers[n].equals(">")) {
            count++;
        } else {
            return count;
        }
        return fromRight(bumpers, count, n + 1);
    }
}