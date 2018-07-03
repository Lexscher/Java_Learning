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
        boolean isHuman = true;
        if (!isAlien || isHuman)
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


        int newValue = 50;
        if ((newValue == 50) || (newValue == 100))
            System.out.println("These are the numbers you are looking for...");
        else
            System.out.println("These are not the numbers you are looking for...");


        boolean ownsTesla = false;

        String areWeMoneyful = ownsTesla ? "Yes, we have so many luxurious cars. Including a Tesla model X." : "We're dirt poor, mate.";
        System.out.println(areWeMoneyful);


        // PRACTICE: What's happening with these totals!
        // 1. Create a double variable with the value 20.
        double num1 = 20d;
        // 2. Create a double variable with the value 80.
        double num2 = 80d;
        // 3. Add both numbers up and multiply by 25.
        double total = (num1 + num2) * 25;
        // 4. Use the remainder operator to figure out the
        //      remainder from the sum of #3 divided by 40.
        double totalRemainder = total % 40;
        // 5. Write an "if" statement that displays a message,
        //    "Total was over the limit",
        //     if the remaining total (#4) is equal to 20 or less.
        if (totalRemainder <= 20)
            System.out.println("Total, " + total + " was over the limit. The remainder is " + totalRemainder + ".");
        else
            System.out.println("The total is " + total + ".");


        int baz = 0;
        while (baz < 100) {
            baz++;
            if ((baz % 3 == 0) && (baz % 5 == 0))
                System.out.println("FooBar");
            else if (baz % 3 == 0)
                System.out.println("Foo");
            else if (baz % 5 == 0)
                System.out.println("Bar");
            else
                System.out.println(baz);
        }
        System.out.println("we did that.");
    }
}
