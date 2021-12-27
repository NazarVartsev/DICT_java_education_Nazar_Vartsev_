package CoffeeMachine;

import java.util.Scanner;

public class Ingredients {
    private int water = 400;
    private int milk = 540;
    private int coffee_beans = 120;
    private int cups = 9;
    private int money = 550;
    private int waterOneCup;
    private int milkOneCup;
    private int coffee_beansOneCup;

    private void examinationIngredients() {
        boolean waterBoolean = water < 0;
        boolean milkBoolean = milk < 0;
        boolean coffee_beansBoolean = coffee_beans < 0;
        boolean cupsBoolean = cups < 0;

        if (waterBoolean | milkBoolean | coffee_beansBoolean | cupsBoolean) {
            System.out.println("I have enough resources, making you a coffee!");
            water += waterOneCup;
            milk += milkOneCup;
            coffee_beans += coffee_beansOneCup;
            cups += 1;
        }
    }

    void cookingCoffee(int coffee_s) {
        if (coffee_s == 1) {
            water -= 250;
            coffee_beans -= 16;
            cups -= 1;
            money += 4;
            waterOneCup = 250;
            milkOneCup = 16;
            coffee_beansOneCup = 16;
        } else if (coffee_s == 2) {
            water -= 350;
            milk -= 75;
            coffee_beans -= 20;
            cups -= 1;
            money += 7;
            waterOneCup = 350;
            milkOneCup = 75;
            coffee_beansOneCup = 20;
        } else if (coffee_s == 3) {
            water -= 200;
            milk -= 100;
            coffee_beans -= 12;
            cups -= 1;
            money += 6;
            waterOneCup = 200;
            milkOneCup = 100;
            coffee_beansOneCup = 12;
        }
        examinationIngredients();
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
