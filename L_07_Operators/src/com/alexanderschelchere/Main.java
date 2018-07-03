package com.alexanderschelchere;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2  = " + result);

        int previousResult = result;

        result--;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result *= 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result /= 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result %= 3;
        System.out.println("The remainder of " + previousResult + " divided by 3 is " + result + ".");

        boolean isAlien = false;
        if (!isAlien)
            System.out.println("PHEW!! It's not an alien!");
        else
            System.out.println("RUN!!");

        int topScore = 100;
        int score = 88;

        int differenceInPower = topScore - score;
        if (score >= topScore)
            System.out.println("You got the high score!");
        else
            System.out.println("Awe man! You were " + differenceInPower + " points away from the high score! Keep trying, mate.");
    }
}
