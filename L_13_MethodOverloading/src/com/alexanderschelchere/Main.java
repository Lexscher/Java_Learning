package com.alexanderschelchere;

public class Main {

    public static void main(String[] args) {
	   int newScore = calculateScore("tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeteres(7,5);
        calcFeetAndInchesToCentimeteres(6,1);
        calcFeetAndInchesToCentimeteres(5,8);
        calcFeetAndInchesToCentimeteres(100);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    // CHALLENGE!
    // PART 1
    // Create a method, calcFeetAndInchesToCentimeters, with two parameters: feet & inches.
    // Validate that the first parameter, feet, is greater than 0
    // and that the second parameter, inches is greater than 0 and less than 12.
    // return negative 1 if either are not true.
    // Calculate how many centimeters comprise the feet and inches passed to this method.
    // return that value.
    public static double calcFeetAndInchesToCentimeteres(double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            // 1 foot is 30.48 cm. 1 inch is 2.54 cm.
            double feetToCm = feet * 30.48;
            double inchesToCm = inches * 2.52;
            double totalCm = feetToCm + inchesToCm;
            System.out.println(totalCm);
            return totalCm;
        } else {
            return -1;
        }

    }

    // PART 2
    // Create a 2nd method of the same but with only one parameter, inches.
    // validate that it's greater than 0, return -1 if it's not true.
    // Calculate how many feet are in the inches and then call the other overloaded method
    // passing the correct feet and inches calculated so that it can calculate correctly.
    public static double calcFeetAndInchesToCentimeteres(double inches) {
        if (inches >= 0) {
            double feet = (int) (inches - (inches % 12)) / 12;
            System.out.println(feet);
            double inchesLeftOver = (int) inches % 12;
            System.out.println(inchesLeftOver);

            double centimeters = calcFeetAndInchesToCentimeteres(feet, inchesLeftOver);
            System.out.println(centimeters);
            return centimeters;
        } else {
            return -1;
        }
    }


    // Solution
    public static double solution(double feet, double inches) {
        if((feet < 0 ) || ((inches < 0 ) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameters!");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(centimeters);
        return centimeters;

    }

    public static double solution(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(remainingInches + " inches is equal to " + feet + " feet and " + remainingInches + " inches.");
        return solution(feet, remainingInches);

    }

}
