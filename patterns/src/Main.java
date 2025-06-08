import factory.Coffee;
import factory.CoffeeType;
import factory.FactoryCoffee;
import singleton.Logger;

public class Main {
    public static void main(String[] args) {
        /**
         * Singleton
         */
        Logger logger = Logger.getInstance();
        Logger logger1 = Logger.getInstance();
        System.out.println("\n"+"result of equals == "+logger.equals(logger1));
        System.out.println(logger.doLog(logger, "some info \n"));

        /**
         * Factory
         */
        FactoryCoffee factoryCoffee = new FactoryCoffee();
        Coffee coffee = factoryCoffee.getCoffee(CoffeeType.ESPRESSO);
        System.out.println(coffee.getName());
        Coffee coffee1 = factoryCoffee.getCoffee(CoffeeType.AMERICANO);
        System.out.println(coffee1.getName() + "\n");
    }
}