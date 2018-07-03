package com.alexanderschelchere;

public class Main {

    public static void main(String[] args) {

    // 1.
    byte coolByte = 10;
    short coolShort = 20;
    int coolInt = 50;
    long coolLong = 50000L + 10L * (coolByte + coolShort + coolInt);

    short coolShortTotal = (short) (1000 + 10 * (coolByte + coolShort + coolInt));
    // prints 50800
    System.out.println(coolLong);

    // prints 1800
    System.out.println(coolShortTotal);






    }
}
