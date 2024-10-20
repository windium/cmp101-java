import java.util.Scanner;

public class carRental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = input.next();
        System.out.println("Please enter your age: ");
        int age = input.nextInt();
        System.out.println("Please enter your driver license age: ");
        int licenseAge = input.nextInt();

        int amountToPay = 0;
        int carPrice = 2000;

        if(age >= 21) {
            if(licenseAge >= 2) {
                if(age >= 21 && age <= 25) {
                    amountToPay += 100;
                }
                amountToPay += carPrice;
                System.out.println("Details:\nName: " + name + " Age: " + age + " Driver License Age: " + licenseAge + "\nAmount due: " + amountToPay);
            } else {
                System.out.println("License age must be above 2.");
            }
        } else {
            System.out.println("Minimum age that required is 21.");
        }
    }
}