import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Specify first number: ");
        int firstNum = input.nextInt();
        System.out.println("Specify second number: ");
        int secondNum = input.nextInt();

        System.out.println("Specify the operator to calculate: ");
        char operator = input.next().charAt(0);

        int calculation = 0;

        if (operator == '+') {
            calculation = firstNum + secondNum;
        } else if (operator == '-') {
            calculation = firstNum - secondNum;
        } else if (operator == '*') {
            calculation = firstNum * secondNum;
        } else if (operator == '/') {
            if(secondNum != 0) {
                calculation = firstNum / secondNum;
            } else {
                System.out.println("Cannot divide by zero");
                return;
            }
        } else {
            System.out.println("Invalid operator");
        }

        System.out.println(calculation);

    }
}