package com.alexanderschelchere;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score == 5000) {
//            System.out.println("Your score was " + score);
//        } else if (score < 5000) {
//            System.out.println("Your score, " + score + ", was less than 5000");
//        } else {
//            System.out.println("OVER NINE THOUSANDDDDDDDD (well actually, over 5000, hehe");
//        }

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // Print out a second score on the screen with:
        /// score set to 10000
        // level completed set to 8
        // bonus set to 200
        // make sure the first printout is still displayed

    }
}
