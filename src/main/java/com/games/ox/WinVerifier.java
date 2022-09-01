package com.games.ox;

public class WinVerifier {

    public static boolean winCheck(char[][] board, char player) {
        if (winCheckInRows(board, player) || winCheckInColumns(board, player) || winCheckDiagonalUpToDown(board, player) || winCheckDiagonalDownToUp(board, player)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean winCheckInRows(char[][] board, char player) {
        if (board.length == 3) {
            for (int row = 0; row < board.length; row++) {
                boolean win = true;
                for (int column = 0; column < board.length; column++) {
                    if (board[row][column] != player) {
                        win = false;
                        break;
                    }
                }
                if (win) {
                    return true;
                }
            }
            return false;
        } else {
            for (int row = 0; row < board.length; row++) {
                boolean win = false;
                for (int column = 0; column < board.length - 5; column++) {
                    if ((board[row][column]) == player &&
                            (board[row][column + 1]) == player &&
                            (board[row][column + 2]) == player &&
                            (board[row][column + 3]) == player &&
                            (board[row][column + 4]) == player) {
                        win = true;
                        break;
                    }
                }
                if (win) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean winCheckInColumns(char[][] board, char player) {
        if (board.length == 3) {
            for (int column = 0; column < board.length; column++) {
                boolean win = true;
                for (int row = 0; row < board.length; row++) {
                    if (board[row][column] != player) {
                        win = false;
                        break;
                    }
                }
                if (win) {
                    return true;
                }
            }
            return false;
        } else {
            for (int column = 0; column < board.length; column++) {
                boolean win = false;
                for (int row = 0; row < board.length - 5; row++) {
                    if ((board[row][column]) == player &&
                            (board[row + 1][column]) == player &&
                            (board[row + 2][column]) == player &&
                            (board[row + 3][column]) == player &&
                            (board[row + 4][column]) == player) {
                        win = true;
                        break;
                    }
                }
                if (win) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean winCheckDiagonalUpToDown(char[][] board, char player) {
        if (board.length == 3) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][i] != player) {
                    return false;
                }
            }
            return true;
        } else {
            for (int i = 0; i < board.length - 5; i++) {
                if (board[i][i] == player &&
                        board[i + 1][i + 1] == player &&
                        board[i + 2][i + 2] == player &&
                        board[i + 3][i + 3] == player &&
                        board[i + 4][i + 4] == player) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean winCheckDiagonalDownToUp(char[][] board, char player) {
        if (board.length == 3) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][board.length - 1 - i] != player) {
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }
    }
}
