import java.util.Scanner;

public class daysToYMW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter days:");
        int days = input.nextInt();

        int daysToYear = days/365;
        int daysLeftFromYear = days%365;
        int daysLeftFromYearToMonth = daysLeftFromYear/30;
        int daysLeftFromMonth = daysLeftFromYear%30;
        int daysLeftFromMonthToWeek = daysLeftFromMonth/7;
        int daysLeftFromWeek = daysLeftFromMonth%7;

        System.out.println(daysToYear + " years, " + daysLeftFromYearToMonth + " months, " + daysLeftFromMonthToWeek + " weeks, " + daysLeftFromWeek + " days");
    }
}