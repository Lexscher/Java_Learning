public class PerfectNumber {
    public static void main(String[] args) {
        isPerfectNumber(6);
        isPerfectNumber(28);
        isPerfectNumber(5);
        isPerfectNumber(-1);
    }

    // Write a method named isPerfectNumber with one parameter, number (int).
    // verify that number is greater than 1.
    // The method must calculate if the number is perfect.
    // If the number is perfect, the method should return true, else return false.
    public static boolean isPerfectNumber(int number) {
        // verification
        if (number < 1) {
            return false;
        }

        // counter
        int count = 1;
        // sum
        int sum = 0;
        while (count < number) {
            if (number % count == 0) {
                sum = sum + count;
            }
            count++;
        }
        System.out.println(sum);
        if (sum == number) {
            return true;
        } else {
            return false;
        }
    }


}
