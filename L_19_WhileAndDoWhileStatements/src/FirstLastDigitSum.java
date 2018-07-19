public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(10));
        System.out.println("______");
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println("______");
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println("______");
        System.out.println(sumFirstAndLastDigit(11));
    }

    // Write a method named sumFirstAndLastDigit with 1 int parameter,
        //  number.
    // The method needs to find the first and last digit of the
        // parameter number passed to the method, using a loop,
        // and return the sum of the first and last digit of that number.
    // If the number is negative, return -1
    public static int sumFirstAndLastDigit(int number) {
        // Validate
        if (number < 0) {
            return -1;
        }
        // initialize the first and last numbers.
        int firstNum = 0;
        int lastNum = number % 10;
        System.out.println("Last number: " + lastNum);
        System.out.println("our number before the loop: " + number);
        // loop through our number to find the first number.
        while (number > 0) {
            if (number - 9 >= 1) {
                number /= 10;
                System.out.println("Number: " + number);
            } else {
                firstNum = number;
                System.out.println("first number: " + firstNum);
                break;
            }

        }
        int sum = firstNum + lastNum;
        return sum;
    }
}
