package com.company;

public class Main {

    public static void main(String[] args) {

        byte myByteValue = 88;
        short myShortValue = 30_000;
        int myIntValue = 2_000_000_000;
        long myNewLongValue = 50_000L + 10L * (myByteValue + myShortValue + myIntValue);
        System.out.println(myNewLongValue);

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50_000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);

        short shortTotal = (short) (1000 + 10 *
                (byteValue + shortValue + intValue));
        System.out.println(shortTotal);
    }
}
