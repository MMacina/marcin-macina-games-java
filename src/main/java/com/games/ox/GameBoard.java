package com.games.ox;

import java.util.Scanner;

public class GameBoard {

    public static void printGameBoard(char[][] gameBoard) {
        int gameBoardSize = gameBoard.length;

        System.out.print("\t" + " ");
        for (int i = 0; i < gameBoardSize; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int row = 0; row < gameBoardSize; row++) {
            System.out.print(row + "\t" + "|");
            for (int column = 0; column < gameBoardSize; column++) {
                System.out.print(gameBoard[row][column] + "|");
            }
            System.out.println();
        }
    }
}
