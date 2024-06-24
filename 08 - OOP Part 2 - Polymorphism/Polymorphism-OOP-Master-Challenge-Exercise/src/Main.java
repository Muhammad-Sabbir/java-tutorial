public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("drink","coke", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("Topping","avocado", 1.50);
//        avocado.printItem();
//
//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("BACON","CHEESE","MAYO");
//        burger.printItem();
        MealOrder regularMeal = new MealOrder();

        regularMeal.addBurgerToppings("BEACON","CHEESE","MAYO");
        regularMeal.setDrinkSize("LARGE");
        regularMeal.printItemizedList();

        System.out.println("**************************");

        MealOrder secondMeal = new MealOrder("turkey", "7-up","chili");
        secondMeal.addBurgerToppings("LETTUCE","CHEESE", "MAYO");
        secondMeal.printItemizedList();

        System.out.println("**************************");

        MealOrder deluxMeal = new MealOrder("deluxe", "7-up","chili");
        deluxMeal.addBurgerToppings("AVOCADO","BACON","LETTUCE","CHEESE", "MAYO");
        deluxMeal.setDrinkSize("SMALL");
        deluxMeal.printItemizedList();

    }
}
