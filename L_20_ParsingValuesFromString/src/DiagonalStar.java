public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
        System.out.println("----------------");
        printSquareStar(7);
        System.out.println("----------------");
        printSquareStar(8);
        System.out.println("----------------");
        printSquareStar(9);
    }

    // Write a method named printSquareStar with one parameter, number (int).
    // if the number is less than 5, print "invalid value".
    // The method should print diagonals to generate a rectangular pattern
    // composed of stars (*).

    public static void printSquareStar(int number) {
        // validations
        if (number < 5) {
            System.out.println("invalid value");
            return;
        }
        // count (row) tells us how many rows to make.
        int row = 1;
        // count (column) will tell us how many columns to make.
        int column = 1;
        while (row <= number) {
            while (column <= number) {
                // first and last rows, first and last columns
                if (row == 1 || row == number || column == 1 || column == number) {
                    System.out.print("*");
                }  else if ( (row == 2 || row == number - 1) && (column == 2 || column == number - 1) ) {  // <~ second and second to last
                    System.out.print("*");
                } else if (number % 2 == 0) {
                    // even
                        // middle columns
                        if ((column == number / 2 || column == (number / 2) + 1) && (row == number / 2 || row == (number / 2) + 1) ){
                            System.out.print("*");
                        } else if( (row == (number / 2)  - 1 || row == (number / 2)+ 2 ) && (column == (number / 2)  - 1 || column == (number / 2)+ 2 ) ) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }

                } else {
                    // odd
                        // middle column
                    if (column == (number / 2) + 1 && row == (number / 2) + 1) {
                        System.out.print("*");
                    } else if( (row == (number / 2) || row == (number / 2) + 2 ) && (column == (number / 2)  || column == (number / 2) + 2 ) ) {
                        System.out.print("*");
                    } else if ( (row == (number / 2) - 1 || row == (number / 2) + 3 ) && (column == (number / 2) - 1 || column == (number / 2) + 3 ) ){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                column++;
            }
            // reset column
            column = 1;
            System.out.println();
            row++;
        }
    }
}
