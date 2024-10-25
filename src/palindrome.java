import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int char1 = number % 10;
        int char2 = (number / 10)%10;
        int char3 = (number / 100)%10;
        int char4 = (number / 1000)%10;

        if(char1 == char4 && char2 == char3) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}