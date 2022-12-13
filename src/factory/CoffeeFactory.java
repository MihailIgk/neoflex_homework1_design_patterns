package factory;

public class CoffeeFactory {
    public static ICoffee getCoffee(CoffeeType coffeeType) {
        switch (coffeeType) {
            case AMERICANO:
                return new Americano();
            case ESPRESSO:
                return new Espresso();
            default:
                return new Americano();
        }
    }
}
