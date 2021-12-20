package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Ingredients ingredients = new Ingredients();

        System.out.println("Write how many ml of water the coffee machine has:");
        int water = s.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = s.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffee_beans = s.nextInt();
        ingredients.assignmentIngredients(water, milk, coffee_beans); // Заносим ингредиенты в машину

        System.out.println("Write how many cups of coffee you will need:");
        int cups = s.nextInt();
        System.out.println(ingredients.examinationCupsCoffee(cups));
    }
}
