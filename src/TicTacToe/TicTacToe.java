package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    static final char[] arrayCharXO_ = {'X', 'O', '_'};
    char[][] arrayField = new char[3][3];

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TicTacToe ticTacToe = new TicTacToe();
        WinOrLose winOrLose = new WinOrLose();
        char[] arrayJ = new char[3];
        char[][] arrayFieldFlip = new char[3][3];
        String stringField;
        int iForArray = 0;
        boolean iBooleanXO_ = false;
        boolean booleanDash = false;
        int numberX;
        int numberO;

        // Построение поля
        do {
            numberX = 0;
            numberO = 0;
            System.out.print("Enter cells: ");
            stringField = s.nextLine();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++){
                    iBooleanXO_ = ticTacToe.examinationXO_(stringField.charAt(i));
                    if (iBooleanXO_) {break;}
                    if (stringField.charAt(iForArray) == '_') {booleanDash = true;}
                    if (stringField.charAt(iForArray) == 'X') {numberX++;}
                    if (stringField.charAt(iForArray) == 'O') {numberO++;}
                    ticTacToe.arrayField[i][j] = stringField.charAt(iForArray);
                    iForArray++;
                }
                if (iBooleanXO_) {break;}
            }
        } while (iBooleanXO_);

        // Запрос координат
        String coordinates;
        String a;
        String[] numbersCoordinates;
        boolean iBooleanFullMatrix = false;
        while (true) {
            ticTacToe.printArrayField();
            System.out.print("Enter the coordinates: ");
            coordinates = s.nextLine();
            if (coordinates.matches("\\w*[A-z]\\w*")) {
                System.out.println("You should enter numbers!");
                iBooleanFullMatrix = true;
                continue;
            } else if (coordinates.length() > 3 | !coordinates.matches("\\w*([1-3]\\s?[1-3])\\w*")) {
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }
            numbersCoordinates = coordinates.split("\\s*(\\s?)\\s*");
            ticTacToe.toWriteXO(numbersCoordinates);
            if (iBooleanFullMatrix) {
                if (ticTacToe.examinationFullMatrix()) {break;}
                iBooleanFullMatrix = false;
            }
        }

        // Проверка игры
        char[][] arrayFieldMain = ticTacToe.arrayField;
        arrayFieldFlip = ticTacToe.examinationFlipMatrix(arrayFieldFlip);
        boolean booleanNumberXO = numberX - 1 > numberO | numberO - 1 > numberX;

        boolean booleanArrayField1 = ticTacToe.examinationXO(winOrLose, arrayCharXO_[0], arrayFieldMain);
        if (!booleanArrayField1) {
            booleanArrayField1 = ticTacToe.examinationXO(winOrLose, arrayCharXO_[0], arrayFieldFlip);
        }
        boolean booleanArrayField2 = ticTacToe.examinationXO(winOrLose, arrayCharXO_[1], arrayFieldMain);
        if (!booleanArrayField2) {
            booleanArrayField2 = ticTacToe.examinationXO(winOrLose, arrayCharXO_[1], arrayFieldFlip);
        }
        if (!booleanArrayField1 & !booleanArrayField2 & booleanDash) {
            System.out.println("Game not finished");
        } else if (booleanNumberXO) {
            System.out.println("Impossible");
        } else if (booleanArrayField1) {
            System.out.println("Wins X");
        } else if (booleanArrayField2) {
            System.out.println("Wins O");
        } else {
            System.out.println("Draw");
        }

    }

    boolean examinationXO_(char charField) {
        for (int i = 0; i <= 2; i++) {
            if (charField == arrayCharXO_[i])
                return false;
        }
        return true;
    }

    boolean examinationXO(WinOrLose winOrLose, char charXO, char[][] arrayFieldXO) {
        char[] arrayJ = new char[3];
        boolean iBoolean;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrayJ[j] = arrayFieldXO[i][j];
            }
            iBoolean = winOrLose.examinationOneElement(arrayJ, charXO);
            if (iBoolean) {return true;}
        }
        return false;
    }

    char[][] examinationFlipMatrix(char[][] arrayFieldFlip) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrayFieldFlip[i][j] = arrayField[j][i];
            }
        }
        return arrayFieldFlip;
    }

    void toWriteXO(String[] numbersCoordinates) {
        String a = numbersCoordinates[0];
        String b = numbersCoordinates[1];
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);
        if (arrayField[aInt - 1][bInt - 1] == 'X' | arrayField[aInt - 1][bInt - 1] == 'O') {
            System.out.println("This cell is occupied! Choose another one!");
        } else if (a.matches("[1-3]") & b.matches("[1-3]")) {
            arrayField[aInt - 1][bInt - 1] = 'X';
        } else {
            System.out.println("Coordinates should be from 1 to 3!");
        }
    }

    boolean examinationFullMatrix() {
        boolean iBoolean = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                iBoolean = arrayField[i][j] == 'X' | arrayField[i][j] == 'O';
                if (!iBoolean) {
                    return false;
                }
            }
        }
        return true;
    }

    void printArrayField() {
        System.out.println("-------\n"
                + "|" + arrayField[0][0] + " " + arrayField[0][1] + " " + arrayField[0][2] + "|\n"
                + "|" + arrayField[1][0] + " " + arrayField[1][1] + " " + arrayField[1][2] + "|\n"
                + "|" + arrayField[2][0] + " " + arrayField[2][1] + " " + arrayField[2][2] + "|\n"
                + "-------");
    }
}
