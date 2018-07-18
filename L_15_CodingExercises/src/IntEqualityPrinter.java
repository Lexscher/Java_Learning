public class IntEqualityPrinter {
    public static void main(String[] args) {
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,1);
        printEqual(1,2,3);
    }

    // Write a method printEqual with 3 parameters of type int.
    // if one of the parameters are less than 0, print text "Invalid Value".
    // This method should not return anything.
    // If all numbers are equal, print text "All numbers are equal".
    // if all numbers are different print text "All numbers are different".
    // Otherwise, print "Neither all are equal or different".

    public static void printEqual(int uno, int dos, int tres) {
        if (uno < 0 || dos < 0 || tres < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (uno == dos && dos == tres) {
            System.out.println("All numbers are equal");
        } else if (uno != dos && dos != tres && tres != uno) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
