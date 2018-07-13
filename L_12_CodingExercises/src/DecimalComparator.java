public class DecimalComparator {

    public static void main(String[] arg) {
        areEqualByThreeDecimalPlaces(-3.1756, -3.1767);
        areEqualByThreeDecimalPlaces(4.0, 5.0);
    }

    // Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
    public static boolean areEqualByThreeDecimalPlaces(double doubleOne, double doubleTwo) {

        System.out.println("Doubles: " + doubleOne + " and " + doubleTwo);
        if (doubleOne > 0 && doubleTwo > 0 ) {
            // A boolean that will tell us if the items are still true.
            boolean stillTrue = true;
            // Turn these doubles into strings.
            String newOne = doubleOne + "";
            String newTwo = doubleTwo + "";
            System.out.println(newOne);
            // turn them strings into arrays.
            String[] arrOne = newOne.split("");
            String[] arrTwo = newTwo.split("");
            System.out.println(arrOne[0]);
            // Compare the arrays!

            for (int i = 0; i < 5; i++) {
                System.out.println("array one: " + arrOne[i] + " array two: " + arrTwo[i]);
                if (arrOne[i].equals(arrTwo[i])) {
                    stillTrue = true;
                    System.out.println("these guys are the same: " + arrOne[i] + " and " + arrTwo[i]);
                    System.out.println(stillTrue);
                } else if (!(arrOne[i].equals(arrTwo[i]))) {
                    stillTrue = false;
                    System.out.println(stillTrue);
                    return false;
                }

            }
            return stillTrue;

        } else if (doubleOne < 0 && doubleTwo < 0) {
            // A boolean that will tell us if the items are still true.
            boolean stillTrue = true;
            // Turn these doubles into strings.
            String newOne = doubleOne + "";
            String newTwo = doubleTwo + "";
            System.out.println(newOne);
            // turn them strings into arrays.
            String[] arrOne = newOne.split("");
            String[] arrTwo = newTwo.split("");
            System.out.println(arrOne[0]);
            // Compare the arrays!

            for (int i = 0; i < 6; i++) {
                System.out.println("array one: " + arrOne[i] + " array two: " + arrTwo[i]);
                if (arrOne[i].equals(arrTwo[i])) {
                    stillTrue = true;
                    System.out.println("these guys are the same: " + arrOne[i] + " and " + arrTwo[i]);
                    System.out.println(stillTrue);
                } else if (!(arrOne[i].equals(arrTwo[i]))) {
                    stillTrue = false;
                    System.out.println(stillTrue);
                    return false;
                }

            }
            return stillTrue;

        } else if (doubleOne == 0 && doubleTwo == 0) {
            return true;
        }

        return false;

    }
}
