package com.games.ox;

public class WinVerifier {

    public static boolean winCheck(char[][] board, char player) {
        if (winCheckInRows(board, player) || winCheckInColumns(board, player) || winCheckDiagonal(board, player)) {
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

    public static boolean winCheckDiagonal(char[][] board, char player) {

        if (board.length == 3) {
            if ((board[0][0] == player) &&
                    (board[1][1] == player) &&
                    (board[2][2] == player)) {
                return true;
            }

            if ((board[0][2] == player) &&
                    (board[1][1] == player) &&
                    (board[2][0] == player)) {
                return true;
            }

        } else {
            for (int r = 0; r < (board.length - 4); r++) {
                for (int c = 0; c < (board.length - 4); c++) {
                    if (board[r][c] == player &&
                            board[r + 1][c + 1] == player &&
                            board[r + 2][c + 2] == player &&
                            board[r + 3][c + 3] == player &&
                            board[r + 4][c + 4] == player) {
                        return true;
                    }
                }
            }

            for (int r = 0; r < (board.length - 4); r++) {
                for (int c = (board.length - 1); c > 3; c--) {
                    if (board[r][c] == player &&
                            board[r + 1][c - 1] == player &&
                            board[r + 2][c - 2] == player &&
                            board[r + 3][c - 3] == player &&
                            board[r + 4][c - 4] == player) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
