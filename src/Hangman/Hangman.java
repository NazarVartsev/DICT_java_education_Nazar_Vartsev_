package Hangman;

import java.util.Objects;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        WordsStorage wor = new WordsStorage();

        // Начало
        System.out.println("HANGMAN");
        System.out.println("The game will be available soon.");

        // Проверка введенного слова
        wor.hidingWord();
        String word_dash_old = wor.getWord_dash();
        int a = 8;
        while (a > 0) {
            System.out.println("Enter letter:");
            System.out.println(wor.getWord_dash());
            String litter_s = s.nextLine();
            char char_s = litter_s.charAt(0);
            String i_string = "[A-z]";
            if (litter_s.length() != 1) {
                System.out.println("You should input a single letter.");
                continue;
            } else if (!litter_s.matches(i_string)) {
                System.out.println("Please enter a lowercase English letter.");
                continue;
            }
            wor.openOneLitterWord(char_s);
            if (Objects.equals(wor.getWord_dash(), wor.getWord())) {
                System.out.println("You survived!");
                break;
            }
            // Проверка на правильность введенной буквы
            if (!Objects.equals(word_dash_old, wor.getWord_dash())) {
                word_dash_old = wor.getWord_dash();
                continue;
            }

            // Проверка на одну и ту же самую букву и неправильную букву
            boolean i_boolean = wor.checkLitterWord_dash(char_s);
            if (i_boolean) {
                System.out.println("You've already guessed this letter.");
            } else if (wor.getBooleanWrong_litter(char_s)) {
                System.out.println("You've already guessed this letter.");
            } else {
                wor.appendWrong_litter(char_s);
                System.out.println("That letter doesn't appear in the word.");
                a--;
            }
        }
        if (!Objects.equals(wor.getWord_dash(), wor.getWord())) {
            System.out.println("You lost!");
        }
    }
}