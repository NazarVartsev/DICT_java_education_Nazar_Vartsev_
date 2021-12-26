package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Ingredients ingredients = new Ingredients();
        String string_s = "";

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            string_s = s.nextLine();
            if (string_s.equals("buy")) {
                ingredients = coffeeMachine.buyCoffee(ingredients);
            } else if (string_s.equals("fill")) {
                ingredients = coffeeMachine.fillCoffeeMachine(ingredients);
            } else if (string_s.equals("take")) {
                ingredients = coffeeMachine.takeFromCoffeeMachineMoney(ingredients);
            } else if (string_s.equals("exit")) {
                break;
            } else if (string_s.equals("remaining")){
                ingredients.printIngredients();
            }
        }
    }

    Ingredients buyCoffee(Ingredients ingredients) {
        Scanner s = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, 4 – to\n" +
                "main menu:");
        int coffee_s = s.nextInt();
        if (coffee_s == 4)
            return ingredients;
        ingredients.cookingCoffee(coffee_s);
        return ingredients;
    }

    Ingredients fillCoffeeMachine(Ingredients ingredients) {
        ingredients.fillIngredients();
        return ingredients;
    }

    Ingredients takeFromCoffeeMachineMoney(Ingredients ingredients) {
        ingredients.takeMoney();
        return ingredients;
    }
}
