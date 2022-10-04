package com.games.rps;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class RpsInputVerifier {

    public int roundsInputVerifier() {

        while(true) {
            String roundsAmount = new Scanner(System.in).nextLine();
            try {
                int rounds = Integer.parseInt(roundsAmount);
                return rounds;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input, please provide only numbers");
            }
        }
    }

    public void cancelOrReStartGame(String inputVerifier) {
        if (inputVerifier.equals("x")) {
            System.out.println("Do you really want to end this game?. (y - Yes, n - no)");
            if(areYouSure()) {
                System.exit(0);
            } else {
                return;
            }
        } else if (inputVerifier.equals("z")) {
            System.out.println("Do you really want to end this game and start new one?. (y - Yes, n - no)");
            if (areYouSure()) {
                RpsRunner rpsRunner = new RpsRunner();
                rpsRunner.runGame();
                System.exit(0);
            } else {
                return;
            }
        }
    }
    public boolean areYouSure() {
        while (true) {
            String answer = new Scanner(System.in).nextLine();
            if (answer.equals("y")) {
                return true;
            } else if (answer.equals("n")) {
                return false;
            }
            System.out.println("Wrong answer, provide only \"y\" or \"n\"");
        }
    }

    public int playInputVerifier() {
        while(true) {
            String inputVerifier = new Scanner(System.in).nextLine();
            cancelOrReStartGame(inputVerifier);
            try {
                int input = Integer.parseInt(inputVerifier);
                if (!(input == 1 || input == 2 || input == 3)) {
                    System.out.println("Input out of boundaries");
                    continue;
                }
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input, please provide only numbers from 1 to 3");
            }
        }
    }
}
