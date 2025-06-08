import adapter.Computer;
import adapter.MemoryCard;
import adapter.MemoryCardAdapter;
import adapter.Usb;
import factory.Coffee;
import factory.CoffeeType;
import factory.FactoryCoffee;
import proxy.Database;
import proxy.DatabaseProxy;
import proxy.IDatabase;
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

        /**
         * Adapter
         */
        Computer computer = new Computer();
        MemoryCardAdapter memoryCardAdapter = new MemoryCardAdapter(new MemoryCard());
        computer.read(memoryCardAdapter);
        System.out.println("\n");

        /**
         * Proxy
         */
        IDatabase database = new DatabaseProxy(new Database());
        System.out.println(database.connect());
    }
}