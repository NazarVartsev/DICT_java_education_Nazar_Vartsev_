package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    static final char[] arrayCharXO_ = {'X', 'O', '_'};

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TicTacToe ticTacToe = new TicTacToe();
        char[] arrayField = new char[9];
        String stringField;
        int iForArray = 0;
        boolean iBooleanXO_ = false;

        do {
            System.out.print("Enter cells: ");
            stringField = s.nextLine();
            for (int i = 0; i < 9; i++) {
                iBooleanXO_ = ticTacToe.examinationXO_(stringField.charAt(i));
                if (iBooleanXO_) {
                    break;
                }
                arrayField[i] = stringField.charAt(i);
            }
        } while (iBooleanXO_);
        System.out.println("-------\n"
                + "|" + arrayField[0] + " " + arrayField[1] + " " + arrayField[2] + "|\n"
                + "|" + arrayField[3] + " " + arrayField[4] + " " + arrayField[5] + "|\n"
                + "|" + arrayField[6] + " " + arrayField[7] + " " + arrayField[8] + "|\n"
                + "-------");
    }

    boolean examinationXO_(char charField) {
        for (int i = 0; i <= 2; i++) {
            if (charField == arrayCharXO_[i])
                return false;
        }
        return true;
    }
}
