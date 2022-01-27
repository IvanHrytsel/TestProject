package com.company;

public class Main {
    private static String state;

    public static void main(String[] args) {
        String stuffStatus = doStuff();
        if (isStuffDone()) {
            state = "cool";
        }
        System.out.println(state);
        if (1 == 1) {
            state = "Still checks out";
        }
    }

    private static String doStuff() {
        return "Stuff done";
    }

    private static boolean isStuffDone() {
        return true;
    }
}
