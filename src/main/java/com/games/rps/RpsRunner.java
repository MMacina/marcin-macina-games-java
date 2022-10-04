package com.games.rps;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class RpsRunner {

    public void runGame() {

        System.out.println("Hello Player, please enter your name...");
        String playerName = new Scanner(System.in).nextLine();

        RpsInputVerifier rpsInputVerifier = new RpsInputVerifier();
        System.out.println("Nice to meet you " + playerName + ". Please enter amount of rounds to win...");
        int winCondition = rpsInputVerifier.roundsInputVerifier();

        System.out.println("/GAME INSTRUCTIONS/\n" +
                "* Key \"1\" - is for Stone\n" +
                "* Key \"2\" - is for Paper\n" +
                "* Key \"3\" - is for Scissors\n" +
                "* Key \"x\" - is for end game\n" +
                "* Key \"z\" - is for end game and start new one\n");

        int roundCounter = 1;
        int winOfPlayer = 0;
        int winOfComputer = 0;

        while ((winOfPlayer < winCondition) && (winOfComputer < winCondition)) {
            System.out.println("\nRound " + roundCounter + "\n" + playerName + " , make your move...");

            int playersMove = rpsInputVerifier.playInputVerifier();
            int computerMove = new Random().nextInt(1, 3);

            if (playersMove != computerMove) {
                if ((playersMove == 1 && computerMove == 3) ||
                        (playersMove == 2 && computerMove == 1) ||
                        (playersMove == 3 && computerMove == 2)) {
                    winOfPlayer++;
                } else {
                    winOfComputer++;
                }
            }
            roundCounter++;

            System.out.println("Computer move was: " + computerMove + "\nWins of " + playerName + ": " + winOfPlayer + "," +
                    "\nWins of Computer: " + winOfComputer + ".");
        }
        if (winOfPlayer > winOfComputer) {
            System.out.println("\n!!!" + playerName + " wins this game!!!");
        } else {
            System.out.println("!!!Computer wins this game!!!");
        }
    }
}
