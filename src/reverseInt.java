import java.util.Scanner;

public class reverseInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 4-digit number:");
        int number = input.nextInt();

        int reversed = 0;

        reversed += number/1000;
        reversed += ((number/100)%10)*10;
        reversed += ((number/10)%10)*100;
        reversed += ((number/1)%10)*1000;

        System.out.println("Reversed number: " + reversed);

    }
}