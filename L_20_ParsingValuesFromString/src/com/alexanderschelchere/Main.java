package com.alexanderschelchere;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        // This will try to convert the string into an integer
        int number = Integer.parseInt(numberAsString); // This won't work if numberAsString
                                            // had a character that was NOT numerical.
        System.out.println("Number = " + number);

        double doubleNumber = Double.parseDouble(numberAsString);
        System.out.println("Our double is = " + doubleNumber);

        numberAsString += 1; // concatenating "1" with numberAsString
        number += 1; // increments our new number
        doubleNumber += 1.0;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("Number = " + number);
        System.out.println("Our double is = " + doubleNumber);

    }
}
