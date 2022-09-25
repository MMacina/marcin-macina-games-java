package com.games.ox;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.lang.*;



class OxApplicationTestsSuite {
    @Nested
    @DisplayName("Tests for winning by O user.")
    class OWins {

        @Test
        @DisplayName("O wins to three in rows.")
        void OWinsToThreeInRows() {
            //Given
            char[][] board = new char[3][3];
            board[0][0] = 'O';
            board[0][1] = 'O';
            board[0][2] = 'O';

            //When
            boolean check = WinVerifier.winCheckInRows(board, 'O');

            //Then
            Assertions.assertTrue(check);
        }

        @Test
        @DisplayName("O wins to five in rows.")
        void OWinsToFiveInRows() {
            //Given
            char[][] board = new char[10][10];
            board[4][4] = 'O';
            board[4][5] = 'O';
            board[4][6] = 'O';
            board[4][7] = 'O';
            board[4][8] = 'O';
            board[4][9] = 'X';

            //When
            boolean check = WinVerifier.winCheckInRows(board, 'O');

            //Then
            Assertions.assertTrue(check);
        }

        @Test
        @DisplayName("O doesn't wins to five in rows.")
        void ODoesntWinsToFiveInRows() {
            //Given
            char[][] board = new char[10][10];
            board[4][4] = 'O';
            board[4][5] = '0';
            board[4][6] = 'X';
            board[4][7] = 'O';
            board[4][8] = 'O';
            board[4][9] = 'X';

            //When
            boolean check = WinVerifier.winCheckInRows(board, 'O');

            //Then
            Assertions.assertFalse(check);
        }

        @Test
        @DisplayName("O wins to three in column.")
        void OWinsToThreeInColumns() {
            //Given
            char[][] board = new char[3][3];
            board[0][1] = 'O';
            board[1][1] = 'O';
            board[2][1] = 'O';

            //When
            boolean check = WinVerifier.winCheckInColumns(board, 'O');

            //Then
            Assertions.assertTrue(check);
        }

        @Test
        @DisplayName("O wins to five in column.")
        void OWinsToFiveInColumns() {
            //Given
            char[][] board = new char[10][10];
            board[2][7] = 'O';
            board[3][7] = 'O';
            board[4][7] = 'O';
            board[5][7] = 'O';
            board[6][7] = 'O';

            //When
            boolean check = WinVerifier.winCheckInColumns(board, 'O');

            //Then
            Assertions.assertTrue(check);
        }

        @Test
        @DisplayName("O doesn't wins to five in column.")
        void ODoesntWinsToFiveInColumns() {
            //Given
            char[][] board = new char[10][10];
            board[2][7] = 'O';
            board[3][7] = 'O';
            board[4][7] = 'X';
            board[5][7] = 'O';
            board[6][7] = 'O';

            //When
            boolean check = WinVerifier.winCheckInColumns(board, 'O');

            //Then
            Assertions.assertFalse(check);
        }

        @Test
        @DisplayName("O wins to three in diagonal Up->Down.")
        void OWinsToThreeInDiagonalUpToDown() {
            //Given
            char[][] board = new char[3][3];
            board[0][0] = 'O';
            board[1][1] = 'O';
            board[2][2] = 'O';

            //When
            boolean check = WinVerifier.winCheckDiagonal(board, 'O');

            //Then
            Assertions.assertTrue(check);
        }

        @Test
        @DisplayName("O wins to five in diagonal Up->Down.")
        void OWinsToFiveInDiagonalUpToDown() {
            //Given
            char[][] board = new char[10][10];
            board[4][1] = 'O';
            board[5][2] = 'O';
            board[6][3] = 'O';
            board[7][4] = 'O';
            board[8][5] = 'O';

            //When
            boolean check = WinVerifier.winCheckDiagonal(board, 'O');

            //Then
            Assertions.assertTrue(check);
        }

        @Test
        @DisplayName("O doesn't wins to five in diagonal Up->Down.")
        void ODoesntWinsToFiveInDiagonalUpToDown() {
            //Given
            char[][] board = new char[10][10];
            board[4][1] = 'O';
            board[5][2] = 'X';
            board[6][3] = 'O';
            board[7][4] = 'O';
            board[8][5] = 'O';

            //When
            boolean check = WinVerifier.winCheckDiagonal(board, 'O');

            //Then
            Assertions.assertFalse(check);
        }

        @Test
        @DisplayName("O wins to three in diagonal Down->Up.")
        void OWinsToThreeInDiagonalDownToUp() {
            //Given
            char[][] board = new char[3][3];
            board[2][0] = 'O';
            board[1][1] = 'O';
            board[0][2] = 'O';

            //When
            boolean check = WinVerifier.winCheckDiagonal(board, 'O');

            //Then
            Assertions.assertTrue(check);
        }

        @Test
        @DisplayName("O wins to five in diagonal Down->Up.")
        void OWinsToFiveInDiagonalDownToUp() {
            //Given
            char[][] board = new char[10][10];
            board[9][5] = 'O';
            board[8][6] = 'O';
            board[7][7] = 'O';
            board[6][8] = 'O';
            board[5][9] = 'O';

            //When
            boolean check = WinVerifier.winCheckDiagonal(board, 'O');

            //Then
            Assertions.assertTrue(check);
        }

        @Test
        @DisplayName("O doesn't wins to five in diagonal Down->Up.")
        void ODoesntWinsToFiveInDiagonalDownToUp() {
            //Given
            char[][] board = new char[10][10];
            board[9][5] = 'O';
            board[8][6] = 'O';
            board[7][7] = 'O';
            board[6][8] = 'O';
            board[5][9] = 'X';

            //When
            boolean check = WinVerifier.winCheckDiagonal(board, 'O');

            //Then
            Assertions.assertFalse(check);
        }
    }

    @Nested
    @DisplayName("Tests for winning by X user.")
    class XWins {

        @Test
        @DisplayName("X wins to three in rows.")
        void XWinsToThreeInRows() {
            //Given
            char[][] board = new char[3][3];
            board[0][0] = 'X';
            board[0][1] = 'X';
            board[0][2] = 'X';

            //When
            boolean check = WinVerifier.winCheckInRows(board, 'X');

            //Then
            Assertions.assertTrue(check);
        }

        @Test
        @DisplayName("X wins to five in rows.")
        void XWinsToFiveInRows() {
            //Given
            char[][] board = new char[10][10];
            board[4][4] = 'X';
            board[4][5] = 'X';
            board[4][6] = 'X';
            board[4][7] = 'X';
            board[4][8] = 'X';
            board[4][9] = 'O';

            //When
            boolean check = WinVerifier.winCheckInRows(board, 'X');

            //Then
            Assertions.assertTrue(check);
        }

        @Test
        @DisplayName("X doesn't wins to five in rows.")
        void XDoesntWinsToFiveInRows() {
            //Given
            char[][] board = new char[10][10];
            board[4][4] = 'X';
            board[4][5] = 'X';
            board[4][6] = 'X';
            board[4][7] = 'X';
            board[4][8] = 'O';
            board[4][9] = 'X';

            //When
            boolean check = WinVerifier.winCheckInRows(board, 'X');

            //Then
            Assertions.assertFalse(check);
        }

        @Test
        @DisplayName("X wins to three in column.")
        void XWinsToThreeInColumns() {
            //Given
            char[][] board = new char[3][3];
            board[0][1] = 'X';
            board[1][1] = 'X';
            board[2][1] = 'X';

            //When
            boolean check = WinVerifier.winCheckInColumns(board, 'X');

            //Then
            Assertions.assertTrue(check);
        }

        @Test
        @DisplayName("X wins to five in column.")
        void XWinsToFiveInColumns() {
            //Given
            char[][] board = new char[10][10];
            board[2][7] = 'X';
            board[3][7] = 'X';
            board[4][7] = 'X';
            board[5][7] = 'X';
            board[6][7] = 'X';

            //When
            boolean check = WinVerifier.winCheckInColumns(board, 'X');

            //Then
            Assertions.assertTrue(check);
        }

        @Test
        @DisplayName("X doesn't wins to five in column.")
        void XDoesntWinsToFiveInColumns() {
            //Given
            char[][] board = new char[10][10];
            board[2][7] = 'X';
            board[3][7] = 'O';
            board[4][7] = 'X';
            board[5][7] = 'X';
            board[6][7] = 'X';

            //When
            boolean check = WinVerifier.winCheckInColumns(board, 'X');

            //Then
            Assertions.assertFalse(check);
        }

        @Test
        @DisplayName("X wins to three in diagonal Up->Down.")
        void XWinsToThreeInDiagonalUpToDown() {
            //Given
            char[][] board = new char[3][3];
            board[0][0] = 'X';
            board[1][1] = 'X';
            board[2][2] = 'X';

            //When
            boolean check = WinVerifier.winCheckDiagonal(board, 'X');

            //Then
            Assertions.assertTrue(check);
        }

        @Test
        @DisplayName("X wins to five in diagonal Up->Down.")
        void XWinsToFiveInDiagonalUpToDown() {
            //Given
            char[][] board = new char[10][10];
            board[4][1] = 'X';
            board[5][2] = 'X';
            board[6][3] = 'X';
            board[7][4] = 'X';
            board[8][5] = 'X';

            //When
            boolean check = WinVerifier.winCheckDiagonal(board, 'X');

            //Then
            Assertions.assertTrue(check);
        }

        @Test
        @DisplayName("X doesn't wins to five in diagonal Up->Down.")
        void XDoesntWinsToFiveInDiagonalUpToDown() {
            //Given
            char[][] board = new char[10][10];
            board[4][1] = 'O';
            board[5][2] = 'X';
            board[6][3] = 'X';
            board[7][4] = 'X';
            board[8][5] = 'X';

            //When
            boolean check = WinVerifier.winCheckDiagonal(board, 'X');

            //Then
            Assertions.assertFalse(check);
        }

        @Test
        @DisplayName("X wins to three in diagonal Down->Up.")
        void XWinsToThreeInDiagonalDownToUp() {
            //Given
            char[][] board = new char[3][3];
            board[2][0] = 'X';
            board[1][1] = 'X';
            board[0][2] = 'X';

            //When
            boolean check = WinVerifier.winCheckDiagonal(board, 'X');

            //Then
            Assertions.assertTrue(check);
        }

        @Test
        @DisplayName("X wins to five in diagonal Down->Up.")
        void XWinsToFiveInDiagonalDownToUp() {
            //Given
            char[][] board = new char[10][10];
            board[9][5] = 'X';
            board[8][6] = 'X';
            board[7][7] = 'X';
            board[6][8] = 'X';
            board[5][9] = 'X';

            //When
            boolean check = WinVerifier.winCheckDiagonal(board, 'X');

            //Then
            Assertions.assertTrue(check);
        }

        @Test
        @DisplayName("X doesn't wins to five in diagonal Down->Up.")
        void XDoesntWinsToFiveInDiagonalDownToUp() {
            //Given
            char[][] board = new char[10][10];
            board[9][5] = 'X';
            board[8][6] = 'O';
            board[7][7] = 'X';
            board[6][8] = 'X';
            board[5][9] = 'X';

            //When
            boolean check = WinVerifier.winCheckDiagonal(board, 'X');

            //Then
            Assertions.assertFalse(check);
        }
    }
}
