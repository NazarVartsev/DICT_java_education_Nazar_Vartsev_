package Hangman;

import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        WordsStorage wor = new WordsStorage();

        // Начало
        System.out.println("HANGMAN");
        System.out.println("The game will be available soon.");

        // Проверка введенного слова
        System.out.println("Guess the word:");
        String out_answer = s.nextLine();
        for (int i = 0; i < 4; i++) {
            if (Objects.equals(wor.words_list[i], out_answer)) {
                System.out.println("You survived!");
                break;
            }
            int a_i = r.nextInt(3);
            if (Objects.equals(wor.words_list[a_i], out_answer)) {
                System.out.println("You survived!");
            } else {
                System.out.println("You lost!");
            }
            System.out.println("You lost!");
        }
    }
}