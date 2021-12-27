package TicTacToe;

public class WinOrLose {

    boolean examinationOneElement(char[] arrayJ, char symbolArrayCharXO) {
        boolean iBoolean = true;
        boolean booleanCharField;
        for (int j = 0; j <= 2; j++) {
            booleanCharField = arrayJ[j] == symbolArrayCharXO;
            iBoolean = iBoolean & booleanCharField;
            if (!iBoolean) {return false;}
        }
        return true;
    }
}
