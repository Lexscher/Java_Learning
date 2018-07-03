package com.alexanderschelchere;

public class Main {

    public static void main(String[] args) {
        // PRACTICE: Convert a given number of pounds to kilograms
        double pounds = 100.0;
        double kilos = 0.45359237;
        double conversion = pounds * kilos;

        System.out.println(conversion);
        pounds = 50;
        conversion = pounds * kilos;
        System.out.println(conversion);
        pounds = 25;
        conversion = pounds * kilos;
        System.out.println(conversion);
        pounds = 1;
        conversion = pounds * kilos;
        System.out.println(conversion);
        pounds = 400;
        conversion = pounds * kilos;
        System.out.println(conversion);

        double pi = 3.14159365d;
    }
}
