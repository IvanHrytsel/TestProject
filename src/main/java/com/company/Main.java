package com.company;

public class Main {
    private static String state;

    public static void main(String[] args) {
        doStuff();
        if (isStuffDone()) {
            state = "cool";
        }
    }

    private static String doStuff() {
        return "Stuff done";
    }

    private static boolean isStuffDone() {
        return true;
    }
}
