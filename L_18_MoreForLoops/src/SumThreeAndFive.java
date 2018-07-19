public class SumThreeAndFive {
    public static void main(String[] args) {
        // Create a for statement using a range of numbers from 1 to 1000.
        // sum all the numbers that can be divided with both 3 and also with 5.
        // Print out the numbers that met the conditions above
        int count = 0;
        int n = 0;
        for (int i = 50; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;

                System.out.println("number: " + i);
                n += i;
                System.out.println("Sum of numbers = " + n);
                System.out.println("count: " + count);
            }
            // if you've met the condition above seven times, exit the loop.
            if (count == 7) {
                break;
            }
        }
    }
}
