package com.alexanderschelchere;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {

        // Only takes one character strings. Single Quotes Only.
	    char myChar = '\u00A9'; // <~ A unicode character. This prints ©.

	    boolean myBoolean = true; // booleans can only be true or false.

        // PRACTICE: use the 'registered' symbol using unicode.
        char reg = '\u00AE';
        PrintStream printf = System.out.printf("let's get registered! %s%n", reg);
    }
}
