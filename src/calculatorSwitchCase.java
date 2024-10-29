import java.util.Scanner;

public class calculatorSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Specify first number: ");
        int firstNum = input.nextInt();
        System.out.println("Specify second number: ");
        int secondNum = input.nextInt();

        System.out.println("Specify the operator to calculate: ");
        char operator = input.next().charAt(0);

        int calculation = 0;

        switch(operator) {
            case '+':
                calculation = firstNum + secondNum;
                break;
            case '-':
                calculation = firstNum - secondNum;
                break;
            case '*':
                calculation = firstNum * secondNum;
                break;
            case '/':
                if(secondNum != 0) {
                    calculation = firstNum / secondNum;
                    break;
                } else {
                    System.out.println("Cannot divide by zero");
                    return;
                }
        }
        System.out.println(calculation);
    }
}