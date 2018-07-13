public class EqualSumChecker {

    public static void main(String[] args) {
        hasEqualSum(1,1,1);
        hasEqualSum(1,1,2);
    }
    // Write a method, hasEqualSum, with 3 parameters of type int.
    // This should return boolean and it needs to return true if the sum of
    // the first and second parameter is equal to the third parameter.
    public static boolean hasEqualSum(int num1, int num2, int num3){
        if (num1 + num2 == num3) {
            System.out.println("equal");
            return true;
        }
        System.out.println("not equal");
        return false;
    }
}
