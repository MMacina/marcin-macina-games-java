package com.games.ox;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class GamePlay {
    // TODO
    //  define loop condition (game condition)
    //  set computer as one of players

    public static void playGame(char[][] gameBoard) {

        char currentPlayer = 'X';
        int roundCounter = 0;

        while (true) {

            System.out.println("Player: " + currentPlayer + ", please choose your position by choosing number of row (0 - " + (gameBoard.length - 1) + ")...");
            int row = InputVerifier.numberConverter(gameBoard.length);

            System.out.println("and number of column (0 - " + (gameBoard.length - 1) + ")...");
            int column = InputVerifier.numberConverter(gameBoard.length);

            boolean positionCheck = (gameBoard[row][column] == 0);
            if (!positionCheck) {
                System.out.println("Position unavailable, please choose empty position...");
                continue;
            }

            gameBoard[row][column] = currentPlayer;
            GameBoard.printGameBoard(gameBoard);

            roundCounter++;
            if (roundCounter == (gameBoard.length * gameBoard.length)) {
                System.out.println("This round ended in a draw.");
                break;
            }

            boolean winCheck = WinVerifier.winCheck(gameBoard, currentPlayer);
            if (winCheck) {
                System.out.println("Player " + currentPlayer + " wins this game. Congratulation !!!");
                break;
            } else {

                currentPlayer = currentPlayer == 'X' ? 'O' : 'X';
            }
        }
    }
}
