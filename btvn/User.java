package btvn;

import java.util.ArrayList;
import java.util.List;

abstract class User {
    protected String name;
    protected List<Order> orders;

    public User(String name) {
        this.name = name;
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public abstract int getType();
}
