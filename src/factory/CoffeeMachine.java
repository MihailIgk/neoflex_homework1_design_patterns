package factory;

public class CoffeeMachine {
    ICoffee coffee;
    public CoffeeMachine(ICoffee coffee) {
        this.coffee = coffee;
        System.out.println("Вы выбрали " + coffee.getName());
    }
    public void makeCoffee() {
        System.out.println("Идет приготовление напитка ...");
        System.out.println("Ваш " + coffee.getName() + " готов");
    }

}
