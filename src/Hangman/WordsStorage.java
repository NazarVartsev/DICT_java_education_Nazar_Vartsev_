package Hangman;

import java.util.Random;

public class WordsStorage {
    private String word;
    private String word_dash = "";
    private final String[] words_list = {"python", "java", "hot dog", "Mia Khalifa"};
    final char[] wrong_litter = new char[70];
    private int i_wrong_litter = 0;

    // Выбор и сокрытие слова
    void hidingWord() {
        Random r = new Random();
        int a_i = r.nextInt(3);
        word = words_list[a_i];
        String dash = "-";
        int len_word_r = word.length() - 1;
        for (int i = 0; i <= len_word_r; i++) {
            word_dash += dash;
        }
    }

    void openOneLitterWord(char a) {
        char[] word_dash_Array = word_dash.toCharArray();
        for (int i = 0; i <= word.length() - 1; i++) {
            if (a == word_dash_Array[i]) {
                System.out.println("");
                break;
            } else if (a == word.charAt(i)) {
                word_dash_Array[i] = a;
            }
        }
        String word_dash_i = "";
        for (int i = 0; i <= word_dash.length() - 1; i++) {
            word_dash_i += word_dash_Array[i];
        }
        word_dash = word_dash_i;
    }

    boolean checkLitterWord_dash(char char_s) {
        int a = word.length();
        for (int i = 0; i < a; i++) {
            if (char_s == word_dash.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    boolean getBooleanWrong_litter(char char_s) {
        for (int i = 0; i <= i_wrong_litter; i++) {
            if (char_s == wrong_litter[i]){
                return true;
            }
        }
        return false;
    }

    void appendWrong_litter(char a) {
        wrong_litter[i_wrong_litter] = a;
        i_wrong_litter++;
    }

    String getWord() {
        return word;
    }

    String getWord_dash() {
        return word_dash;
    }
}