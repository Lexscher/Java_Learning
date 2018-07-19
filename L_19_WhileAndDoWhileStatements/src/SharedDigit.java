public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    // Write a method, hasSharedDigit, with two int parameters.
    // Each number should be within the range of 10 - 99 (both inclusive).
    // otherwise return false.
    // return true if there's a digit that appears in both numbers.
    public static boolean hasSharedDigit(int one, int two) {
        // validate.
        if (one < 10 || one > 99 || two < 10 || two > 99) {
            return false;
        }
        // get the digits alone ;)
        int a1 = one / 10;
        int a2 = one % 10;
        int b1 = two / 10;
        int b2 = two % 10;
        // compare
        if (a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2) {
            return true;
        }
        return false;
    }
}
