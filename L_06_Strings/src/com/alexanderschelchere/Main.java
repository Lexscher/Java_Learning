package com.alexanderschelchere;

public class Main {

    public static void main(String[] args) {
	    String myString = "Yes honey. This is a string.";
        System.out.println("My string is '" + myString + "'.");

        myString += " \u00A9 2018";
        System.out.println("My string is '" + myString + "'.");

        String computerSays = "...Very cool, alex...";
        System.out.println(computerSays);

        String alexSays = "Thank You!";
        System.out.println(alexSays);

        String theSadTruth = "Yeah.. That was sarcasm...";
        System.out.println(theSadTruth);

        System.out.println('\u2639');

        String numberString = "250.53";
        numberString += "49.95"; // <~ This would just concatenate the two strings. Nice Try, Tim!
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString += myInt; // <~ integer, myInt, gets converted into a string in order to concatenate it with a string.
        System.out.println(lastString);


    }
}
