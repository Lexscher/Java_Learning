public class SumOdd {
    public static void main(String[] args) {

    }

    // Write a method, isOdd, with an int parameter, number.
    // The method needs to return boolean.
    // Verify that the number is greater than Zero.
    // IF the number is odd, return true. Otherwise, return false.

    public static boolean isOdd(int number) {
        if (!(number > 0)) {
            return false;
        }
        if (!(number % 2 == 0)) {
            return true;
        }
        return false;
    }

    // Write another method, sumOfOdd, with 2 parameters, start and end (both int).
    // The method should loop to sum up all odd numbers in that range including the end and return the sum.
    // it should call the isOdd to check if that number is odd
    // end needs to be greater than or equal to start, and both start and end need to be greater than Zero.
    // if those conditions are not satisfied, return -1 from the method to indicate invalid input.
    public static int sumOfOdd(int start, int end) {
        if (!(start > 0) || !(end > 0)) {
            return -1;
        }
        if (!(end >= start)){
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

}
