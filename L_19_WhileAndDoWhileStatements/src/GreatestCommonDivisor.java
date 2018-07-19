public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }

    // Write a method named getGreatestCommonDivisor with two int params,
        // first and second
    // if one of the params are less than 10, return -1.
    // this should return the greatest common divisor of the two numbers.
    public static int getGreatestCommonDivisor(int first, int second) {
        // validate.
        if (first < 10 || second < 10) {
            return -1;
        }
        // try to divide both of these fellas by this number.
        int divisor;
        if (first < second) {
            divisor = first;
        } else if (first > second) {
            divisor = second;
        } else {
            divisor = first;
        }
        // loop!
        while (!(first % divisor == 0 && second % divisor == 0)) {
            divisor--;
        }
        return divisor;
    }
}
