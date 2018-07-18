public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    // Write a method printYearsAndDays with the parameter, minutes (long).
    // The method should not return anything, and needs to calculate the years and days
        // from the minutes parameter.
    // if minutes is less than 0, print text "Invalid Value".
    // Print a message in the formant "XX min = YY y and ZZ d" (minutes, years, days).

    // one day = 1440 minutes | one year = 365 days.
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        // System.out.println(minutes);
        long days = minutes / 1440;
        // System.out.println(days);
        long years = days / 365;
        // System.out.println(years);
        long daysRemaining = days % 365;
        // System.out.println(daysRemaining);

        String time = minutes + " min = " + years + " y and " + daysRemaining + " d";
        System.out.println(time);
    }
}
