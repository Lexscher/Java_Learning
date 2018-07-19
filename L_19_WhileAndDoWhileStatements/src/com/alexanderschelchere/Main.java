package com.alexanderschelchere;

public class Main {

    public static void main(String[] args) {
        // While Loops
        int count = 0;
        System.out.println("WHILE LOOPS!");
        while(count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }
        line();
        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }
        line();
        // Do While Loops
        count = 1;
        System.out.println("DO WHILE LOOPS!");
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count < 6);
        line();
        int num = 4;
        int end = 20;
        count = 0;
        while (num <= end) {
            num++;
            if(!isEvenNumber(num)) {
                continue;
            }
            count++;
            System.out.println("Even number " + num);
            if (count >= 5) {
                break;
            }
        }
        System.out.println("The total number of even numbers found is " + count);
        // Modify the while code above.
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found.
    }

    // Create a method called isEvenNumber that takes one parameter (int).
    // It needs to determine if the argument passed to the method is even or not.
    // return true if an even number, otherwise return false.
    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void line() {
        String love = "__________________code_break__________________";
        System.out.println(love);
    }
}
