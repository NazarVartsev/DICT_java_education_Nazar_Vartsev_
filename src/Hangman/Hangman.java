package Hangman;
import java.util.Objects;
import java.util.Scanner;

// Appdata 4 !!!

public class Hangman {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        WordsStorage wor = new WordsStorage();
        // Начало
        System.out.println("HANGMAN");
        System.out.println("The game will be available soon.");
        // Проверка введенного слова
        System.out.println("Guess the word:");
        String word_dash = wor.hidingWords();
        System.out.println(word_dash);
        String word_s = s.nextLine();
        if (Objects.equals(word_s, wor.getWord())) {
            System.out.println("You survived!");
        } else {
            System.out.println("You lost!");
        }
    }
}