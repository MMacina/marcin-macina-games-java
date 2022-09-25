package com.games.ox;

public class OxRun {
    public static void main(String[] args) {

        System.out.println("Please define the size of a Game Board (3 or 10)...");
        int gameBoardSize = InputVerifier.gameBoardSizeConverter();
        char[][] gameBoard = new char[gameBoardSize][gameBoardSize];

        GameBoard.printGameBoard(gameBoard);
        System.out.println();

        GamePlay.playGame(gameBoard);
        System.out.println();
    }
}
