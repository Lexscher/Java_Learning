public class BarkingDog {

    public static void main(String[] args) {
        System.out.println(bark(true, 5));
        System.out.println(bark(true, 11));
        System.out.println(bark(false, 18));
    }

    // Write a method, bark, that has two parameters: barking (A boolean) & hourOfDay (int).
    // bark should return a boolean.
    public static boolean bark(boolean barking, int hourOfDay) {
        // hourOfDay has a valid range of 0 and 23.
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        // return false if the dog is not barking.
        if (!barking) {
            return false;
        }

        // If the dog is barking before the hours of 8 am and after 10 pm, return true.
        if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }

        // in all other cases, return false.
        return false;

    }
}
