package factory;

import java.util.Scanner;
public class CoffeeMachineUI {
    public void start() {
        int typeInput = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Выберите напиток: \n1 - factory.Americano \n2 - factory.Espresso \n0 - Exit");
            try {
                typeInput = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Введите число!");
                scanner.nextLine();
                continue;
            }

            switch (typeInput) {
                case 1:
                    this.make(CoffeeType.AMERICANO);
                    break;
                case 2:
                    this.make(CoffeeType.ESPRESSO);
                    break;
                case 0:
                    System.out.println("Хорошего дня!");
                    break;
                default:
                    System.out.println("Не верный выбор");
            }
        } while(typeInput != 0);
    }
    private void make(CoffeeType type) {
        ICoffee coffee = CoffeeFactory.getCoffee(type);
        CoffeeMachine coffeeMachine = new CoffeeMachine(coffee);
        coffeeMachine.makeCoffee();
    }
}
