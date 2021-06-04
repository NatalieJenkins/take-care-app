package com.techelevator;

import com.techelevator.model.UserInputs;

import java.util.Scanner;


public class TakeCare {


    public static void main(String[] args) {

        UserInputs timeInput = new UserInputs(0);
        Scanner userInput = new Scanner(System.in);

        System.out.println();
        System.out.println("*****************************WELCOME TO THE TAKE CARE APP!*****************************");
        System.out.println("Here to help you through these tough times and remind you when to take care of yourself.");
        System.out.println("*NOTE* >>>>> All answers may be input with whole integers OR decimals.");
        System.out.println();

        boolean shouldLoop = false;

        double sleep = 0;
        do {
            System.out.print("Please enter how many hours of sleep you received last night: ");
            String hoursOfSleep = timeInput.hoursInput(userInput);
            try {
                sleep = timeInput.inputParser(hoursOfSleep);
                shouldLoop = false;
            } catch (NumberFormatException e) {
                System.out.println("*****You must enter a number!*****");
                shouldLoop = true;
            }
        } while (shouldLoop);


            System.out.print("Now please enter how many minutes of exercise you've had in the past week (i.e. jog, " +
                    "brisk walk, yoga, sports, etc): ");
            String hoursOfExercise = userInput.nextLine();
            double exercise = timeInput.inputParser(hoursOfExercise);


            System.out.print("Now please enter how many hours of relaxation you've had in the past week " +
                    "(i.e. watching TV, meditation, taking a bath): ");
            String hoursOfRelaxation = userInput.nextLine();
            double relaxation = timeInput.inputParser(hoursOfRelaxation);


            System.out.print("Now please enter how many hours of fun you've had in the past week " +
                    "(i.e. gaming, creating, playing, socializing): ");
            String hoursOfFun = userInput.nextLine();
            double fun = timeInput.inputParser(hoursOfFun);


            System.out.print("Now please enter if you've eaten something in the past 6 hours (yes or no): ");
            String eatenRecently = userInput.nextLine();
            boolean eaten = true;
            if (eatenRecently.equalsIgnoreCase("yes")) {
                eaten = true;
            } else {
                eaten = false;
            }


            System.out.print("Now please enter your stress level today, using a scale of 1-10: ");
            String stressLevel = userInput.nextLine();
            double stress = timeInput.inputParser(stressLevel) * 20;

            System.out.println("****************************************************************************************");
            System.out.println();

            if ((sleep + exercise + relaxation + fun) > stress && eaten) {
                System.out.println("Overall, you're doing great! Keep pushing through, coding will NOT " +
                        "get the better of you this time.");
            } else if ((sleep + exercise + relaxation + fun) > stress && !eaten) {
                System.out.println("Overall, you're doing great! Go eat something though.");
            } else {
                System.out.println("Take care of yourself now");
            }


        
    }
}
