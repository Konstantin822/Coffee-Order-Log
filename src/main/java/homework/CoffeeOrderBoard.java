package homework;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class CoffeeOrderBoard {
    private List<Order> orders;
    private static final Logger LOGGER = Logger.getLogger(CoffeeOrderBoard.class.getName());

    public CoffeeOrderBoard() {
        orders = new ArrayList<>();
        LOGGER.info("New Coffee Order Board created");
    }

    public void add(Order order) {
        int orderNumber = orders.size() + 1;
        order.setNumber(orderNumber);
        orders.add(order);
        LOGGER.info("Added order #" + orderNumber + " for " + order.getName());
    }

    public void deliver() {
        if (!orders.isEmpty()) {
            Order nextOrder = orders.get(0);
            System.out.println(nextOrder.getNumber() + " for " + nextOrder.getName());
            LOGGER.info("Delivered order #" + nextOrder.getNumber() + " for " + nextOrder.getName());
            orders.remove(0);
            System.out.println("No orders");
            LOGGER.info("No orders to deliver");
        }
    }

    public void deliver(int orderNumber) {
            Order foundOrder = null;
            for (Order order : orders) {
                if (order.getNumber() == orderNumber) {
                    foundOrder = order;
                    break;
                }
            }
            if (foundOrder != null) {
                System.out.println(foundOrder.getNumber() + " for " + foundOrder.getName());
                LOGGER.info("Delivered order #" + foundOrder.getNumber() + " for " + foundOrder.getName());
                orders.remove(foundOrder);
            } else {
                System.out.println("No order");
                LOGGER.info("No order found");
            }
    }

    public void draw() {
        LOGGER.info("Drawing coffee order board");
        for (Order order : orders) {
            System.out.println(order.getNumber() + " | " + order.getName());
        }
    }
}
