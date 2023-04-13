import homework.CoffeeOrderBoard;
import homework.Order;

import java.util.logging.*;


public class main {
    public static void main(String[] args) {
        Logger LOGGER = Logger.getLogger("Coffee Order log");
        FileHandler fileHandler;

        try {
            fileHandler = new FileHandler("coffee-order-board.log", true);
            LOGGER.addHandler(fileHandler);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);

            LOGGER.setLevel(Level.ALL);
            LOGGER.info("Start");
        } catch (Exception e) {
            e.printStackTrace();
        }

        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        Order order1 = new Order("Bob");
        Order order2 = new Order("John");
        Order order3 = new Order("Yoda");
        Order order4 = new Order("Jack");

        coffeeOrderBoard.add(order1);
        coffeeOrderBoard.add(order2);
        coffeeOrderBoard.add(order3);
        coffeeOrderBoard.add(order4);

        System.out.println("Orders ");
        coffeeOrderBoard.draw();
        System.out.println();

        System.out.print("Deliver order #");
        coffeeOrderBoard.deliver();
        System.out.println();

        System.out.println("Orders");
        coffeeOrderBoard.draw();
        System.out.println();

        System.out.print("Deliver order #");
        coffeeOrderBoard.deliver(2);
        System.out.println();

        System.out.println("Orders ");
        coffeeOrderBoard.draw();
    }
}
