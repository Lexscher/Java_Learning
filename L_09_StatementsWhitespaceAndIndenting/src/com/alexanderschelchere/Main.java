package com.alexanderschelchere;

public class Main {

    public static void main(String[] args) {
        int myVariable=50; // <~ This whole line is a statement.
        myVariable++; // <~ Also a statement.
        System.out.println("This is " +
                myVariable +
                " a test"); // <~ Also a statement

        int anotherVariable = 50; myVariable--; System.out.println("This, here, is another statement, that is not conventional, but works still.");

        // I know. It looks like a hot mess on line 12. We won't ever have to see this again (hopefully).
    }
}
