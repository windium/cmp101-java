import java.util.Scanner;

public class speedLimitCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Distance traveled(km): ");
        int distanceKm = input.nextInt();
        System.out.println("Time taken(hour): ");
        int timeTakenHr = input.nextInt();

        int speed = distanceKm/timeTakenHr;
        System.out.println("Your speed: " + speed + " km/hr");

        if(speed <= 80) {
            System.out.println("Your speed is slow.");
        } else if(speed > 80 && speed <= 100) {
            System.out.println("Your speed is normal.");
        } else if(speed > 100 && speed <= 120) {
            System.out.println("Your speed is slightly high.");
        } else if(speed > 120 && speed <= 140) {
            System.out.println("You have exceeded the speed limit, be careful.");
        } else if(speed > 140){
            System.out.println("You are speeding excessively, please slow down!");
        }
    }
}