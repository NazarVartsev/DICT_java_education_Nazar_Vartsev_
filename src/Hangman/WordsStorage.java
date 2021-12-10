package Hangman;

import java.util.Random;

public class WordsStorage {
    private String word;
    private final String[] words_list = {"python", "java", "hot dog", "Mia Khalifa"};

    String hidingWords() {
        String word_dash_out;

        Random r = new Random();
        int a_i = r.nextInt(3);
        word = words_list[a_i];
        String word_dash = "";
        String dash = "-";
        int len_word_r = word.length() - 1;
        int two_len_word_r = len_word_r - 2;
        for (int i = 0; i <= two_len_word_r; i++) {
            word_dash += dash;
        }
        return word_dash_out = "" + word.charAt(0) + word.charAt(1) + word_dash;
    }

    String getWord() {
        return word;
    }
}