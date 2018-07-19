public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
    }

    // Write a method named hasSameLastDigit with 3 int parameters.
    // Should be within the range of 10 & 1000 (both inclusive).
        // otherwise return false.
    // the method should return true if at least two of the numbers
        // share the same rightmost digit; otherwise, return false.
    public static boolean hasSameLastDigit(int one, int two, int tres) {
        // validate
        if (one < 10 || one > 1000 || two < 10 || two > 1000 || tres < 10 || tres > 1000) {
            return false;
        }
        // get the last digits alone ;)
        int a = one % 10;
        int b = two % 10;
        int c = tres % 10;
        // conditionals
        if (a == b || b == c || a == c) {
            return true;
        }
        return false;
    }

}
