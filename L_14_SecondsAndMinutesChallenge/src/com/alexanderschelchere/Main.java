package com.alexanderschelchere;

public class Main {

    public static void main(String[] args) {
	// write your code here
        getDurationString(121, 9);
            // prints: 02h 01m 09s
        getDurationString(131, 50);
            // prints: 02h 11m 50s
        getDurationString(40, 3);
            // prints: 00h 40m 03s
        getDurationString(3601);
            // prints: 01h 00m 01s
        getDurationString(40027);
            // prints 11h 07m 07s
    }

    // Create a method called getDurationString with two parameters (both int), minutes and seconds.
    // Validate that the first parameter, minutes, is greater than or equal to 0.
    // Validate that the second parameter, seconds, is greater than or equal to 0,
        // AND less than or equal to 59.
    // The method should return the sting "Invalid Value" if neither are true"
    // Calculate how many hours minutes and seconds equal the minutes and seconds passed to this method.
    // Return that value as a string in formant "XXh YYm ZZs" (hours, minutes, seconds).

    // BONUS: for the input of 61 minutes, output should be "01h 01m 00s"

    // 1 minute = 60 seconds. 1 hour = 60 minutes OR 3600 seconds.
    public static String getDurationString(int minutes, int seconds) {
         // Validations.
        if (minutes < 0 || seconds < 0 || seconds > 59 ) {
            return "Invalid value";
        }

        // Assignments
        int h = minutes / 60;
        int m = minutes % 60;
        int s;
        s = seconds;

        // Bonus: Conversion into time format.
        String hr;
        String min;
        String sec;
        if (h < 10) {
            hr = "0" + h;
        } else {
            hr = "" + h;
        }
        if (m < 10 ) {
            min = "0" + m;
        } else {
            min = "" + m;
        }
        if (s < 10) {
            sec = "0" + s;
        } else {
            sec = "" + s;
        }

        String time = hr + "h " + min + "m " + sec + "s ";
        System.out.println(time);
        return time;
    }

    // create a 2nd method of the same name but with only one parameter, seconds.
    // Validate that it is greater than or equal to 0, and return invalid value if it is not true.
    // Calculate how many minutes are in the seconds value.
    // Then call the overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly.
    // In your main method call both methods to print values to the console.
    public static String getDurationString(long seconds) {
        // Validation.
        if (seconds < 0) {
            return "Invalid Value";
        }
        // Assignments.
        long minutes = seconds / 60;
        long sec =  seconds % 60;
        // Override method call.
        String time = getDurationString((int) minutes, (int) sec);
        return time;
    }
}
