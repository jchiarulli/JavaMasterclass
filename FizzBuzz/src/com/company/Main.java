package com.company;

public class Main {

    public static void main(String[] args) {
        String[] myStringArray = new String[100];

        for (int i = 0; i < myStringArray.length; i++) {
            if ((i + 1) % 3 == 0 && (i + 1) % 5 != 0) {
                myStringArray[i] = "Fizz";
            } else if ((i + 1) % 5 == 0 && (i + 1) % 3 != 0) {
                myStringArray[i] = "Buzz";
            } else if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
                myStringArray[i] = "FizzBuzz";
            } else {
                myStringArray[i] = "";
            }

            if (i == myStringArray.length-1) {
                System.out.print("\"" + myStringArray[i] + "\"");
            } else {
                System.out.print("\"" + myStringArray[i] + "\"" + ",");
            }
        }
    }
}
