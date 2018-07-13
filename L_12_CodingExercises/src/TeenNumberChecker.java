public class TeenNumberChecker {

    public static void main(String[] args) {
        hasTeen(9,99,19);
        hasTeen(23, 15, 42);
        hasTeen(22, 23, 34);
    }
    // Write a method that determines if the group of numbers includes a teen.
    public static boolean hasTeen(int num1, int num2, int num3) {
        if (num1 >= 13 && num1 <= 19 || num2 >= 13 && num2 <= 19 || num3 >= 13 && num3 <= 19) {
            return true;
        }
        return false;
    }
}