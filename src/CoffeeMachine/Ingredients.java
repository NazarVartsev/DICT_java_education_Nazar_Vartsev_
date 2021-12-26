package CoffeeMachine;

import java.util.Scanner;

public class Ingredients {
    private final int waterOneCup = 200;
    private final int milkOneCup = 50;
    private final int coffee_beansOneCup = 15;
    private int water = 400;
    private int milk = 540;
    private int coffee_beans = 120;
    private int cups = 9;
    private int money = 550;

    /*private boolean multiplicationIngredientsCups(int cups) {
        int waterMultiplication = waterOneCup * cups;
        int milkMultiplication = milkOneCup * cups;
        int coffee_beansMultiplication = coffee_beansOneCup * cups;
        return waterMultiplication <= water ^ milkMultiplication <= milk ^ coffee_beansMultiplication <= coffee_beans;
    }*/

    /*private int examinationCupsMake() {
        int i = 0;
        while (multiplicationIngredientsCups(i)) {
            i++;
        }
        return i - 1;
    }*/

    /*String examinationCupsCoffee(int cups) {
        int iCups = examinationCupsMake();
        int iCupsSurplus = iCups - cups;

        if (iCupsSurplus > 0) {
            return "Yes, I can make that amount of coffee (and even " + iCupsSurplus + " more than that)";
        } else if (iCupsSurplus == 0) {
            return "Yes, I can make that amount of coffee";
        } else {
            return "No, I can make only " + iCups + " cups of coffee";
        }
    }*/



    /*void assignmentIngredients(int water_i, int milk_i, int coffee_beans_i) {
        water = water_i;
        milk = milk_i;
        coffee_beans = coffee_beans_i;
    }*/

    void cookingCoffee(int coffee_s) {
        if (coffee_s == 1) {
            water -= 250;
            coffee_beans -= 16;
            cups -= 1;
            money += 4;
        } else if (coffee_s == 2) {
            water -= 350;
            milk -= 75;
            coffee_beans -= 20;
            cups -= 1;
            money += 7;
        } else if (coffee_s == 3) {
            water -= 200;
            milk -= 100;
            coffee_beans -= 12;
            cups -= 1;
            money += 6;
        }
    }

    void fillIngredients() {
        Scanner s = new Scanner(System.in);
        int iWater;
        int iMilk;
        int iCoffeeBeans;
        int iCups;

        System.out.println("Write how many ml of water you want to add:");
        iWater = s.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        iMilk = s.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        iCoffeeBeans = s.nextInt();
        System.out.println("Write how many disposable coffee cups you want to add:");
        iCups = s.nextInt();

        water += iWater;
        milk += iMilk;
        coffee_beans += iCoffeeBeans;
        cups += iCups;
    }

    void takeMoney() {
        System.out.println("I gave you " + money);
        money = 0;
    }

    void printIngredients() {
        System.out.println("The coffee machine has:\n"
        + water + " of water\n"
        + milk + " of milk\n"
        + coffee_beans + " of coffee beans\n"
        + cups + " of disposable cups\n"
        + money + " of money\n");
    }
}
