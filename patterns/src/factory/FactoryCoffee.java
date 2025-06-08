package factory;

public class FactoryCoffee {

    public Coffee getCoffee(CoffeeType coffeeType){
        return switch (coffeeType) {
            case AMERICANO -> new Americano();
            case ESPRESSO -> new Espresso();
            default -> throw new IllegalArgumentException();
        };
    }
}
