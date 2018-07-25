import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        System.out.println("ok");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ok man");
        int count = 1;
        int sum = 0;
        while (count < 11) {
            System.out.println("Enter number #" + count + ": ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                sum += scanner.nextInt();
                scanner.nextLine();
                count++;
            } else {
                System.out.println("Invalid Number");
            }
        }

        System.out.println(sum);
    }
    /* Read 10 numbers from the console entered by the user
         & print the sum of those numbers.
     Create a Scanner like we did in the previous video.
     Use the hasNextInt() method from scanner to check if the
         user has entered a valid value.
     if hasNextInt() returns false, print the message "Invalid Number".
         Continue until you have read 10 numbers.
     Use the nextInt() method to get the number and add it to the sum.
     Before the user enters each number, print the message:
         "Enter number #x:",
         where x represents the count, i.e. 1, 2, 3, 4, etc.
     For example, the first message printed to the user would be
         "Enter number #1:",
         the next would be
         "Enter number #2:",
         and so on. */
}
