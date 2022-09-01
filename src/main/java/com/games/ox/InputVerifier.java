package com.games.ox;

import java.util.Scanner;

public class InputVerifier {

    public static int gameBoardSizeConverter() {

        while(true) {
            String gameBoardSize = new Scanner(System.in).nextLine();
            try {
                int number = Integer.parseInt(gameBoardSize);
                if (!(number == 3 || number == 10)) {
                    System.out.println("Incorrect Game Board size, please enter correct size");
                    continue;
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect value, please provide only numbers");
            }
        }
    }

    public static int numberConverter(int maxValue) {

        while(true) {
            String coordinates = new Scanner(System.in).nextLine();
            try {
                int number = Integer.parseInt(coordinates);
                if (!(number >= 0 && number <maxValue)) {
                    System.out.println("Coordinates out of boundaries, please enter correct coordinates");
                    continue;
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect value, please provide only numbers");
            }
        }
    }
}
