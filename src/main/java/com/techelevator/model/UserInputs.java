package com.techelevator.model;

import java.util.Scanner;

public class UserInputs {

    private double time;
   // private boolean hasEaten;

    public UserInputs(double time) {
        this.time = time;
    }

    public double inputParser(String numberEntered) {
        time = Double.parseDouble(numberEntered);
        return this.time;
    }

    public String hoursInput(Scanner userInput) {
        String hours = userInput.nextLine();
        return hours;
    }

    public static String adviceString (double input) {

        return null;
    }

    public double getTime() {
        return time;
    }
}
