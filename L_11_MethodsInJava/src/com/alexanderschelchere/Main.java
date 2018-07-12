package com.alexanderschelchere;

public class Main {

    public static void main(String[] args) {

        // so, we can also do something like this, where we take the value
        //   of what's returned in our calculateScore method, then assign it to a variable.
        // We can then use that variable to print something to the console!
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        // Now, I'll use the two new functions that I've just created.
        int hSPosition = calculateHighScorePosition(highScore);
        String finalCall = displayHighScorePosition("Carlos", hSPosition);
        System.out.println(finalCall);

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;


        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        hSPosition = calculateHighScorePosition(highScore);
        finalCall = displayHighScorePosition("Carlos", hSPosition);
        System.out.println(finalCall);

        // Now to make the other test examples.

        hSPosition = calculateHighScorePosition(900);
        finalCall = displayHighScorePosition("Kendall", hSPosition);
        System.out.println(finalCall);

        hSPosition = calculateHighScorePosition(400);
        finalCall = displayHighScorePosition("James", hSPosition);
        System.out.println(finalCall);

        hSPosition = calculateHighScorePosition(50);
        finalCall = displayHighScorePosition("Logan", hSPosition);
        System.out.println(finalCall);


    }
    // Since we aren't trying to print anything within our method, our method call is faster.
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }

        return -1;

    }
    // Challenge!
        // Part 1
    public static String displayHighScorePosition(String playerName, int position) {
        // Tell the player where they've ranked in the list of high scores!
        String message = playerName + " managed to get into position " + position + " on the high score table.";
        return message;

    }
        // Part 2
    public static int calculateHighScorePosition(int playerScore) {
        if ( playerScore >= 1000 ) {
            return 1;
        } else if ( playerScore >= 500) {
            return 2;
        } else if ( playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

    // Solution:
    public static void displayHighScorePositionSolution(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table.");
    }

    public static int dalculateHighScorePositionSolution(int playerScore) {

        if(playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }

    }


}
