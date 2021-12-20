package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Ingredients ingredients = new Ingredients();

        System.out.println("""
                Starting to make a coffee
                Grinding coffee beans
                Boiling water
                Mixing boiled water with crushed coffee beans
                Pouring coffee into the cup
                Pouring some milk into the cup
                Coffee is ready!""");

        System.out.println("Write how many cups of coffee you will need:");
        int cups = s.nextInt();
        System.out.println(ingredients.multiplicationIngredientsCups(cups));
    }
}
