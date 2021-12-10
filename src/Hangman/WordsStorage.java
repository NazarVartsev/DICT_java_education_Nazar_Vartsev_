package Hangman;

import java.util.Random;

public class WordsStorage {
    private String word;
    private String word_dash = "";
    private final String[] words_list = {"python", "java", "hot dog", "Mia Khalifa"};

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

    String getWord() {
        return word;
    }

    String getWord_dash() {
        return word_dash;
    }
}