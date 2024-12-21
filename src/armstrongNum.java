import java.util.Scanner;

public class armstrongNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int numSave = number;

        int digit = 0;

        while (number > 0) {
            number = number / 10;
            digit++;
        }

        int sum = 0;

        while (numSave > 0) {
            sum += (int) Math.pow(numSave % 10, digit);
            numSave /= 10;
        }

        if(sum == numSave) {
            System.out.println("Armstrong number");
        }
    }
}