public class FlourPacker {
    public static void main(String[] args) {
        canPack(1, 0 , 4);
        System.out.println("-------");
        canPack(1, 0, 5);
        System.out.println("-------");
        canPack(0, 5, 4);
        System.out.println("-------");
        canPack(2, 2, 12);
        System.out.println("-------");
        canPack(-3, 2, 12);
    }
    // Write a method, canPack, with three parameters of type int.
    // bigCount - count of big flour bags (5 kilo each).
    // smallCount - count of small flour bags (1 kilo each).
    // goal - goal amounts of kilos of flour needed to assemble a package.

    // The sum of the kilos of bigCount and smallCount must be at least equal to
    // the value of goal.
    // The method should return true if it is possible to make a package with goal kilos of flour.

    // if the sum is greater than goal, insure that only full bags are used towards the goal amount.
    // for example: if goal = 9, bigCount = 2, and smallCount = 0, the method should return false
    // because each bigCount bag is 5 kilos and cannot be divided. if goal = 9, bigCount = 1, and smallCount = 5,
    // the method should return true because 1 full bigCount bag and 4 full smallCount bags = goal.
    // It's okay if there are additional bags left over.
    // if any of the parameters are negative, return false.

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // verification
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        // initialize our sum
        int sum = 0;

        // loop to increment sum
        while (sum <= goal) {
            // exit the loop if sum = goal.
            System.out.println("SUM: " + sum);
            if (sum == goal) {
                System.out.println("Yes");
                return true;
            }
            // conditional if we will add a big count or a small count.
            System.out.println("Big count: " + bigCount);
            if (goal / 5 >= bigCount) {
                if (bigCount > 0) {
                    sum += 5;
                    bigCount -= 1;
                }
            }
            System.out.println("Small count: " + smallCount);
            if (smallCount > 0) {
                sum += 1;
                smallCount -= 1;
            }
            System.out.println("SUM after: " + sum);
            System.out.println("Small count after: " + smallCount);
            if (sum == 0) {
                break;
            }

        }

        if (sum == goal) {
            System.out.println("Yes");
            return true;
        }

        System.out.println("no");
        return false;
    }


}
