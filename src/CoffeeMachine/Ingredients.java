package CoffeeMachine;

public class Ingredients {
    private final int water = 200;
    private final int milk = 50;
    private final int coffee_beans = 15;

    String multiplicationIngredientsCups(int cups) {
        String stringIngredientsDoYouNeed;

        int waterMultiplication = water * cups;
        int milkMultiplication = milk * cups;
        int coffee_beansMultiplication = coffee_beans * cups;
        return stringIngredientsDoYouNeed = "For " + cups + " cups of coffee you will need:\n"
                + waterMultiplication + " ml of water\n"
                + milkMultiplication + " ml of milk\n"
                + coffee_beansMultiplication + " g of coffee beans\n";
    }
}
