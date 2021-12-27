package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    static final char[] arrayCharXO_ = {'X', 'O', '_'};

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TicTacToe ticTacToe = new TicTacToe();
        char[][] arrayField = new char[3][3];
        char[] arrayJ = new char[3];
        String stringField;
        int iForArray = 0;
        boolean iBooleanXO_ = false;

        do {
            System.out.print("Enter cells: ");
            stringField = s.nextLine();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++){
                    iBooleanXO_ = ticTacToe.examinationXO_(stringField.charAt(i));
                    if (iBooleanXO_) {break;}
                    arrayField[i][j] = stringField.charAt(iForArray);
                    iForArray++;
                }
                if (iBooleanXO_) {break;}
            }
        } while (iBooleanXO_);
        System.out.println("-------\n"
                + "|" + arrayField[0][0] + " " + arrayField[0][1] + " " + arrayField[0][2] + "|\n"
                + "|" + arrayField[1][0] + " " + arrayField[1][1] + " " + arrayField[1][2] + "|\n"
                + "|" + arrayField[2][0] + " " + arrayField[2][1] + " " + arrayField[2][2] + "|\n"
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
