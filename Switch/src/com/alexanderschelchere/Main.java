package com.alexanderschelchere;

public class Main {

    public static void main(String[] args) {
        // CHALLENGE!
        // CREATE A NEW SWITCH STATEMENT USING CHAR INSTEAD OF INT
        // sorry for caps.
        // Create a new char variable
        // Create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found
        // add a default which displays a message saying not found.

        char waterDivination = 'G';

        switch (waterDivination) {
            case 'A':
                System.out.println("Your nen type is Enhancement");
                break;
            case 'B':
                System.out.println("Your nen type is Manipulation");
                break;
            case 'C':
                System.out.println("Your nen type is Emission");
                break;
            case 'D':
                System.out.println("Your nen type is Conjuration");
                break;
            case 'E':
                System.out.println("Your nen type is Transmutation");

            default:
                System.out.println("Your nen type is either undefined, or you are a Specialist...");
                System.out.println("If you are the latter... Have fun :)");
                break;
        }

        String month = "JANUARY";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("dunno...");
                break;
        }

    }
}
