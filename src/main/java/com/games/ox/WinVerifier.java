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
            //[0][0] - [9][9]
            for (int i = 0; i < board.length - 5; i++) {
                if (board[i][i] == player &&
                        board[i+1][i+1] == player &&
                        board[i+2][i+2] == player &&
                        board[i+3][i+3] == player &&
                        board[i+4][i+4] == player) {
                    return true;
                }
            }
            //[0][1] - [8][9]
            for (int i = 1; i < board.length - 5; i++) {
                if (board[i-1][i] == player &&
                        board[i][i+1] == player &&
                        board[i+1][i+2] == player &&
                        board[i+2][i+3] == player &&
                        board[i+3][i+4] == player) {
                    return true;
                }
            }
            //[1][0] - [9][8]
            for (int i = 1; i < board.length - 5; i++) {
                if (board[i][i-1] == player &&
                        board[i+1][i] == player &&
                        board[i+2][i+1] == player &&
                        board[i+3][i+2] == player &&
                        board[i+4][i+3] == player) {
                    return true;
                }
            }
            //[0][2] - [7][9]
            for (int i = 1; i <= 4; i++) {
                if (board[i-1][i+1] == player &&
                        board[i][i+2] == player &&
                        board[i+1][i+3] == player &&
                        board[i+2][i+4] == player &&
                        board[i+3][i+5] == player) {
                    return true;
                }
            }
            //[2][0] - [9][7]
            for (int i = 1; i <= 4; i++) {
                if (board[i+1][i-1] == player &&
                        board[i+2][i] == player &&
                        board[i+3][i+1] == player &&
                        board[i+4][i+2] == player &&
                        board[i+5][i+3] == player) {
                    return true;
                }
            }
            //[0][3] - [6][9]
            for (int i = 1; i <= 3; i++) {
                if (board[i-1][i+2] == player &&
                        board[i][i+3] == player &&
                        board[i+1][i+4] == player &&
                        board[i+2][i+5] == player &&
                        board[i+3][i+6] == player) {
                    return true;
                }
            }
            //[3][0] - [9][6]
            for (int i = 1; i <=3; i++) {
                if (board[i+2][i-1] == player &&
                        board[i+3][i] == player &&
                        board[i+4][i+1] == player &&
                        board[i+5][i+2] == player &&
                        board[i+6][i+3] == player) {
                    return true;
                }
            }
            //[0][4] - [5][9]
            for (int i = 1; i <= 2; i++) {
                if (board[i-1][i+3] == player &&
                        board[i][i+4] == player &&
                        board[i+1][i+5] == player &&
                        board[i+2][i+6] == player &&
                        board[i+3][i+7] == player) {
                    return true;
                }
            }
            //[4][0] - [9][5]
            for (int i = 1; i <=2; i++) {
                if (board[i+3][i-1] == player &&
                        board[i+4][i] == player &&
                        board[i+5][i+1] == player &&
                        board[i+6][i+2] == player &&
                        board[i+7][i+3] == player) {
                    return true;
                }
            }
            //[0][5] - [9][4]
            if (board[0][5] == player &&
                    board[1][6] == player &&
                    board[2][7] == player &&
                    board[3][8] == player &&
                    board[4][9] == player) {
                return true;
            }
            //[5][0] - [4][9]
            if (board[5][0] == player &&
                    board[6][1] == player &&
                    board[7][2] == player &&
                    board[8][3] == player &&
                    board[9][4] == player) {
                return true;
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
            //[4][0] - [0][4]
            if (board[4][0] == player &&
                    board[3][1] == player &&
                    board[2][2] == player &&
                    board[1][3] == player &&
                    board[0][4] == player) {
                return true;
            }
            //[5][0] - [0][5]
            for (int i = 1; i <=2; i++) {
                if (board[6-i][i-1] == player &&
                        board[5-i][i] == player &&
                        board[4-i][i+1] == player &&
                        board[3-i][i+2] == player &&
                        board[2-i][i+3] == player) {
                    return true;
                }
            }
            //[6][0] - [0][6]
            for (int i = 1; i <=3; i++) {
                if (board[7-i][i-1] == player &&
                        board[6-i][i] == player &&
                        board[5-i][i+1] == player &&
                        board[4-i][i+2] == player &&
                        board[3-i][i+3] == player) {
                    return true;
                }
            }
            //[7][0] - [0][7]
            for (int i = 1; i <=4; i++) {
                if (board[8-i][i-1] == player &&
                        board[7-i][i] == player &&
                        board[6-i][i+1] == player &&
                        board[5-i][i+2] == player &&
                        board[4-i][i+3] == player) {
                    return true;
                }
            }
            //[8][0] - [0][8]
            for (int i = 1; i <=5; i++) {
                if (board[9-i][i-1] == player &&
                        board[8-i][i] == player &&
                        board[7-i][i+1] == player &&
                        board[6-i][i+2] == player &&
                        board[5-i][i+3] == player) {
                    return true;
                }
            }
            //[9][0] - [0][9]
            for (int i = 1; i <=6; i++) {
                if (board[10-i][i-1] == player &&
                        board[9-i][i] == player &&
                        board[8-i][i+1] == player &&
                        board[7-i][i+2] == player &&
                        board[6-i][i+3] == player) {
                    return true;
                }
            }
            //[9][1] - [1][9]
            for (int i = 1; i <=5; i++) {
                if (board[10-i][i] == player &&
                        board[9-i][i+1] == player &&
                        board[8-i][i+2] == player &&
                        board[7-i][i+3] == player &&
                        board[6-i][i+4] == player) {
                    return true;
                }
            }
            //[9][2] - [2][9]
            for (int i = 1; i <=4; i++) {
                if (board[10-i][i+1] == player &&
                        board[9-i][i+2] == player &&
                        board[8-i][i+3] == player &&
                        board[7-i][i+4] == player &&
                        board[6-i][i+5] == player) {
                    return true;
                }
            }
            //[9][3] - [3][9]
            for (int i = 1; i <=3; i++) {
                if (board[10-i][i+2] == player &&
                        board[9-i][i+3] == player &&
                        board[8-i][i+4] == player &&
                        board[7-i][i+5] == player &&
                        board[6-i][i+6] == player) {
                    return true;
                }
            }
            //[9][4] - [4][9]
            for (int i = 1; i <=2; i++) {
                if (board[10-i][i+3] == player &&
                        board[9-i][i+4] == player &&
                        board[8-i][i+5] == player &&
                        board[7-i][i+6] == player &&
                        board[6-i][i+7] == player) {
                    return true;
                }
            }
            //[9][5] - [5][9]
            if (board[9][5] == player &&
                    board[8][6] == player &&
                    board[7][7] == player &&
                    board[6][8] == player &&
                    board[5][9] == player) {
                return true;
            }
            return false;
        }
    }
}
