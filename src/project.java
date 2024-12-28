import java.util.*;

public class project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        while(row < 1 || row > 1000 || col < 1 || col > 1000) {
            return;
        }

        int safe = 0;

        safe = recursive(col, row, safe);

        System.out.println(safe);
    }

    public static int recursive(int col, int row, int safe) {
        if(row == 0) {
            return safe;
        }

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[col];
        for(int i = 0; i < col; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if(Math.abs(diff) > 3) {
                return recursive(col, row - 1, safe);
            }

            if (arr[i] < arr[i - 1]) {
                isIncreasing = false;
            }
            if (arr[i] > arr[i - 1]) {
                isDecreasing = false;
            }
        }

        if (isIncreasing || isDecreasing) {
            safe++;
        }
        //System.out.println(Arrays.toString(arr));

        return recursive(col, row - 1, safe);
    }
}