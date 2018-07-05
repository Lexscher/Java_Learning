package com.alexanderschelchere;

public class Main {

    public static void main(String[] args) {

        // so you can just use the values that you need when calling the method.
        calculateScore(true, 800, 5, 100);

        // however,  you can also do this.
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        // using the variable so the method will read it's value.
        calculateScore(gameOver, score, levelCompleted, bonus);


    }
    // Here is how we can make our method!
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }

        return -1;



    }

}
