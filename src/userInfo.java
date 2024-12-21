import java.util.Scanner;

public class userInfo {

    public static String email;
    public static String name;
    public static int age;

    public static void collectUserInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name: ");
        name = scanner.nextLine();
        System.out.println("Write email: ");
        email = scanner.nextLine();
        while(!isEmailValid(email)) {
            System.out.println("Email is wrong. Try again: ");
            email = scanner.nextLine();
        }
        System.out.println("Write age: ");
        age = scanner.nextInt();
        while(!isAgeValid(age)) {
            System.out.println("Age is under 18");
            age = scanner.nextInt();
        }
    }

    public static void displayUserInfo() {
        System.out.println(
                "Name: " + name + "\n"
                + "Email: " + email + "\n"
                + "Age: " + age + "\n"
        );
    }

    public static boolean isEmailValid(String email) {
        if(email.contains("@") && email.contains(".com")) {
            return true;
        } else return false;
    }

    public static boolean isAgeValid(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        collectUserInfo();
        displayUserInfo();
    }
}