package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        String string_s = "";

        while (true) {
            if (string_s.equals("buy")) {
                coffeeMachine.startingCoffeeMachine();
                string_s = "";
            } else if (string_s.equals("fill")) {

            } else if (string_s.equals("take")) {

            } else if (string_s.equals("exit")) {
                break;
            } else {
                System.out.println("Write action (buy, fill, take, exit):");
                string_s = s.nextLine();
            }
        }
    }

    void startingCoffeeMachine() {
        Scanner s = new Scanner(System.in);
        Ingredients ingredients = new Ingredients();

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int coffee_s = s.nextInt();
        System.out.println(ingredients.examinationCupsCoffee(coffee_s));
    }
}
