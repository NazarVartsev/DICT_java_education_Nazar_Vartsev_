package CoffeeMachine;

public class Ingredients {
    private final int waterOneCup = 200;
    private final int milkOneCup = 50;
    private final int coffee_beansOneCup = 15;
    private int water;
    private int milk;
    private int coffee_beans;

    /*private boolean multiplicationIngredientsCups(int cups) {
        int waterMultiplication = waterOneCup * cups;
        int milkMultiplication = milkOneCup * cups;
        int coffee_beansMultiplication = coffee_beansOneCup * cups;
        return waterMultiplication <= water ^ milkMultiplication <= milk ^ coffee_beansMultiplication <= coffee_beans;
    }

    private int examinationCupsMake() {
        int i = 0;
        while (multiplicationIngredientsCups(i)) {
            i++;
        }
        return i - 1;
    }

    String examinationCupsCoffee(int cups) {
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
}
