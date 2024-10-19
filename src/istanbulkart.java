import java.util.Scanner;

public class istanbulkart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Specify the number of daily rides: ");
        int rides = input.nextInt();

        System.out.println("Specify the number of daily transfers: ");
        int transfers = input.nextInt();

        int monthlyRides = rides * 30;
        int monthlyTransfers = transfers * 30;

        double monthlyRidesCost = (float) monthlyRides * 9.76;
        double monthlyTransfersCost = (float) monthlyTransfers * 4.28;

        if (monthlyRides + monthlyTransfers < 120) {
            if(monthlyRidesCost + monthlyTransfersCost < 850) {
                System.out.println("There is no need to buy subscription.");
            } else {
                System.out.println("You must buy subscription that saves you monthly " + ((monthlyRidesCost+ monthlyTransfersCost)-850) + "TL");
            }
        } else {
            if (monthlyRidesCost + monthlyTransfersCost < 850) {
                System.out.println("There is no need to buy subscription.");
            } else {
                System.out.println("You must buy subscription that saves you monthly " + ((monthlyRidesCost+ monthlyTransfersCost)-850) + " but you are exceeding the subscription limit that costs you " + ((monthlyRides + monthlyTransfers)-120)*9.76 + "TL");
            }
        }

    }
}