import java.util.Objects;
import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please specify your name: ");
        String owner = input.next();

        int balance;

        if (Objects.equals(owner, "selim")) {
            balance = 1000;
        } else {
            balance = 0;
        }

        System.out.println("Your balance: " + balance + "\nSpecify amount to be withdrawn: ");
        int withdraw = input.nextInt();
        int transactionFee = 1;

        if (withdraw <= balance) {
            if (withdraw == 0)
                System.out.println("Cannot withdraw zero amount.");
            else if ((withdraw % 10) == 0) {
                if (withdraw == balance) {
                    System.out.println("Withdrawn amount: " + (withdraw - transactionFee) + ", Fee: " + transactionFee + ", Balance left: 0");
                } else {
                    System.out.println("Withdrawn amount: " + withdraw + ", Fee: " + transactionFee + ", Balance left: " + (balance - transactionFee - withdraw));
                }
            } else {
                System.out.println("Withdrawn amount must be multiple of 10.");
            }
        } else {
            System.out.println("Withdraw amount must be lower or equal to your balance. Balance: " + balance);
        }
    }
}
