package com.alexanderschelchere;

public class DayOfTheWeek {
    public static void main(String[] args) {
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(0);
        printDayOfTheWeekOrElse(3);
    }

    // Write a method with the name printDayOfTheWeek that has one parameter, day (int).
    // The method should not return any value.
    // Using a switch statement, print "Sunday", "Monday", ..., "Saturday"
        // if the parameter is 0, 1, ..., 6 respectively.
    // Otherwise it should print "Invalid day".
    public static void printDayOfTheWeek(int day) {
        switch(day) {
            case 0:
                System.out.println("Sunday");
                System.out.println("    Let's sleep in today...");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                System.out.println("    Let's get some beer!");
                break;
            case 6:
                System.out.println("Saturday");
                System.out.println("    Let's take several shots of something with an alcohol content of at least 38%");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void printDayOfTheWeekOrElse(int day) {
        if (day == 0 ) {
            System.out.println("Sunday");
            System.out.println("    Let's sleep in today...");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
            System.out.println("    Let's get some beer!");
        } else if (day == 6) {
            System.out.println("Saturday");
            System.out.println("    Let's take several shots of something with an alcohol content of at least 38%");
        } else {
            System.out.println("Invalid Day");
        }
    }
}
