import java.sql.SQLOutput;
import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // min and max
        int min = 0;
        int max = 0;
        // count
        int count = 0;
        int middleGround;
        while (true) {
            System.out.println("---" + count);
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                if (count == 0) {
                        min = scanner.nextInt();
                        max = min;
                        System.out.println(min + " | " + max);
                        count++;
                        continue;
                }

                middleGround = scanner.nextInt();
                if (middleGround < min) {
                    min = middleGround;
                }
                if (middleGround > max) {
                    max = middleGround;
                }
                System.out.println(min + " |-| " + max);
                count++;
            } else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("MIN: " + min + " | MAX: " + max);
    }
    /* Read the numbers from the console entered by the user and print the
     minimum and maximum number the user has entered.
        Before the user enters the number, print the message "Enter number:"
        If the user enters an invalid number, break out of the loop and print
     the minimum and maximum number. */

}
