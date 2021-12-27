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

        char[][] arrayField = ticTacToe.arrayField;
        arrayFieldFlip = ticTacToe.examinationFlipMatrix(arrayFieldFlip);
        boolean booleanNumberXO = numberX - 1 > numberO | numberO - 1 > numberX;

        boolean booleanArrayField1 = ticTacToe.examinationXO(winOrLose, arrayCharXO_[0], arrayField);
        if (!booleanArrayField1){
            booleanArrayField1 = ticTacToe.examinationXO(winOrLose, arrayCharXO_[0], arrayFieldFlip);
        }
        boolean booleanArrayField2 = ticTacToe.examinationXO(winOrLose, arrayCharXO_[1], arrayField);
        if (!booleanArrayField2) {
            booleanArrayField2 = ticTacToe.examinationXO(winOrLose, arrayCharXO_[1], arrayFieldFlip);
        }

        System.out.println("-------\n"
                + "|" + arrayFieldFlip[0][0] + " " + arrayFieldFlip[0][1] + " " + arrayFieldFlip[0][2] + "|\n"
                + "|" + arrayFieldFlip[1][0] + " " + arrayFieldFlip[1][1] + " " + arrayFieldFlip[1][2] + "|\n"
                + "|" + arrayFieldFlip[2][0] + " " + arrayFieldFlip[2][1] + " " + arrayFieldFlip[2][2] + "|\n"
                + "-------");

        System.out.println(booleanDash);
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
}
