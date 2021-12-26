package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Ingredients ingredients = new Ingredients();
        String string_s = "";

        while (true) {
            System.out.println("Write action (buy, fill, take, exit):");
            string_s = s.nextLine();
            if (string_s.equals("buy")) {
                ingredients = coffeeMachine.startingCoffeeMachine(ingredients);
            } else if (string_s.equals("fill")) {
                ingredients.fillIngredients();
                ingredients.printIngredients();
            } else if (string_s.equals("take")) {
                ingredients.takeMoney();
                ingredients.printIngredients();
            } else if (string_s.equals("exit")) {
                break;
            }
        }
    }

    Ingredients startingCoffeeMachine(Ingredients ingredients) {
        Scanner s = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int coffee_s = s.nextInt();
        ingredients.cookingCoffee(coffee_s);
        ingredients.printIngredients();
        return ingredients;
    }
}
