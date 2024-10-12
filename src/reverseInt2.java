import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class reverseInt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 4-digit number:");
        int number = input.nextInt();

        int reversed;

        String numStr = String.valueOf(number);

        String[] numStrSplit = numStr.split("");

        Collections.reverse(Arrays.asList(numStrSplit));

        reversed = Integer.parseInt(String.join("", Arrays.asList(numStrSplit)));

        System.out.println("The reversed number is: " + reversed);
    }
}