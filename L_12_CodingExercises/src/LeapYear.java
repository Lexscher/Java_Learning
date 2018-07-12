public class LeapYear {

    public static void main(String[] args) {

    }
    // Write a method isLeapYear with a parameter of type int, named year.
    public static boolean isLeapYear(int year) {

        // the parameter needs to be greater than or equal to 1 and less than or equal to 9999.
        if (!(year >= 1 && year <= 9999)) {
            return false;
        }

        // calculate if the year is a leap year and return true if it is.
        if (year % 4 == 0) {
            if (year % 400 == 0) {
                return true;
            } else if (year % 100 == 0) {
                return false;
            }
            return true;
        }

        // otherwise return false.
        return false;
    }
}
