import java.sql.SQLOutput;

public class NumberToWords {
    public static void main(String[] args) {
         getDigitCount(0);
         getDigitCount(123);
         getDigitCount(-12);
         getDigitCount(5200);
        System.out.println("------------");
         reverse(-121);
         reverse(1212);
         reverse(1234);
         reverse(100);
        System.out.println("------------");
        numberToWords(123);
        System.out.println("------------");
        numberToWords(1010);
        System.out.println("------------");
        numberToWords(10500);
        System.out.println("------------");
        numberToWords(-12);

    }

    // Write a method called numberToWords with one int parameter, number.
    // The method needs to print out hte passed number using words for the digits.
    // If the number is negative, print "Invalid Value".

    public static void numberToWords(int number) {
        // verification
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        // get the number and reverse it.
        int num = reverse(number);

        // loop through the number.
        // How many times are we going to loop?
        int cap = getDigitCount(num);
        int length = getDigitCount(number);

        int lastNumber;
        for (int i = 0; i < cap; i++) {
            lastNumber = num % 10;
            num /= 10;
        //    oneWord(lastNumber);
            String toWord;
            switch (lastNumber) {
                case 0:
                    toWord = "Zero";
                    break;
                case 1:
                    toWord = "One";
                    break;
                case 2:
                    toWord = "Two";
                    break;
                case 3:
                    toWord = "Three";
                    break;
                case 4:
                    toWord = "Four";
                    break;
                case 5:
                    toWord = "Five";
                    break;
                case 6:
                    toWord = "Six";
                    break;
                case 7:
                    toWord = "Seven";
                    break;
                case 8:
                    toWord = "Eight";
                    break;
                case 9:
                    toWord = "Nine";
                    break;
                default:
                    toWord = "Invalid Number";
                    break;
            } // <~ Switch statement
            System.out.println(toWord);
        }
        if ( cap < length ) {
            for (int i = length; i > cap; i--) {
                // oneWord(0);
                System.out.println("Zero");
            }
        }
    }

    // I decided to make this into it's own method.
        // THE USE/ADDITION OF AN EXTRA METHOD IS NOT ALLOWED
    // sucks because this definitely made my code up top easier to read
//    public static String oneWord(int num1){
//        String toWord;
//        switch (num1) {
//            case 0:
//                toWord = "Zero";
//                break;
//            case 1:
//                toWord = "One";
//                break;
//            case 2:
//                toWord = "Two";
//                break;
//            case 3:
//                toWord = "Three";
//                break;
//            case 4:
//                toWord = "Four";
//                break;
//            case 5:
//                toWord = "Five";
//                break;
//            case 6:
//                toWord = "Six";
//                break;
//            case 7:
//                toWord = "Seven";
//                break;
//            case 8:
//                toWord = "Eight";
//                break;
//            case 9:
//                toWord = "Nine";
//                break;
//            default:
//                toWord = "Invalid Number";
//                break;
//        } // <~ Switch statement
//        System.out.println(toWord);
//        return toWord;
//    }

    // reverse method to help out with my numberToWords method
    // The reverse method should also reverse negative numbers.

    public static int reverse(int number) {
        // duplicate number to handle negatives.
        int num = number;
        if (number < 0) {
            num *= -1;
        }

        // reversed number
        int reversedNumber = 0;

        // loop to add the last digit in num to reversedNumber.
        // how many times are we looping?
        int count = 0;
        int peak = getDigitCount(num);

        while (count < peak) {
            reversedNumber *= 10;
            reversedNumber += (num % 10);
            num /= 10;
            count++;
        }

        // turn the number back into a negative if need be.
        if (number < 0) {
            reversedNumber *= -1;
        }
        return reversedNumber;

    }

    // This method has one parameter, number, and returns the count of digits
    // in that number.
    // if the number is negative, return -1.
    public static int getDigitCount(int number) {
        // verification
        if (number < 0) {
            return -1;
        }
        // initialize counter.
        int digitCount = 0;
        // let's increment with conditions.
        while (number / 10 >= 1) {
            digitCount++;
            number /= 10;
        }
        digitCount++;
        return digitCount;
    }
}
