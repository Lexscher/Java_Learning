public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    // Write a method named printFactors with one int parameter, number.
    // Verify that number is greater than one, else print "Invalid Value".
    // The method should print all the factors of the number.

    public static void printFactors(int number) {
        // Verification
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }
        // incrementer
        int count = 1;
        // Loop through all the possible factors
        while (count <= number) {
            if (number % count == 0) {
                System.out.println(count);
            }
            count++;
        }

    }
}
