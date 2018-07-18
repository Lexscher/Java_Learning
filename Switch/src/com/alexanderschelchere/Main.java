package com.alexanderschelchere;

public class Main {

    public static void main(String[] args) {
        // if statements
	    int value = 1;
	    if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        // Switch statement

        int switchValue = 3;

	    switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3 or 4 or a 5");
                System.out.println("was a " + switchValue + " to be exact.");
                break;
            default:
                System.out.println("Was not numbers 1 through 5");
                break;
        }
    }
}
