package homework;


import java.util.logging.Logger;

public class Order {
    private int number;
    private String name;
    private static final Logger LOGGER = Logger.getLogger(Order.class.getName());

    public Order(String name) {
        this.name = name;
        LOGGER.info("New order for: " + name);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
