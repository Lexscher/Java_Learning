package com.alexanderschelchere;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);

        getDaysInMonth(1, 2020);
        getDaysInMonth(2, 2020);
        getDaysInMonth(2, 2018);
        getDaysInMonth(-1, 2020);
        getDaysInMonth(-1, -2020);
    }

    // Write a method isLeapYear with one parameter, year (int).
    // Validate that year is greater than or equal to 1 and less than or equal to 9999.
    // Otherwise, return false.

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            System.out.println("neg.");
            return false;
        }
        if (year % 400 == 0) {
            System.out.println("yep. 400.");
            return true;
        } else if (year % 4 == 0 && !(year % 100 == 0)) {
            System.out.println("yep. yep.");
            return true;
        }
        System.out.println("nah.");
        return false;

    }

    // Write another method getDAysInMonth with two parameters, month and year (both int).
    // If month is less than 1 or greater than 12, return -1
    // if year is less than 1 or greater than 9999, return -1
    // This method needs to return the number of days in the month.
    // Be careful about leap years - They have 29 days in February (month 2).
    // Check if the year is a leap year by using isLeapYear!

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }
        // Trying to figure out if I should initialize an int, days, and change it's
        // value using the switch statement, then return days,
        // or just return the number immediately within the switch statement....
        int days;
        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 2:
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            default:
                days = -1;
                break;
        }

        return days;

    }
}
