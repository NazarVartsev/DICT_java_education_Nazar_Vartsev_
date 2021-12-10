package Hangman;

import java.util.Objects;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        WordsStorage wor = new WordsStorage();

        System.out.println("HANGMAN");
        System.out.println("The game will be available soon.");

        System.out.println("Guess the word:");
        String out_answer = s.nextLine();
        for (int i = 0; i < 4; i++) {
            if (Objects.equals(wor.words_list[i], out_answer)) {
                System.out.println("You survived!");
                break;
            }
        }
        System.out.println("You lost!");
    }
}