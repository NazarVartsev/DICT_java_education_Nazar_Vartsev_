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
            wor.openOneLitterWord(char_s);
            if (Objects.equals(wor.getWord_dash(), wor.getWord())) {
                System.out.println("You survived!");
                break;
            }
            if (!Objects.equals(word_dash_old, wor.getWord_dash())) {
                word_dash_old = wor.getWord_dash();
                continue;
            }
            boolean i_boolean = wor.checkLitterWord_dash(char_s);
            if (i_boolean) {
                System.out.println("No improvements");
                a--;
            } else {
                System.out.println("That letter doesn't appear in the word");
                a--;
            }
        }
        if (!Objects.equals(wor.getWord_dash(), wor.getWord())) {
            System.out.println("You lost!");
        }
    }
}